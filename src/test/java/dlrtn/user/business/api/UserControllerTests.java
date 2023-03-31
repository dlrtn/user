package dlrtn.user.business.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import dlrtn.user.business.application.UserService;
import dlrtn.user.business.model.payload.SignUpRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTests {

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @DisplayName("유저 회원가입 기능 테스트, 성공")
    @Test
    public void UserSignUpTest() throws Exception {
        // given
        String TEST_EMAIL = "dlrtn751@gmail.com";
        String TEST_USERNAME = "dlrtn";
        String TEST_PASSWORD = "1234";
        String TEST_NICKNAME = "dlrtn";

        // when
        String body = mapper.writeValueAsString(
                SignUpRequest.builder()
                        .email(TEST_EMAIL)
                        .username(TEST_USERNAME)
                        .password(TEST_PASSWORD)
                        .nickname(TEST_NICKNAME)
                        .build());
        // then
        mockMvc.perform(post("/api/users")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

}
