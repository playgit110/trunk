package com.cmf.ieis.provider.estate.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EstateHouseShop {
    private String id;
    private String customerFlow;
    private String houseAllocation;
    private String remainingLeaseTerm;
    private String shopType;
    private String status;
}
