package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.VehicleType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 车辆类型
 **/
@Mapper
@Component
public interface VehicleTypeMapper extends CommonMapper<VehicleType> {
}
