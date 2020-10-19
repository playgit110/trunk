package com.cmf.ieis.provider.estate.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EstateHouseRental {
    private String id;
    private String houseAllocation;
    private String leaseTerm;
    private String payType;
    private BigDecimal price;
    private String rentalType;
    private String roomType;

}
