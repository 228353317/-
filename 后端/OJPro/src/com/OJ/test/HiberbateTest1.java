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
//        //��������
//        Transaction transaction = session.beginTransaction();
//
//        /*
//        * һ�������ص�:
//        * 1.������Ϊ�־�״̬ʱ��
//        * ���session����û����Ӧ�Ķ���,�ͻ��Զ������ݿ��ѯ��Ӧ����Ϣ,д�����浱��
//        * ���ʱ����ȵ�������������û�ж�Ӧ�Ķ���
//        * **/
//        Customer customer = new Customer();
//        customer.setCust_name("����");
//        customer.setCust_phone("132465798");
//        customer.setCust_level("12");
//        Serializable id = session.save(customer);
//        customer.setCust_name("����");
//        Customer customer1 = session.get(Customer.class, id);
//        System.out.println(customer1 == customer);
//
//
//        //�ύ����
//        transaction.commit();
//        //�ر���Դ
//        session.close();
//    }
//
//    @Test
//    public void Test2(){
//        Session session = HibernateUtil.getCurrentSession();
//        //��������
//        Transaction transaction = session.beginTransaction();
//
//        Customer customer = session.get(Customer.class, 6L);
//        customer.setCust_name("�۰���");
//
//        //�ύ����
//        transaction.commit();
//        //ͨ�����õ�ǰ�̻߳��Զ��ر�session
//    }
}
