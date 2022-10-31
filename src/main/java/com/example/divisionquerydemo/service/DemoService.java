package com.example.divisionquerydemo.service;

import com.example.divisionquerydemo.pojo.DemoEntity;

import java.util.List;
import java.util.Map;

/**
 * @author wang
 */
public interface DemoService {

    DemoEntity getById(Long id);
    
    List<DemoEntity> list(Map<String,String> params);
}
