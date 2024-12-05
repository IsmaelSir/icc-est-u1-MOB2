package person;

public class person {
    private String name;
    private int ege;

    public person(String name, int ege) {
        this.name = name;
        this.ege = ege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }
}
