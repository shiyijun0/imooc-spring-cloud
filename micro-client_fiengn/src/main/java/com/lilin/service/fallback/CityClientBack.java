package com.lilin.service.fallback;

import com.lilin.service.CityClient;
import org.springframework.stereotype.Repository;

@Repository
public class CityClientBack implements CityClient {
    @Override
    public String listCity() {
        return "肉墩墩的方法********";
    }
}
