package org.oncy.microservice.dao;

import org.oncy.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcTmpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertUser(User user){
        return jdbcTemplate.update("insert into user (name, age, created_time) values (?, ?, now())", user.getName(), user.getAge());
    }

    public int deleteUser(User user){
        return jdbcTemplate.update("delete from user where name = ?", user.getName());
    }

}
