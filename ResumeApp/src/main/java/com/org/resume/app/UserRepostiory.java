package com.org.resume.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.resume.app.model.User;

public interface UserRepostiory  extends JpaRepository<User, Long>{

}
