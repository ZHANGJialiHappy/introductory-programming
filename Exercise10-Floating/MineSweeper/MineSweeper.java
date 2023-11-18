import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public abstract class MineSweeper {

    private MineField mineField;
    private Map<Coord, Integer> visitedSquares;
    private Set<Coord> markedSquares;
    private int numFreeSquares;
    private boolean gameOver;

    public MineSweeper(int width, int height, int numMines) {
        this.mineField = new MineField(width, height, numMines);
        visitedSquares = new HashMap<Coord, Integer>();
        markedSquares = new HashSet<Coord>();
        numFreeSquares = mineField.getWidth() * mineField.getHeight() - mineField.getNumMines();
    }

    protected int getWidth() {
        return mineField.getWidth();
    }

    protected int getHeight() {
        return mineField.getHeight();
    }

    protected boolean hasMine(Coord coord) {
        return gameOver && mineField.hasMine(coord);
    }

    protected boolean isMarked(Coord coord) {
        return markedSquares.contains(coord);
    }

    protected boolean isGameOver() {
        return gameOver;
    }

    protected int adjacentMines(Coord coord) {
        return visitedSquares.getOrDefault(coord, -1);
    }

    private void gameOver() {
        gameOver = true;
    }

    private void walkFieldAux(Coord coord, Map<Coord, Integer> result) {
        if (visitedSquares.containsKey(coord) || 
            markedSquares.contains(coord) || 
            !mineField.inside(coord)) { 
            return; 
        }

        int adjacentMines = mineField.adjacentMines(coord);
        result.put(coord, adjacentMines);
        visitedSquares.put(coord, adjacentMines);

        if(adjacentMines == 0) {
            walkFieldAux(coord.offset(-1, 0), result);
            walkFieldAux(coord.offset(-1, -1), result);
            walkFieldAux(coord.offset(0, -1), result);
            walkFieldAux(coord.offset(1, -1), result);
            walkFieldAux(coord.offset(1, 0), result);
            walkFieldAux(coord.offset(1, 1), result);
            walkFieldAux(coord.offset(0, 1), result);
            walkFieldAux(coord.offset(-1, 1), result);
        }
    }

    public Map<Coord, Integer> walkField(Coord coord) {
        Map<Coord, Integer> result = new HashMap<Coord, Integer>();
        walkFieldAux(coord, result);
        return result;
    }

    public void markSquare(Coord coord) {
        if (gameOver || visitedSquares.containsKey(coord)) { 
            onSkip();
        }
        else if(markedSquares.contains(coord)) {
            markedSquares.remove(coord);
            onUnmark(coord);
        }
        else {
            markedSquares.add(coord);
            onMark(coord);
        }
    }

    public void step(Coord coord) {
        if(isMarked(coord)) { onSkip(); return; }

        if(mineField.hasMine(coord)) { 
            gameOver();
            onLose();
            return;
        }

        Map<Coord, Integer> newSquares = walkField(coord);
        if(visitedSquares.size() == numFreeSquares) {
            gameOver();
            onWin();
            return;
        }

        onStep(newSquares);
    }

    protected abstract void onStep(Map<Coord, Integer> revealedSquares);
    protected abstract void onMark(Coord coord);
    protected abstract void onUnmark(Coord coord);
    protected abstract void onWin();
    protected abstract void onLose();
    protected abstract void onSkip();
}
