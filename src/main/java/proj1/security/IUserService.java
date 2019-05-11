package proj1.security;

import proj1.model.security.User;
import proj1.validation.security.EmailExistsException;

public interface IUserService {
    User registerNewUserAccount(UserDto accountDto)
            throws EmailExistsException;
}