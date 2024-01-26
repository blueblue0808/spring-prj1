package cn.edu.zjut.service;

import cn.edu.zjut.dao.ICustomerDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import cn.edu.zjut.po.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
//@Transactional
public class UserService extends BaseHibernate implements IUserService{
    private ICustomerDAO customerDAO = null;
    public void setCustomerDAO(ICustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void addUser(Customer c) {
//        customerDAO.save(c);
//    public void saveUser(Customer c) {
//        Transaction tran = null;
        Session session = null;
        session = getSession();
        customerDAO.setSession(session);
        customerDAO.save(c);
        session.close();
//        try {
//            session = getSession();
//            tran = session.beginTransaction();
//            customerDAO.setSession(session);
//            customerDAO.save(c);
//            tran.commit();
//        } catch (RuntimeException re) {
//            if(tran != null) tran.rollback();
//            throw re;
//        } finally {
//            session.close();
//        }
    }
}
