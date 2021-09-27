package repository;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoProduct extends JpaRepository<Product, Long> {
}
