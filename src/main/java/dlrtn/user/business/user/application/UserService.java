package dlrtn.user.business.user.application;

import dlrtn.user.business.user.model.domain.User;
import dlrtn.user.business.user.model.payload.SignUpRequest;
import dlrtn.user.business.user.repository.UserMyBatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMyBatisRepository userMyBatisRepository;

    public void signUp(SignUpRequest request) {
        //todo : nickname
        //todo : password encoding

        User user = User.builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .nickname(request.getNickname())
                .build();

        userMyBatisRepository.saveUser(user);
    }

    public void login() {
        //todo : login

    }

}
