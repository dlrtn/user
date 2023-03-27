package dlrtn.user.business.model.payload;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignUpRequest {

    private final String email;

    private final String username;

    private final String password;

    private final String nickname;

}
