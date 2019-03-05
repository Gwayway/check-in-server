package com.willbest.checkinserver.service;

import com.willbest.checkinserver.bean.student;
import com.willbest.checkinserver.mapper.studentMapper;
import com.willbest.checkinserver.utilandpojo.existif;
import com.willbest.checkinserver.utilandpojo.restful;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class studentService {
    @Autowired
    studentMapper  studentMapper;
    @Autowired
    existif existif;
    public restful creatuser(student student){
        if(existif.exist(student.getPhonenum())){
            studentMapper.save(student);
            return  new restful("succe",null,"s");
        }else {

            return  new restful("exist",null,"s");
        }

    }
    public restful login(student student){
        String phonenum=student.getPhonenum();
        if(existif.exist(phonenum)){
            return new restful("notexist",null,"s");
        }else {
            return new restful("succe",studentMapper.findByPhonenumIs(phonenum),"s");
        }
    }
}
