package com.practice.biztech.mix.service;

import com.practice.biztech.mix.entity.City;

import java.util.List;

public interface CityService {

    List<City> listAllCity();

    boolean save(City city);
}
