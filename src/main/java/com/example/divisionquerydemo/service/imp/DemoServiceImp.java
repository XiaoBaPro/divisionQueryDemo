package com.example.divisionquerydemo.service.imp;

import com.example.divisionquerydemo.pojo.DemoEntity;
import com.example.divisionquerydemo.mapper.DemoMapper;
import com.example.divisionquerydemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author wang
 */
@Service
@Component
public class DemoServiceImp implements DemoService {
    
    @Autowired
    private DemoMapper demoMapper;
    
    @Override
    public DemoEntity getById(Long id) {
        return demoMapper.getById(id);
    }
    
    @Override
    public List<DemoEntity> list(Map<String,String> params) {
        return demoMapper.list(params);
    }
}
