package cn.ezios.spring.april.thirtieth.dao;


import cn.ezios.spring.april.thirtieth.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {

    Customer selectById(String id);
}
