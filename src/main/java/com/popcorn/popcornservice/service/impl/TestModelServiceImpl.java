package com.popcorn.popcornservice.service.impl;

import com.popcorn.popcornservice.dao.mapper.TestMapper;
import com.popcorn.popcornservice.dao.model.TestModel;
import com.popcorn.popcornservice.service.TestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestModelServiceImpl implements TestModelService {
    @Autowired
    private TestMapper testMapper;

    @Override
    @Transactional(readOnly=true)
    public TestModel searchModelById(Long id) {
        return testMapper.getModelById(id);
    }

}
