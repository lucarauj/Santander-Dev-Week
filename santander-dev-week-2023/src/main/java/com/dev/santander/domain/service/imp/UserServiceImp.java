package com.dev.santander.domain.service.imp;

import com.dev.santander.domain.model.User;
import com.dev.santander.domain.repository.UserRepository;
import com.dev.santander.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("Conta já existe!");
        }
        return userRepository.save(user);
    }
}
