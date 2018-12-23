package com.OJ.test;

import com.OJ.domain.solution;
import com.OJ.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class HiberbateTest1 {
    /*
     * 一级缓存特点:
     * 1.当程序为持久状态时候
     * 如果session当中没有相应的对象,就会自动从数据库查询相应的信息,写到缓存当中
     * 查的时候会先到缓冲区查下有没有对应的对象
     * **/
    @Test
    public void Test3(){
        Session session = HibernateUtil.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();
        solution solu = new solution();
        solu.setPid(2);
        solu.setSid(2);
        solu.setTIid(2);
        solu.setScore(33);
        Date date = new Date();
        solu.setSubmitDate(new Timestamp(date.getTime()));
        solu.setMemory(4500);
        solu.setTime(1999);
        solu.setCodeLength(66);
        solu.setULid(3);
        solu.setJRid(8);
        solu.setError("error_info");
        session.save(solu);
        //提交事务
        transaction.commit();
        //关闭资源
        session.close();
    }
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
