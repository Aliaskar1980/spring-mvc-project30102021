package com.peaksoft.service;

import com.peaksoft.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void add(User user);

    List<User> getAllUser();

    User getById(int id);

    void deleteById(Integer id);

    void mergeUser(User user);

}
