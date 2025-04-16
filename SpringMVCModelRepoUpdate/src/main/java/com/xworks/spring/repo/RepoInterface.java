package com.xworks.spring.repo;

import com.xworks.spring.entity.StudentEntity;

public interface RepoInterface {
    StudentEntity save(StudentEntity entity,String gender,String combination);
}
