package com.o2o.dao;

import com.o2o.entity.UserShopMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserShopMapDao {

    List<UserShopMap> queryUserShopMapList(
            @Param("userShopCondition") UserShopMap userShopCondition,
            @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    UserShopMap queryUserShopMap(@Param("userId") long userId,
                                 @Param("shopId") long shopId);

    int queryUserShopMapCount(
            @Param("userShopCondition") UserShopMap userShopCondition);

    int insertUserShopMap(UserShopMap userShopMap);

    int updateUserShopMapPoint(UserShopMap userShopMap);

}
