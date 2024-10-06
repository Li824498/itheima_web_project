package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class EmpController {
    @Autowired
    @Qualifier("empServiceB")
//    @Resource(name = "empServiceB")
    private EmpService empService;
    @RequestMapping("/listEmp")
    public Result list() {

        List<Emp> t = empService.listEmp();


        return Result.success(t);
    }

}

//String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//List<Emp> emplist = XmlParserUtils.parse(file, Emp.class);
//
//        emplist.stream().forEach(emp -> {
//String gender = emp.getGender();
//            if(gender.equals("1")) {
//        emp.setGender("男");
//            }else if("2".equals(gender)){
//        emp.setGender("女");
//            }
//                    });
//
//                    emplist.stream().forEach(emp -> {
//String job = emp.getJob();
//            if(job.equals("1")) {
//        emp.setJob("讲师");
//            } else if ("2".equals(job)) {
//        emp.setJob("班主任");
//            } else if ("3".equals(job)) {
//        emp.setJob("就业指导");
//            }
//                    });
//
//
//                    return Result.success(emplist);