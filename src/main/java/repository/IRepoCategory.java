package repository;

import model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoCategory extends JpaRepository<Category, Long> {
}
