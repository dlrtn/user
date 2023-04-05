package dlrtn.user.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class AuthUtil {

    public String generateSalt() {
        return BCrypt.gensalt();
    }

    public String encodePassword(String salt, String password) {
        return BCrypt.hashpw(password, salt);
    }

}
