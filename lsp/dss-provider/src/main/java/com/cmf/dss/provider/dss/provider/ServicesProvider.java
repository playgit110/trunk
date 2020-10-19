package com.cmf.dss.provider.dss.provider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.cmf.commonUtils.CommonUtils;
import org.apache.commons.lang3.StringUtils;
import com.cmf.dss.provider.dss.domain.Services;
import com.cmf.dss.provider.dss.service.IServicesService;

import javax.validation.constraints.NotNull;

/**
 *
 **/
@RestController
@RequestMapping("api/v1/dss/services")
public class ServicesProvider {
    @Autowired
    private IServicesService servicesService;

    /**
     * 查询services
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Services getById(@NotNull(message = "id不能为空") @PathVariable("id") String id) {
        return servicesService.findById(id);
    }

    /**
     * 查询services
     *
     * @param services
     * @return
     */
    @GetMapping()
    public List<Services> getList(Services services) {
        return servicesService.findByCondition(services);
    }

    /**
     * 添加services
     *
     * @param services
     */
    @PostMapping()
    public int add(@RequestBody Services services) {
        services.setId(CommonUtils.getUUID());
        return servicesService.insert(services);
    }

    /**
     * 修改services
     *
     * @param services
     */
    @PutMapping()
    public int edit(@RequestBody Services services) {
        return servicesService.update(services);
    }

    /**
     * 删除services
     *
     * @param servicesList
     */
    @DeleteMapping()
    public int delete(@RequestBody List<Services> servicesList) {
        List servicess = new ArrayList();
        for (int i = 0; i < servicesList.size(); i++) {
            Services services = servicesList.get(i);
            servicess.add(services.getId());
        }
        return servicesService.deleteByIds(servicess);
    }
}
