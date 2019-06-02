package org.oncy.microservice.dao;

import org.junit.Assert;
import org.junit.Test;
import org.oncy.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;


public class UserJdbcTmplTest {

    @Autowired
    private UserJdbcTmpl userJdbcTmpl;

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("from test");
        int insert = userJdbcTmpl.insertUser(user);

    }
}
