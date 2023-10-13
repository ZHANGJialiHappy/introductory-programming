import java.util.List;

public abstract class Animal {
    protected boolean alive;
    protected Location location;
    protected Field field;

    public Animal(Field field, Location location) {
        alive = true;
        this.field = field;
        setLocation(location);
    }

    abstract void act(List<Animal> newAnimals);

    protected void setLocation(Location newLocation) {
        if (location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }

    public boolean isAlive() {
        return alive;
    }

    /**
     * Return the fox's location.
     * 
     * @return The fox's location.
     */
    public Location getLocation() {
        return location;
    }

    protected void setDead() {
        alive = false;
        if (location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }

}
