package com.atguigu.springcloud.service.imp;


import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImp  implements PaymentService {


    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
