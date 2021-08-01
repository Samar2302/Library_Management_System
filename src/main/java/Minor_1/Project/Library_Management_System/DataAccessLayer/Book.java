package Minor_1.Project.Library_Management_System.DataAccessLayer;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Book_Name")
    private String name;
    @Column(name = "Category")
    private String category;
    @Column(name = "Author_Name")
    private String auth_name;
    @Column(name = "Cost")
    private int cost;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Book(String name, String category, String auth_name, int cost) {
        this.name = name;
        this.category = category;
        this.auth_name = auth_name;
        this.cost = cost;
    }

    public Book() {
    }
}
