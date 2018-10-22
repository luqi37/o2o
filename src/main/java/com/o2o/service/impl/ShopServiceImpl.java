package com.o2o.service.impl;

import com.o2o.dao.ShopAuthMapDao;
import com.o2o.dao.ShopCategoryDao;
import com.o2o.dao.ShopDao;
import com.o2o.dto.ShopExecution;
import com.o2o.entity.Shop;
import com.o2o.entity.ShopAuthMap;
import com.o2o.enums.ShopStateEnum;
import com.o2o.service.ShopService;
import com.o2o.util.PageCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Autowired
    private ShopAuthMapDao shopAuthMapDao;

    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Override
    public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize) {
        int rowIndex = PageCalculator.calculateRowIndex(pageIndex, pageSize);
        List<Shop> shopList = shopDao.queryShopList(shopCondition, rowIndex, pageSize);
        int count = shopDao.queryShopCount(shopCondition);
        ShopExecution shopExecution = new ShopExecution();
        if (shopList != null) {
            shopExecution.setShopList(shopList);
            shopExecution.setCount(count);
        } else {
            shopExecution.setState(ShopStateEnum.INNER_ERROR.getState());
        }
        return shopExecution;
    }

    @Override
    public ShopExecution getByEmployeeId(long employeeId) throws RuntimeException {
        return null;
    }

    @Override
    public Shop getByShopId(long shopId) {
        return null;
    }

    @Override
    public ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) throws RuntimeException {
        return null;
    }

    @Override
    public ShopExecution modifyShop(Shop shop, CommonsMultipartFile shopImg) throws RuntimeException {
        return null;
    }
}
