package service.role;

import model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IRepoRole;

import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRepoRole repoRole;

    @Override
    public Iterable<Role> getAll() {
        return repoRole.findAll();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return repoRole.findById(id);
    }

    @Override
    public Role save(Role role) {
        return repoRole.save(role);
    }

    @Override
    public void delete(Long id) {
        repoRole.deleteById(id);
    }
}
