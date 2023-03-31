package dlrtn.user.business.api;

import dlrtn.user.business.application.UserService;
import dlrtn.user.business.model.payload.SignUpRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity signUpUser(@RequestBody SignUpRequest request) {
        userService.signUp(request);
        return new ResponseEntity("생성되었습니다.", HttpStatus.CREATED);
    }
}
