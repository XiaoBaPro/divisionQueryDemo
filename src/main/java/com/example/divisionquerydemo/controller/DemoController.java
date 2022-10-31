package com.example.divisionquerydemo.controller;

import com.example.divisionquerydemo.out.ResultOutInfo;
import com.example.divisionquerydemo.pojo.DemoEntity;
import com.example.divisionquerydemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;
    
    
    @PostMapping("/list")
    public ResultOutInfo list(@RequestBody Map<String,String> params){
        ResultOutInfo ret = new ResultOutInfo();
        Iterator<Map.Entry<String, String>> iter = params.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            if (entry.getKey().equals("limit") || entry.getKey().equals("page") ){
                iter.remove();
            }
        }
        ret.setCode(0);
        ret.setData(demoService.list(params));
        return ret;
    }
    
    @GetMapping("/get")
    public DemoEntity get(@RequestParam Long id){
        return demoService.getById(id);
    }
    
    
}
