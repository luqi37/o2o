package com.o2o.dao;

import com.o2o.entity.ShopAuthMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopAuthMapDao {

    List<ShopAuthMap> queryShopAuthMapListByShopId(@Param("shopId") long shopId, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    int queryShopAuthCountByShopId(@Param("shopId") long shopId);

    int insertShopAuthMap(ShopAuthMap shopAuthMap);

    int updateShopAuthMap(ShopAuthMap shopAuthMap);

    int deleteShopAuthMap(@Param("employeeId") long employeeId,
                          @Param("shopId") long shopId);

    ShopAuthMap queryShopAuthMapById(Long shopAuthId);

}
