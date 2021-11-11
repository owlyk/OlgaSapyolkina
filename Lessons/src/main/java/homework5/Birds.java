package homework5;

public abstract class Birds {

 private String name;
 private String type;

    public Birds(String name, String type) {
        this.name = name;
        this.type = type;
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

    @Override
    public String toString() {
        return super.toString();
    }

    public void fly()
    {
        System.out.println(name +  " is a bird");
    }
}
