package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @RequestMapping(method = RequestMethod.POST,value = "/payment/create")
    public CommonResult creatPayment(@RequestBody Payment payment) {

        int result = paymentService.creat(payment);

        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        }

        return new CommonResult(404, "插入数据失败", null);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/payment/get/{id}")
    public  CommonResult  getPayment(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        if (payment!=null){
            return   new CommonResult(200,"数据查询成功",payment);
        }
        return new CommonResult(404,"数据查询失败",null);

    }




}
