package com.dev.santander.domain.service;

import com.dev.santander.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User user);
}
