package com.lilin.service.fallback;

import com.lilin.service.ReportClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ReportClientBack implements ReportClient {
    @Override
    public String listCity(String cityId) {
        return "******法国和***"+cityId;
    }

    @Override
    public String listCity1(String cityId) {
        return "******中国熔断***"+cityId;
    }
}
