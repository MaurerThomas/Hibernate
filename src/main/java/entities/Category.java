package entities;

/**
 * Created by Thomas on 17-6-2015.
 */
public class Category {

    private String categoryNaam;
    private Category parent;

    public Category(String categoryNaam, Category parent) {
        this.categoryNaam = categoryNaam;
        this.parent = parent;
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
