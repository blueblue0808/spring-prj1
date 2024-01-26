package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;
import org.hibernate.Session;

import java.util.List;

public interface ICustomerDAO {
    void setSession(Session session);
    void save(Customer transientInstance);
}
