package com.OJ.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    public static final SessionFactory sessionFactory;
    //ֻ����һ��,���Է��ھ�̬����鵱��.
    static{
        //1.����Hibernate���������ļ�
        Configuration configure = new Configuration().configure();
        //Configuration configure = new Configuration().configure();
        //2.����һ��SessionFactory  (�൱�ڽ���JDBC�����ӳ�)
        sessionFactory = configure.buildSessionFactory();
    }
    public static Session openSession(){
        //3.�����Ự
        Session session = sessionFactory.openSession();
        return session;
    }
    public static Session getCurrentSession(){
        //3.�����Ự
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
