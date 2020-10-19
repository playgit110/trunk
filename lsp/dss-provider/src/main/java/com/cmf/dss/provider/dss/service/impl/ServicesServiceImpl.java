package com.cmf.dss.provider.dss.service.impl;
import  com.cmf.base.bsframework.service.impl.BaseServiceImpl;
import  com.cmf.base.bsframework.dao.mapper.BaseMapper;
import com.cmf.dss.provider.dss.dao.mapper.IServicesDaoMapper;
import com.cmf.dss.provider.dss.service.IServicesService;
import com.cmf.dss.provider.dss.domain.Services;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;

/**
* @description: 模板生成
* @author: 模板生成
**/
@Service
public class ServicesServiceImpl extends BaseServiceImpl<Services> implements IServicesService
{
    @Autowired
    private IServicesDaoMapper servicesDaoMapper;

   @Autowired
   public void setBaseMapper()
   {
        super.setBaseMapper(servicesDaoMapper);
   }
}
