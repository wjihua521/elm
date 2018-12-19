package com.popcorn.popcornservice.controller;

import com.popcorn.popcornservice.dao.model.TestModel;
import com.popcorn.popcornservice.service.TestModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TestModelService testModelService;

    @RequestMapping(value = "/search",method= RequestMethod.GET)
    @ResponseBody
    public Map searchModelById(@RequestParam("id")Long id){
        logger.info("查询testModel信息id：{}",id);
        TestModel model = testModelService.searchModelById(id);
        Map<String,TestModel> map = new HashMap<>(1);
        map.put("model",model);
        logger.info("查询testModel结果：{}",map);
        return map;
    }

}
