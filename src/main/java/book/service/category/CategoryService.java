package book.service.category;


import book.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();
    void save(Category category);
    void remove(Long id);
    Category findById(Long id);
}
