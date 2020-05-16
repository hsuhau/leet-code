package com.hsuhau.main.repository.impl;

import com.hsuhau.main.entity.User;
import com.hsuhau.main.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author hsuhau
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    static List<User> users = new ArrayList<>();

    static {
        Collections.addAll(users, new User(1, "macarena", "girl", 23),
                new User(2, "hsuhau", "man", 23),
                new User(3, "fun", "girl", 11),
                new User(4, "cool", "girl", 11),
                new User(5, "inter", "boy", 11)
        );
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public int deleteUserById(Integer id) {
        int num = 0;
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                num = 1;
            }
        }

        return num;
    }
}
