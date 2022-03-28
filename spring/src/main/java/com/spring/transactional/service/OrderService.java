package com.spring.transactional.service;

import com.spring.transactional.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addOrder() {
        orderMapper.add(1L, 2);
        int count = 2;
        int res = count / 0;

    }
}
