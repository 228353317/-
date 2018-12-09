package com.OJ.test;

import com.OJ.domain.solution;
import com.OJ.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

public class HibernateTest {
//   @Test
//   public void test(){
//       //1.从HibernateUtil工具类当中获取session对象
//       Session session = HibernateUtil.openSession();
//       //2.操作映射的domain
//       Customer customer = new Customer();
//       customer.setCust_industry("蓝翔");
//       customer.setCust_level("17");
//       customer.setCust_name("zs");
//       customer.setCust_phone("18959223990");
//       //3.写入数据库
//       session.save(customer);
//       //4.关闭资源
//       session.close();
//   }
//    @Test
//    public void test1(){
//        Session session = HibernateUtil.openSession();
//        //获取一条数据
//        Customer customer = session.get(Customer.class, 1L);
//        System.out.println(customer);
//        //关闭资源
//        session.close();
//    }
//
    @Test
    public void test_0j(){
        Session session = HibernateUtil.openSession();
        solution solu = session.get(solution.class, 1L);
        try {
            JSONObject jsonObject = JSONObject.fromObject(model);
            jsonStr = jsonObject.toString();
            System.out.println(jsonStr);
        } catch (Exception e) {
            System.out.println("数组转json失败");
        }
        System.out.println(solu);
        session.close();
    }
//    /*
//    * 注意点:
//    * 1.C3P0连接池只有在查询的时候不需要开启事务,做更新的时候如果不开启
//    * 事务,修改的都内容写入不到数据库
//    * 2.如果直接更新一条数据,会把没有修改的数据全部变成null
//    * 所以要先查询出数据再更新
//    * **/
//    @Test
//    public void test2(){
//        Session session = HibernateUtil.openSession();
//        //开启事务
//        Transaction transaction = session.beginTransaction();
//        //获取一条数据
//        Customer customer = session.get(Customer.class, 1L);
//        customer.setCust_name("myxq666");
//        session.update(customer);
//        //提交事务
//        transaction.commit();
//        //关闭资源
//        session.close();
//    }
//    @Test
//    public void test3(){
//        Session session = HibernateUtil.openSession();
//        //开启事务
//        Transaction transaction = session.beginTransaction();
//
//        //删除记录的2种方法:
//
//        //(1)创建对象然后删除(不支持级联删除)
//        //Customer customer = new Customer();
//        //customer.setCust_id(1L);
//        //session.delete(customer);
//
//        //(2)查询对象然后删除(支持级联删除)
//        Customer customer = session.get(Customer.class, 2L);
//        session.delete(customer);
//
//        //提交事务
//        transaction.commit();
//        //关闭资源
//        session.close();
//    }
//
//    @Test
//    public void test4(){
//        Session session = HibernateUtil.openSession();
//        //开启事务
//        Transaction transaction = session.beginTransaction();
//        //创建对象(如果设置了id执行更新操作,没有设置执行创建操作)
//        Customer customer = new Customer();
//        customer.setCust_name("鲁班");
//        customer.setCust_level("29");
//        //customer.setCust_id(3L);
//        session.saveOrUpdate(customer);
//        //提交事务
//        transaction.commit();
//        //关闭资源
//        session.close();
//    }
//
//    @Test
//    public void Test5(){
//        Session session = HibernateUtil.openSession();
//        //开启事务
//        Transaction transaction = session.beginTransaction();
//
//        //查询所有HQL(面向对象的查询方法,和表没有关系,是类和对象的关系)
//        Query query = session.createQuery("from com.myxq.domain.Customer");
//        List<Customer> list = query.list();
//        for (Customer customer:list) {
//            System.out.println(customer);
//        }
//
//        //提交事务
//        transaction.commit();
//        //关闭资源
//        session.close();
//    }
}
