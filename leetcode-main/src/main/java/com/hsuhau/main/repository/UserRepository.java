package com.hsuhau.main.repository;

import com.hsuhau.main.entity.User;

import java.util.List;

public interface UserRepository {
    /**
     *
     * @return
     */
    List<User> findAll();

    /**
     *
     * @param id
     * @return
     */
    int deleteUserById(Integer id);
}
