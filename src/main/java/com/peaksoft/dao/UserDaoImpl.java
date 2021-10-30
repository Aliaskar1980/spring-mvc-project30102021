package com.peaksoft.dao;

import com.peaksoft.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
//    @Qualifier
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getById(int id) {
        return (User) entityManager.find(User.class, id);
    }

    @Override
    public void deleteUserById(Integer id) {
        entityManager.remove(getById(id));
    }

    @Override
    public void mergeUser(User user) {
        entityManager.merge(user);
    }
}
