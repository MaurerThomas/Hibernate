package entities;

import javax.persistence.*;
import java.util.List;

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
    @ManyToMany
    @JoinTable(name = "cat_parent",
            joinColumns = {@JoinColumn(name = "parentID", referencedColumnName = "categoryID")},
            inverseJoinColumns = {@JoinColumn(name = "categoryID", referencedColumnName = "categoryID")})
    private List<Category> parents;
    @ManyToMany(mappedBy = "categories")
    private List<Advertentie> advertenties;


    public Category(String categoryNaam, List<Category> parents, List<Advertentie> advertenties) {
        this.categoryNaam = categoryNaam;
        this.parents = parents;
        this.advertenties = advertenties;
    }

    public List<Category> getParents() {
        return parents;
    }

    public void setParents(List<Category> parents) {
        this.parents = parents;
    }

    public List<Advertentie> getAdvertenties() {
        return advertenties;
    }

    public void setAdvertenties(List<Advertentie> advertenties) {
        this.advertenties = advertenties;
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


}
