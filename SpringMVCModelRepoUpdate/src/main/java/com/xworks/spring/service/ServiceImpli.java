package com.xworks.spring.service;

import com.xworks.spring.dto.StudentDto;
import com.xworks.spring.entity.StudentEntity;
import com.xworks.spring.repo.RepoInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpli implements ServiceInterface {

    @Autowired
    RepoInterface repoInterface;
    @Override
    public StudentDto saveData(StudentDto dto,String gender,String combination) {
        System.out.println("It is Service Implimentation class");

        System.out.println("converting dto to entity");
        StudentEntity studentEntity=new StudentEntity();
//        studentEntity.setStudentName(dto.getStudentName());
//        studentEntity.setParentName(dto.getParentName());
//        studentEntity.setAge(dto.getAge());
//        studentEntity.setEmail(dto.getEmail());
//        studentEntity.setPhoneNumber(dto.getPhoneNumber());
//        studentEntity.setBirthDate(dto.getBirthDate());
//        studentEntity.setAddress(dto.getAddress());
        studentEntity.setGender(gender);
        studentEntity.setCombination(combination);
        BeanUtils.copyProperties(dto,studentEntity);//instead set every value we can use this statement
        //for this dto and entity proprties number should same
        System.out.println(studentEntity);

        System.out.println("calling repository");
        repoInterface.save(studentEntity,gender,combination);

        return dto;//we need add return to fetch
    }
}
