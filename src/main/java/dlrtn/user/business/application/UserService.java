package dlrtn.user.business.application;

import dlrtn.user.business.model.domain.User;
import dlrtn.user.business.model.payload.SignUpRequest;
import dlrtn.user.business.repository.UserMyBatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMyBatisRepository userMyBatisRepository;

    public void signUp(SignUpRequest request) {
        User user = User.builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(request.getPassword())
                .nickname(request.getNickname())
                .build();

        userMyBatisRepository.saveUser(user);
    }

}
