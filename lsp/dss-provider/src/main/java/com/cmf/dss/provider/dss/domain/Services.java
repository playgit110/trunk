package com.cmf.dss.provider.dss.domain;
import lombok.Data;

import java.math.BigDecimal;
/**
* @description: 模板生成
* @author: 模板生成
**/

@Data
public class Services
{
    private String id;
    private String title;
    private String type;
    private String memberId;
    private String serviceItems;
    private String contact;
    private String telephone;
    private String provinceCode;
    private String cityCode;
    private String countyCode;
    private String townCode;
    private String detailedAddress;

}
