package com.o2o.service;

import com.o2o.dto.ShopCategoryExecution;
import com.o2o.entity.ShopCategory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.IOException;
import java.util.List;

public interface ShopCategoryService {

    List<ShopCategory> getFirstLevelShopCategoryList() throws IOException;

    List<ShopCategory> getShopCategoryList(Long parentId) throws IOException;

    List<ShopCategory> getAllSecondLevelShopCategory() throws IOException;

    ShopCategory getShopCategoryById(Long shopCategoryId);

    ShopCategoryExecution addShopCategory(ShopCategory shopCategory, CommonsMultipartFile thumbnail);

    ShopCategoryExecution modifyShopCategory(ShopCategory shopCategory,
                                             CommonsMultipartFile thumbnail, boolean thumbnailChange);

    ShopCategoryExecution removeShopCategory(long shopCategoryId);

    ShopCategoryExecution removeShopCategoryList(List<Long> shopCategoryIdList);

}
