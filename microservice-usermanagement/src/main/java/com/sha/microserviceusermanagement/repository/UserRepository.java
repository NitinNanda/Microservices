package com.sha.microserviceusermanagement.repository;

import com.sha.microserviceusermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findbyUsername(String username);

    @Query("Select u.name from User u where u.id in(:pIdList)")
    List<String> findByIdList(@Param("pIDList") List<Long> idList);
}
