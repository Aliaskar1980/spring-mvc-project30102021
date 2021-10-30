package com.peaksoft.dao;

import com.peaksoft.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> getAllUser();

    User getById(int id);

    void deleteUserById(Integer id);

    void mergeUser(User user);






}
