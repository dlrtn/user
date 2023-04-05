package dlrtn.user.business.user.repository;

import dlrtn.user.business.user.model.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    public void saveUser(User user);

}
