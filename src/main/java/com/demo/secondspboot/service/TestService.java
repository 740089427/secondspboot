package com.demo.secondspboot.service;

import com.demo.secondspboot.mapper.TestMapper;
import com.demo.secondspboot.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<TestModel> getAll(){
        return testMapper.getAll();
    }
    public List<TestModel> getModelById(int id){
        return testMapper.getModelById(id);
    }
}
