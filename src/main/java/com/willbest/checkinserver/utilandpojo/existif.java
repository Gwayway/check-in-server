package com.willbest.checkinserver.utilandpojo;
import com.willbest.checkinserver.mapper.studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class existif {
    @Autowired
    studentMapper  studentMapper;
    public  boolean exist(String phonenum){
        if(studentMapper.findByPhonenumIs(phonenum)==null)
        {
            return  true;
        }else {
            return false;
        }
    }
}
