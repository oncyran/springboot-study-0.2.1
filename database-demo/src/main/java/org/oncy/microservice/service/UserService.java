package org.oncy.microservice.service;

import org.oncy.microservice.dao.UserJdbcTmpl;
import org.oncy.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserJdbcTmpl userJdbcTmpl;

    public int insertUser(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return userJdbcTmpl.insertUser(user);
    }
}
