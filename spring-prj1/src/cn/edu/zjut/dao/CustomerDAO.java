package cn.edu.zjut.dao;

import cn.edu.zjut.service.BaseHibernate;
import org.hibernate.Session;
import cn.edu.zjut.po.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDAO extends BaseHibernate implements ICustomerDAO{
    private Session session;
    public void setSession(Session session) {
        this.session=session;
    }
    public void save(Customer transientInstance) {
        //Session session = getSession();
        session.save(transientInstance);
    }
}