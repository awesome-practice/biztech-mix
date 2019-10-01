package com.practice.biztech.mix.controller;

import com.practice.biztech.mix.entity.City;
import com.practice.biztech.mix.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping("/listcity")
    public List<City> listCity() {
        return cityService.listAllCity();
    }
}
