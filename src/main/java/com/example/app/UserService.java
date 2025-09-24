package com.example.app;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }

    public User create(User u) {
        if (repo.existsByEmail(u.getEmail())) {
            throw new IllegalArgumentException("Email already exists: " + u.getEmail());
        }
        return repo.save(u);
    }
}
