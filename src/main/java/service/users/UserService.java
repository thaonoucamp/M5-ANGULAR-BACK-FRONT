package service.users;

import model.UserDetail;
import model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repository.IRepoUser;

import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IRepoUser repoUser;

    @Override
    public Iterable<Users> getAll() {
        return repoUser.findAll();
    }

    @Override
    public Optional<Users> findById(Long id) {
        return repoUser.findById(id);
    }

    @Override
    public Users save(Users users) {
        return repoUser.save(users);
    }

    @Override
    public void delete(Long id) {
        repoUser.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = repoUser.findByUsername(username);
        // debug test username;
        return UserDetail.build(users);
    }
}
