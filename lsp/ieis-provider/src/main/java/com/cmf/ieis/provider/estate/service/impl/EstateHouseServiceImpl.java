package com.cmf.ieis.provider.estate.service.impl;
import  com.cmf.base.bsframework.service.impl.BaseServiceImpl;
import  com.cmf.base.bsframework.dao.mapper.BaseMapper;
import com.cmf.ieis.provider.estate.dao.mapper.IEstateHouseDaoMapper;
import com.cmf.ieis.provider.estate.service.IEstateHouseService;
import com.cmf.ieis.provider.estate.domain.EstateHouse;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;

/**
* @description: 模板生成
* @author: 模板生成
**/
@Service
public class EstateHouseServiceImpl extends BaseServiceImpl<EstateHouse> implements IEstateHouseService
{
    @Autowired
    private IEstateHouseDaoMapper estateHouseDaoMapper;

   @Autowired
   public void setBaseMapper()
   {
        super.setBaseMapper(estateHouseDaoMapper);
   }
}
