package com.o2o.service.impl;

import com.o2o.dao.UserShopMapDao;
import com.o2o.dto.UserShopMapExecution;
import com.o2o.entity.UserShopMap;
import com.o2o.service.UserShopMapService;
import com.o2o.util.PageCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserShopMapServiceImpl implements UserShopMapService {

    @Autowired
    private UserShopMapDao userShopMapDao;

    @Override
    public UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition, int pageIndex, int pageSize) {
        if (userShopMapCondition != null && pageIndex != -1 && pageSize != -1) {
            int beginIndex = PageCalculator.calculateRowIndex(pageIndex,
                    pageSize);
            List<UserShopMap> userShopMapList = userShopMapDao
                    .queryUserShopMapList(userShopMapCondition, beginIndex,
                            pageSize);
            int count = userShopMapDao
                    .queryUserShopMapCount(userShopMapCondition);
            UserShopMapExecution ue = new UserShopMapExecution();
            ue.setUserShopMapList(userShopMapList);
            ue.setCount(count);
            return ue;
        } else {
            return null;
        }

    }
}
