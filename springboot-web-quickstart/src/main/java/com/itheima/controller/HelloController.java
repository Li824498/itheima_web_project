package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
//@
public class HelloController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + " : " + age);
//        return "ok";
//    }


    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name", required = false) String username, Integer age) {
        System.out.println(username + " : " + age);
        return "ok";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "ok";

    }

    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "ok";

    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";

    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam ArrayList<String> hobby) {
        System.out.println(hobby);
        return "ok";

    }

    @RequestMapping("dataParm")
    public String dataParm(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "ok";
    }

    @RequestMapping("jsonParm")
    public String jsonParm(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }
    @RequestMapping("/path/{id}")
    public String pathParm(@PathVariable Integer id) {
        System.out.println(id);
        return "ok";
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParm2(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id);
        System.out.println(name);
        return "ok";
    }
}
