package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface PaymentDao {

    public int  creat(Payment payment);

    public  Payment  getPaymentById( Long id);



}
