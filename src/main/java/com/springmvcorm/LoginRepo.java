package com.springmvcorm;

import com.springmvcorm.EmployeeLogin.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,String> {
}
