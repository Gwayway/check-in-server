package com.willbest.checkinserver.mapper;
import com.willbest.checkinserver.bean.student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface studentMapper extends Neo4jRepository<student,Long>{
    student findByPhonenumIs(@Param("phonenum")String phonenum);
}
