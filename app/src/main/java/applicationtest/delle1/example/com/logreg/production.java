package applicationtest.delle1.example.com.logreg;

public class production {
    private int id;
    private String name;
    private int price;
    private String description;

    //Constructor

    public production(int id, String name, String description) {
        this.id = id;
        this.name = name;

        this.description = description;
    }

    //Setter, getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

