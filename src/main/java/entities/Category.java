package entities;

import javax.persistence.*;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "categoryID")
    private int categoryId;
    @Column(name = "categorynaam")
    private String categoryNaam;
    @Column(name = "subcategory", nullable = true)
    private Category parent;

    public Category(String categoryNaam, Category parent) {
        this.categoryNaam = categoryNaam;
        this.parent = parent;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryNaam() {
        return categoryNaam;
    }

    public void setCategoryNaam(String categoryNaam) {
        this.categoryNaam = categoryNaam;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }
}
