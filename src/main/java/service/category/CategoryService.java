package service.category;

import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IRepoCategory;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private IRepoCategory repoCategory;

    @Override
    public Iterable<Category> getAll() {
        return repoCategory.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return repoCategory.findById(id);
    }

    @Override
    public Category save(Category category) {
        return repoCategory.save(category);
    }

    @Override
    public void delete(Long id) {
        repoCategory.deleteById(id);
    }
}
