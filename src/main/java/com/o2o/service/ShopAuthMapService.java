package com.o2o.service;

import com.o2o.dto.ShopAuthMapExecution;
import com.o2o.entity.ShopAuthMap;

public interface ShopAuthMapService {

    ShopAuthMapExecution listShopAuthMapByShopId(Long shopId, Integer pageIndex, Integer pageSize);

    ShopAuthMapExecution addShopAuthMap(ShopAuthMap shopAuthMap);

    ShopAuthMapExecution modifyShopAuthMap(ShopAuthMap shopAuthMap) throws RuntimeException;

    ShopAuthMapExecution removeShopAuthMap(Long shopAuthMapId) throws RuntimeException;

    ShopAuthMap getShopAuthMapById(Long shopAuthId);

}
