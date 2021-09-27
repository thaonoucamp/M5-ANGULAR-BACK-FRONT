package service.product;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IRepoRole;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IRepoRole repoRole;

    @Override
    public Iterable<Product> getAll() {
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repoRole.deleteById(id);
    }
}
