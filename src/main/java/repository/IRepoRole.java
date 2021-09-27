package repository;

import model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoRole extends JpaRepository<Role, Long> {
}
