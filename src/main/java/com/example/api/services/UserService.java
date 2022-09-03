package com.example.api.services;

import java.util.List;

import com.example.api.domain.User;
import com.example.api.domain.dto.UserDTO;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);

    void delete(Integer id);
}
