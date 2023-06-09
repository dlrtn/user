package dlrtn.user.business.user.api;

import dlrtn.user.business.user.application.UserService;
import dlrtn.user.business.user.model.payload.SignUpRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity signUpUser(@RequestBody @Valid SignUpRequest request) {
        userService.signUp(request);
        return new ResponseEntity("생성되었습니다.", HttpStatus.CREATED);
    }
}
