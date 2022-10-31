package com.example.divisionquerydemo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author wang
 */
@Data
public class DemoEntity {

    private Long id;
    
    private String ecu;
    
    private String descEn;
    
    private String descCn;
    
    private String vehicleModel;
    
    private String remark;
    
    private String dataOwner;
    
    private String diagOwner;
    
    private String partOwner;
    
    private String ruleOwner;
    
    private String serviceDevOwner;
    
    private Date createTime;
}
