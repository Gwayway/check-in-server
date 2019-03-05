package com.willbest.checkinserver.bean;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
@NodeEntity(label = "student")
@Data
public class student {
    @Id
    @GeneratedValue
    private  Long id;
    private String username;
    private String password;
    private String phonenum;
    private String nickname;
    public student(String username, String password, String nickname, String phonenum){
        this.username=username;
        this.password=password;
        this.nickname=nickname;
        this.phonenum=phonenum;
    }
}
