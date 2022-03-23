package com.spring.transactional.service;

import com.spring.transactional.mapper.OrderMapper;
import com.spring.transactional.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderMapper orderMapper;

    public void add(String name) {
        userMapper.insert(name);
//        orderService.addOrder();
        addOrder();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addOrder() {
        orderMapper.add(1L, 2);
        int rest = 2 / 0;
    }
}
