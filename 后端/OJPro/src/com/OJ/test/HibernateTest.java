package com.OJ.test;

import java.util.Date;
import com.OJ.domain.solution;
import com.OJ.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.sql.Timestamp;

public class HibernateTest {
//   @Test
//   public void test(){
//       //1.��HibernateUtil�����൱�л�ȡsession����
//       Session session = HibernateUtil.openSession();
//       //2.����ӳ���domain
//       Customer customer = new Customer();
//       customer.setCust_industry("����");
//       customer.setCust_level("17");
//       customer.setCust_name("zs");
//       customer.setCust_phone("18959223990");
//       //3.д�����ݿ�
//       session.save(customer);
//       //4.�ر���Դ
//       session.close();
//   }

    //��ѯ
    @Test
    public void test_0j(){
        Session session = HibernateUtil.openSession();
        solution solu = session.get(solution.class, 1L);

//        ����תjson��ʽ
//        try {
//            JSONObject jsonObject = JSONObject.fromObject(model);
//            jsonStr = jsonObject.toString();
//            System.out.println(jsonStr);
//        } catch (Exception e) {
//            System.out.println("����תjsonʧ��");
//        }

        System.out.println(solu);
        session.close();
    }
//    /*
//    * ע���:
//    * 1.C3P0���ӳ�ֻ���ڲ�ѯ��ʱ����Ҫ��������,�����µ�ʱ�����������
//    * ����,�޸ĵĶ�����д�벻�����ݿ�
//    * 2.���ֱ�Ӹ���һ������,���û���޸ĵ�����ȫ�����null
//    * ����Ҫ�Ȳ�ѯ�������ٸ���
//    * **/
    //����
    @Test
    public void test2(){
        Session session = HibernateUtil.openSession();
        //��������
        Transaction transaction = session.beginTransaction();
        //��ȡһ������
        solution solu = session.get(solution.class, 2L);
        solu.setPid(9);
        solu.setSid(9);
        solu.setTIid(9);
        solu.setScore(65);
        Date date = new Date();
        solu.setSubmitDate(new Timestamp(date.getTime()));
        solu.setMemory(2900);
        solu.setTime(1963);
        solu.setCodeLength(99);
        solu.setULid(9);
        solu.setJRid(9);
        solu.setError("error_text");
        session.update(solu);
        //�ύ����
        transaction.commit();
        //�ر���Դ
        session.close();
    }
//    @Test
//    public void test3(){
//        Session session = HibernateUtil.openSession();
//        //��������
//        Transaction transaction = session.beginTransaction();
//
//        //ɾ����¼��2�ַ���:
//
//        //(1)��������Ȼ��ɾ��(��֧�ּ���ɾ��)
//        //Customer customer = new Customer();
//        //customer.setCust_id(1L);
//        //session.delete(customer);
//
//        //(2)��ѯ����Ȼ��ɾ��(֧�ּ���ɾ��)
//        Customer customer = session.get(Customer.class, 2L);
//        session.delete(customer);
//
//        //�ύ����
//        transaction.commit();
//        //�ر���Դ
//        session.close();
//    }
//
//    @Test
//    public void test4(){
//        Session session = HibernateUtil.openSession();
//        //��������
//        Transaction transaction = session.beginTransaction();
//        //��������(���������idִ�и��²���,û������ִ�д�������)
//        Customer customer = new Customer();
//        customer.setCust_name("³��");
//        customer.setCust_level("29");
//        //customer.setCust_id(3L);
//        session.saveOrUpdate(customer);
//        //�ύ����
//        transaction.commit();
//        //�ر���Դ
//        session.close();
//    }
//
//    @Test
//    public void Test5(){
//        Session session = HibernateUtil.openSession();
//        //��������
//        Transaction transaction = session.beginTransaction();
//
//        //��ѯ����HQL(�������Ĳ�ѯ����,�ͱ�û�й�ϵ,����Ͷ���Ĺ�ϵ)
//        Query query = session.createQuery("from com.myxq.domain.Customer");
//        List<Customer> list = query.list();
//        for (Customer customer:list) {
//            System.out.println(customer);
//        }
//
//        //�ύ����
//        transaction.commit();
//        //�ر���Դ
//        session.close();
//    }
}
