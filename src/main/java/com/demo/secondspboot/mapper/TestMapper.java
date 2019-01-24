package com.demo.secondspboot.mapper;

import com.demo.secondspboot.model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {
    List<TestModel>  getAll();
}
