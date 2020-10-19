package com.cmf.ieis.provider.estate.provider;

import com.cmf.base.bsframework.exception.ClientException;
import com.cmf.commonUtils.CommonUtils;
import com.cmf.ieis.provider.estate.domain.EstateHouse;
import com.cmf.ieis.provider.estate.service.IEstateHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/estate/estateHouses")
public class EstateHouseProvider {

    @Autowired
    private IEstateHouseService estateHouseService;

    /**
     * 查询estateHouse
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public EstateHouse getById(@NotNull(message = "id不能为空") @PathVariable("id") String id) throws ClientException {
        return estateHouseService.findById(id);
    }

    /**
     * 查询estateHouse
     *
     * @param estateHouse
     * @return
     */
    @GetMapping()
    public List getList(EstateHouse estateHouse) {
        return estateHouseService.findByCondition(estateHouse);
    }

    /**
     * 添加/修改estateHouse
     */
    @PostMapping()
    public int add(@RequestBody EstateHouse estateHouse) {
        estateHouse.setId(CommonUtils.getUUID());
        return estateHouseService.insert(estateHouse);
    }

    /**
     * 添加/修改estateHouse
     */
    @PutMapping()
    public int edit(@RequestBody EstateHouse estateHouse) {
        return estateHouseService.update(estateHouse);
    }

    /**
     * 删除estateHouse
     */
    @DeleteMapping()
    public int delete(@RequestBody List<EstateHouse> estateHouseList) {
        List estateHouses = new ArrayList();
        for (int i = 0; i < estateHouseList.size(); i++) {
            EstateHouse estateHouse = estateHouseList.get(i);
            estateHouses.add(estateHouse.getId());
        }
        return estateHouseService.deleteByIds(estateHouses);
    }
}
