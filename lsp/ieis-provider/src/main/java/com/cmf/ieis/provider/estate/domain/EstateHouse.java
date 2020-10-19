package com.cmf.ieis.provider.estate.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class EstateHouse {
    private String apartmentLayout;
    private String cityCode;
    private String contact;
    private String countyCode;
    private String decorationStatus;
    private Date deliveryTime;
    private String description;
    private String detailedAddress;
    private String elevator;
    private String floor;
    private String floorArea;
    private String id;
    private String memberId;
    private String name;
    private String neighbourhood;
    private BigDecimal price;
    private Integer propertyRight;
    private String provinceCode;
    private String roomAttribute;
    private String roomType;
    private String telephone;
    private String townCode;
    private String type;

    private EstateHouseRental estateHouseRental;
    private EstateHouseShop estateHouseShop;

}
