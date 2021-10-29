package com.peaksoft.dao;

import com.peaksoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
//    @Qualifier
    private  EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("select u from User u", User.class ).getResultList();
    }

    @Override
    public User get(int id) {
        return (User) entityManager.find(User.class, id);
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(get(id));
    }

    @Override
    public void mergeUser(User user) {
        entityManager.merge(user);
    }
}
