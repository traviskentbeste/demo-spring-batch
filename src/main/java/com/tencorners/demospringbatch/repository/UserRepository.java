package com.tencorners.demospringbatch.repository;

import com.tencorners.demospringbatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
