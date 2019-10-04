package com.practice.biztech.mix.service.impl;

import com.practice.biztech.mix.dal.CityMapper;
import com.practice.biztech.mix.entity.City;
import com.practice.biztech.mix.service.CityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityMapper cityMapper;

    public CityServiceImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public List<City> listAllCity() {
        return cityMapper.selectAll();
    }

    @Transactional
    @Override
    public boolean save(City city) {
        int count = cityMapper.insert(city);

        return count > 0;
    }
}
