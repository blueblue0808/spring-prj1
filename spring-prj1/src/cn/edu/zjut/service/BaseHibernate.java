package cn.edu.zjut.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class BaseHibernate {
    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.openSession();
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
