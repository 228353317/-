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
     * һ�������ص�:
     * 1.������Ϊ�־�״̬ʱ��
     * ���session����û����Ӧ�Ķ���,�ͻ��Զ������ݿ��ѯ��Ӧ����Ϣ,д�����浱��
     * ���ʱ����ȵ�������������û�ж�Ӧ�Ķ���
     * **/
    @Test
    public void Test3(){
        Session session = HibernateUtil.openSession();
        //��������
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
        //�ύ����
        transaction.commit();
        //�ر���Դ
        session.close();
    }
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
