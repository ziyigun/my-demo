package com.ali;

import com.ali.config.MsgConfig;
import com.ali.config.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({MsgConfig.class})
public class ConfigurationTest {

    @Autowired
    private String msg;

    @Autowired
    private User user;

    @Test
    void testConfiguration(){
        System.out.println(msg);
        System.out.println(user);
    }

}

