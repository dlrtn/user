package dlrtn.user.business.auth.application;

import dlrtn.user.business.user.model.domain.User;
import dlrtn.user.utils.AuthUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthService {

    private final AuthUtil authUtil;

    @Transactional
    public String encodeUserPassword(User user) {
        String salt = authUtil.generateSalt();
        String password = user.getPassword();

        return authUtil.encodePassword(salt,password);
    }

}
