package dlrtn.user.business.model.domain;

import dlrtn.user.business.model.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
public class User {

    private String email;

    private String username;

    private String password;

    private String nickname;

    private UserRole userRole;

}
