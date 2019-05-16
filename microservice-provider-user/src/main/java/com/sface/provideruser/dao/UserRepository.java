package com.sface.provideruser.dao;

import com.sface.provideruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
}
