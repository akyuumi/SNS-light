package com.app.mealman.services;

import com.app.mealman.dto.UserDto;
import com.app.mealman.entities.User;
import com.app.mealman.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<User> getAllUsers();

    public Optional<User> getUserById(Long id);

    public User createUser(UserDto userDto);

    public User updateUser(Long id, User userDetails);

}
