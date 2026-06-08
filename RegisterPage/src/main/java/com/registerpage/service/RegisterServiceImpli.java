package com.registerpage.service;

import com.registerpage.dto.DepartmentDto;
import com.registerpage.dto.EmployeeDto;
import com.registerpage.dto.RegisterDto;
import com.registerpage.entity.DepartmentEntity;
import com.registerpage.entity.EmployeEntity;
import com.registerpage.entity.RegisterEntity;
import com.registerpage.repository.RegisterRepoInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RegisterServiceImpli implements RegisterServiceInterface {
    @Autowired
    RegisterRepoInterface registerRepoInterface;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveData(RegisterDto dto) {
        System.out.println(dto);
        RegisterEntity entity=new RegisterEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        registerRepoInterface.saveData(entity);
    }

    @Override
    public List<RegisterDto> fetchData() {
        List<RegisterDto> registerDtos = new ArrayList<>();
        List<RegisterEntity> result = registerRepoInterface.fetchData();
        System.out.println(result);
        result.stream().forEach(singleEntity->{
            RegisterDto dto=new RegisterDto();
            BeanUtils.copyProperties(singleEntity,dto);
            registerDtos.add(dto);
        });

        return registerDtos;
    }

    @Override
    public RegisterDto findById(Integer id) {
        RegisterEntity entity = registerRepoInterface.findById(id);
        System.out.println(entity);
        RegisterDto dto=new RegisterDto();
        BeanUtils.copyProperties(entity,dto);
        return dto;
    }

    @Override
    public RegisterDto findByEmail(String email) {
        RegisterEntity entity = registerRepoInterface.findByEmail(email);
        System.out.println(entity);
        RegisterDto dto=new RegisterDto();
        BeanUtils.copyProperties(entity,dto);
        return dto;
    }

    @Override
    public void updateData(RegisterDto dto) {

        System.out.println(dto);
        RegisterEntity entity=new RegisterEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        registerRepoInterface.updateData(entity);

    }

    @Override
    public boolean deleteById(Integer id) {
        RegisterEntity entity = registerRepoInterface.findById(id);
        if(entity!=null)
        {
            boolean isdeleted = registerRepoInterface.deleteById(id);
            if(isdeleted)
            {
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }

    @Override
    public void saveDept(DepartmentDto dto) {
        System.out.println(dto);
        DepartmentEntity entity=new DepartmentEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        registerRepoInterface.saveDept(entity);

    }

    @Override
    public void saveEmp(EmployeeDto dto) {
        System.out.println(dto);
        EmployeEntity entity=new EmployeEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        registerRepoInterface.saveEmpoyee(entity);

    }

    @Override
    public void fetchEmployeList(Integer id) {
        List<DepartmentEntity> result = registerRepoInterface.fetchEmployeList(id);
        System.out.println(result);
    }
}
