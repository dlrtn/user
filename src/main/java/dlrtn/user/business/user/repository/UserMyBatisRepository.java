package dlrtn.user.business.user.repository;

import dlrtn.user.business.user.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMyBatisRepository {

    public void saveUser(User user);

}
