package com.hsuhau.main.controller;

import com.hsuhau.main.entity.User;
import com.hsuhau.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user/login")
    public String login(String username, String password, ModelMap modelMap) {
        if ("admin".equals(username) && "admin".equals(password)) {
            return "list";
        } else {
            modelMap.addAttribute("login_error", "用户名或者密码错误");
            return "login";
        }
    }

    @RequestMapping("/user/list")
    public String findAll(ModelMap modelMap) {
        List<User> users = userRepository.findAll();
        modelMap.addAttribute("list", users);
        return "list";
    }

    @RequestMapping("/user/delete")
    public String deleteById(Integer id) {
        userRepository.deleteUserById(id);
        return "list";
    }
}
