public class Main {
    public static void main(String[] args) {
        
        // This is how you start the simulator
        Simulator s = new Simulator();
        s.runLongSimulation();
        
        // If you want to run shorter simulations look at:
        // s.simulateOneStep();
        // s.simulate(numSteps);
        
    }
}
