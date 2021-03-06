package com.dyhc.sdglgroundconnection.service.impl;

import com.dyhc.sdglgroundconnection.mapper.HotelMapper;
import com.dyhc.sdglgroundconnection.pojo.Hotel;
import com.dyhc.sdglgroundconnection.service.HotelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 酒店业务实现
 **/
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    public PageInfo<Hotel> listHotels(Integer pageNo, Integer PageSize) {
        PageHelper.startPage(pageNo, PageSize, true);
        PageInfo<Hotel> pageInfo = new PageInfo<>(hotelMapper.selectAll());
        return pageInfo;
    }
}
