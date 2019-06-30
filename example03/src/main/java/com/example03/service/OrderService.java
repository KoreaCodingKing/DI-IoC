package com.example03.service;

import com.example03.util.BaseSequenceGenerator;

// 비즈니스 로직이 구현되는 곳
public interface OrderService {
    void addOrder(String userId, String projectId, Double quantity);
    public BaseSequenceGenerator getSequenceGenerator();
}
