package homework5;

public class Swan extends Birds implements CanSwim, CanEat
{
    public Swan(String name, String type) {
        super(name, type);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void canSwim() {

    }

    @Override
    public void canEat() {

    }



}

