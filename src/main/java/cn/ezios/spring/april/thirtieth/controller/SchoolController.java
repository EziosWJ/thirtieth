package cn.ezios.spring.april.thirtieth.controller;

import cn.ezios.spring.april.thirtieth.dao.CustomerDao;
import cn.ezios.spring.april.thirtieth.entities.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @ClassName SchoolController
 * @Description TODO
 * @Date 2019/4/13 22:05
 * @Creaded By Wangj
 */
@Controller
@RequestMapping("sch")
public class SchoolController {

    @Resource
    private CustomerDao customerDao;

    @RequestMapping("stu_list")
    public String stu_list(Model model,String id){
        model.addAttribute("title","这是标题");
        Customer customer = customerDao.selectById(id);
        System.out.println(customer);
        model.addAttribute("customer",customer);
        return "sch/stu_list";
    }
}
