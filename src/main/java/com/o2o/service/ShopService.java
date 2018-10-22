package com.o2o.service;

import com.o2o.dto.ShopExecution;
import com.o2o.entity.Shop;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface ShopService {

    ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);

    ShopExecution getByEmployeeId(long employeeId) throws RuntimeException;

    Shop getByShopId(long shopId);

    ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) throws RuntimeException;

    ShopExecution modifyShop(Shop shop, CommonsMultipartFile shopImg) throws RuntimeException;

}
