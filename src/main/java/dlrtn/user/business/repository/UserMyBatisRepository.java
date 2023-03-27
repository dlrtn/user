package dlrtn.user.business.repository;

import dlrtn.user.business.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMyBatisRepository {

    public void saveUser(User user);

}
