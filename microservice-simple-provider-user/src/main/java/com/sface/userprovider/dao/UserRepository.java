package com.sface.userprovider.dao;

import com.sface.userprovider.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
}
