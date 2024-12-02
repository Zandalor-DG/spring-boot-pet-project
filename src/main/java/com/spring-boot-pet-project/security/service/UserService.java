package com.spring-boot-pet-project.security.service;

import com.spring-boot-pet-project.model.User;
import com.spring-boot-pet-project.security.dto.AuthenticatedUserDto;
import com.spring-boot-pet-project.security.dto.RegistrationRequest;
import com.spring-boot-pet-project.security.dto.RegistrationResponse;

public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
