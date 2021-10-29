package com.peaksoft.service;

import com.peaksoft.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void add(User user);

    List<User> getAll();

    User get(int id);

    void delete(Integer id);

    void mergeUser(User user);

}
