package homework5;

public class Platypus implements CanSwim, CanEat
{
    private String name;
    private String type;

    public Platypus(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void canEat() {

    }

    @Override
    public void canSwim() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
