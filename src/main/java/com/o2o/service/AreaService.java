package com.o2o.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.o2o.dto.AreaExecution;
import com.o2o.entity.Area;

import java.io.IOException;
import java.util.List;

public interface AreaService {

    List<Area> getAreaList() throws JsonParseException, JsonMappingException, IOException;

    AreaExecution addArea(Area area);

    AreaExecution modifyArea(Area area);

    AreaExecution removeArea(long areaId);

    AreaExecution removeAreaList(List<Long> areaIdList);

}
