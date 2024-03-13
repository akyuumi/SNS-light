package com.app.mealman.services;

import com.app.mealman.entities.User;
import com.app.mealman.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ユーザーの全件取得
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ユーザーのIDで検索
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // ユーザーの作成
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // ユーザーの更新
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());

        return userRepository.save(user);
    }

    // ユーザーの削除
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
