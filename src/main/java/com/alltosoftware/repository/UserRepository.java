package com.alltosoftware.repository;

import com.alltosoftware.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);

    UserEntity findFirstByUsername(String username);
}