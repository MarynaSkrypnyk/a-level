package org.example.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.springbootproject.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(nativeQuery = true,value = "select * from users")
    List<User> getAllUser();
    @Query(nativeQuery = true,value = "select * from users where id=:id")
    User findUserById(Long id);
    @Query(nativeQuery = true,value = "delete from users where id=:id")
    void deleteUserById(Long id);
}
