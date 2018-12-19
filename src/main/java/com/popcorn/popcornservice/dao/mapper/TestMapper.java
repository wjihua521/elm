package com.popcorn.popcornservice.dao.mapper;

import com.popcorn.popcornservice.dao.model.TestModel;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    TestModel getModelById(@Param("id") Long id);
}
