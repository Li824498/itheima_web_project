package com.itheima.service.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceB implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp(){
        List<Emp> emplist = empDao.listEmp();
        emplist.stream().forEach(emp -> {
            String gender = emp.getGender();
            if(gender.equals("1")) {
                emp.setGender("男士");
            }else if("2".equals(gender)){
                emp.setGender("女士");
            }
        });

        emplist.stream().forEach(emp -> {
            String job = emp.getJob();
            if(job.equals("1")) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });

        return emplist;
    }
}
