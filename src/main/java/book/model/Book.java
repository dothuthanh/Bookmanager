package book.model;

import javax.persistence.*;
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    public Book(){

    }
    @Override
    public String toString() {
        return String.format("Book[id=%d, name='%s', author='%s']", id, name, author);
    }

    public Book(Long id,String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
