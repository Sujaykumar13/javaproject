package com.xworks.spring.repository;

import com.xworks.spring.entity.StudentEntity;

import java.util.List;

public interface RepositoryInterface {

    void saveData(StudentEntity entity);

    List<StudentEntity> fetchData();

    StudentEntity findDataById(Integer id);

    void updateData(StudentEntity entity);


    boolean deleteDataRepo(Integer id);
}
