package com.rk.mapper;

import com.rk.dao.LogEntity;
import com.rk.model.Request;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LogEntityMapper {
    LogEntityMapper INSTANCE = Mappers.getMapper(LogEntityMapper.class);

    LogEntity logEntity(Request request);

}
