package com.rohid.services;

import com.rohid.model.City;
import com.rohid.repository.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    public List<City> findAll() {

        List<City> cities = (List<City>) repository.findAll();

        return cities;
    }
}