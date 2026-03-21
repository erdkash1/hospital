package com.iggy.hospital.repository;

import com.iggy.hospital.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);

}
