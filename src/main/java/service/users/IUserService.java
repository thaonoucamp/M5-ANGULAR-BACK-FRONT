package service.users;

import model.Users;
import org.springframework.security.core.userdetails.UserDetailsService;
import service.IGenericService;

public interface IUserService extends IGenericService<Users>, UserDetailsService {
}
