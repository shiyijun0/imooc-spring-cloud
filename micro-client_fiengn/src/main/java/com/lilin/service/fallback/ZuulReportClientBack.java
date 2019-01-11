package com.lilin.service.fallback;

import com.lilin.service.ZuulReportClient;
import org.springframework.stereotype.Repository;

@Repository
public class ZuulReportClientBack implements ZuulReportClient {
    @Override
    public String listCity(String cityId) {
        return "******法国和***"+cityId;
    }

    @Override
    public String listCity1(String cityId) {
        return "******中国熔断***"+cityId;
    }
}
