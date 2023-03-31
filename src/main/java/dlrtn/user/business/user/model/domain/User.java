package dlrtn.user.business.user.model.domain;

import dlrtn.user.business.user.model.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

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
