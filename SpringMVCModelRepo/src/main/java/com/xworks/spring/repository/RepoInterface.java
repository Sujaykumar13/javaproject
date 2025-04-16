package com.xworks.spring.repository;

import com.xworks.spring.entity.StudentEntity;

public interface RepoInterface {

    StudentEntity save(StudentEntity entity,String gender,String Combination);
}
