package com.o2o.service;

import com.o2o.dto.UserShopMapExecution;
import com.o2o.entity.UserShopMap;

public interface UserShopMapService {

    UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition,
                                         int pageIndex, int pageSize);

}
