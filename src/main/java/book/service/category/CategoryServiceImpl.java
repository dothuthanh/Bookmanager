package book.service.category;

import book.model.Category;
import book.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);

    }

    @Override
    public void remove(Long id) {
        categoryRepository.delete(id);

    }

    @Override
    public Category findById(Long id) {
        categoryRepository.findOne(id);

        return null;
    }
}
