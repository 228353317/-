package com.OJ.test;

import com.OJ.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.io.Serializable;

public class HiberbateTest1 {

//    @Test
//    public void Test3(){
//        Session session = HibernateUtil.openSession();
//        //开启事务
//        Transaction transaction = session.beginTransaction();
//
//        /*
//        * 一级缓存特点:
//        * 1.当程序为持久状态时候
//        * 如果session当中没有相应的对象,就会自动从数据库查询相应的信息,写到缓存当中
//        * 查的时候会先到缓冲区查下有没有对应的对象
//        * **/
//        Customer customer = new Customer();
//        customer.setCust_name("张三");
//        customer.setCust_phone("132465798");
//        customer.setCust_level("12");
//        Serializable id = session.save(customer);
//        customer.setCust_name("李三");
//        Customer customer1 = session.get(Customer.class, id);
//        System.out.println(customer1 == customer);
//
//
//        //提交事务
//        transaction.commit();
//        //关闭资源
//        session.close();
//    }
//
//    @Test
//    public void Test2(){
//        Session session = HibernateUtil.getCurrentSession();
//        //开启事务
//        Transaction transaction = session.beginTransaction();
//
//        Customer customer = session.get(Customer.class, 6L);
//        customer.setCust_name("哇昂三");
//
//        //提交事务
//        transaction.commit();
//        //通过调用当前线程会自动关闭session
//    }
}
