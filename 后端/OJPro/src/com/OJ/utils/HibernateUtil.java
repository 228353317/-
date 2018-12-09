package com.OJ.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    public static final SessionFactory sessionFactory;
    //只配置一次,所以放在静态代码块当中.
    static{
        //1.导入Hibernate核心配置文件
        Configuration configure = new Configuration().configure();
        //Configuration configure = new Configuration().configure();
        //2.建立一个SessionFactory  (相当于建立JDBC的连接池)
        sessionFactory = configure.buildSessionFactory();
    }
    public static Session openSession(){
        //3.建立会话
        Session session = sessionFactory.openSession();
        return session;
    }
    public static Session getCurrentSession(){
        //3.建立会话
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
