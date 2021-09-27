package repository;

import model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoUser extends JpaRepository<Users, Long> {
    Users findByUsername(String name);
}
