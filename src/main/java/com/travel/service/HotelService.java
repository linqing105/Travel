package com.travel.service;

import com.travel.domain.Hotel;

import java.util.List;

public interface HotelService {

    //后台查询所有酒店
    public abstract List<Hotel> findAllHotel(Integer page, Integer size) throws Exception;

    //根据酒店名模糊查询
    public abstract List<Hotel> fuzzyQuery(String hName) throws Exception;

    //添加新酒店
    public abstract int addHotel(Hotel hotel) throws Exception;

    //根据id删除酒店
    public abstract int deleteHotel(Integer hotelId) throws Exception;

    //修改酒店信息
    public abstract int updateHotel(Hotel hotel) throws Exception;

    //根据destId查询酒店
    public abstract List<Hotel> findHotelsByDestId(Integer destId) throws Exception;

}
