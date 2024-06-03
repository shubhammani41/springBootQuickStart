package com.dev.blackspace.repositories;

import com.dev.blackspace.entities.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepo extends JpaRepository<UserProfileEntity, Long> {

    UserProfileEntity findByUserName(String userName);
}
