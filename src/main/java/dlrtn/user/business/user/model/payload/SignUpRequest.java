package dlrtn.user.business.user.model.payload;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class SignUpRequest {

    @Email
    private final String email;

    @NotBlank
    private final String username;

    @NotBlank
    private final String password;

    @NotBlank
    private final String nickname;

}
