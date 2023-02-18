package com.kipsterworks.springboottutorialredo.service;

import com.kipsterworks.springboottutorialredo.entity.Department;
import com.kipsterworks.springboottutorialredo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
}
