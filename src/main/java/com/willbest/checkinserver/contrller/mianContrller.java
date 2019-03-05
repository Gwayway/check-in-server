package com.willbest.checkinserver.contrller;

import com.willbest.checkinserver.bean.student;
import com.willbest.checkinserver.service.studentService;
import com.willbest.checkinserver.utilandpojo.restful;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cis")
public class mianContrller {
    @Autowired
    studentService  studentService;
    @RequestMapping("/c1")
    public restful createuser(String username,String nickname,String phonenum,String password){
        student student=new student(username,password,nickname,phonenum);
        return studentService.creatuser(student);
    }
    @RequestMapping("/log1")
    public  restful login(String phonenum,String password){
        student student=new student(null,password,null,phonenum);
        return studentService.login(student);
    }
}
