package com.sung.redis;


import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsCollectionContaining.*;
import static org.junit.Assert.*;

import com.example.config.redis.AppConfig;
import com.example.config.redis.RedisClusterConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.JedisCluster;

import java.util.Arrays;

/**
 * Created by sungang on 2017/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RedisClusterConfig.class})
public class BasicUsageTests {


    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void get(){
        System.out.println("=============="+jedisCluster.get("hello"));
    }

//    @Test
//    public void singleSlotOperation() {
//        template.opsForValue().set("name", "rand al'thor");
//        assertThat(template.opsForValue().get("name"), is("rand al'thor"));
//    }
//
//
//    @Test
//    public void multiSlotOperation() {
//        template.opsForValue().set("name", "matrim cauthon"); // slot 5798
//        template.opsForValue().set("nickname", "prince of the ravens"); // slot 14594
//        assertThat(template.opsForValue().multiGet(Arrays.asList("name", "nickname")),hasItems("matrim cauthon", "prince of the ravens"));
//    }
//
//
//    @Test
//    public void fixedSlotOperation() {
//        template.opsForValue().set("{user}.name", "perrin aybara"); // slot 5474
//        template.opsForValue().set("{user}.nickname", "wolfbrother"); // slot 5474
//
//        assertThat(template.opsForValue().multiGet(Arrays.asList("{user}.name", "{user}.nickname")), hasItems("perrin aybara", "wolfbrother"));
//    }
//
//
//    @Test
//    public void multiNodeOperation() {
//        template.opsForValue().set("name", "rand al'thor"); // slot 5798
//        template.opsForValue().set("nickname", "dragon reborn"); // slot 14594
//        template.opsForValue().set("age", "23"); // slot 741;
//        assertThat(template.keys("*"), hasItems("name", "nickname", "age"));
//    }
}
