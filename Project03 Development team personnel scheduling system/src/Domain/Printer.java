package Domain;


public class Printer implements Equipment {
    private String type;
    private String name;

    public Printer() {
    }

    public Printer(String type, String name) {
        super();
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return type + "(" + name + ")";
    }

    @Override
    public String getDescription() {
        return toString();
    }
}
