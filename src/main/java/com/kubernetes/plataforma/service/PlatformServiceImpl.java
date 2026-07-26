package com.kubernetes.plataforma.service;


import com.kubernetes.plataforma.model.PlatformResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformServiceImpl implements PlatformService {
    @Override
    public List<PlatformResponse> getAll() {
        var dto1 = new PlatformResponse("demo", 2);
        var dto2 = new PlatformResponse("Maquina demo", 1);
        var dto3 = new PlatformResponse("Monitoreo", 3);
        var dto4 = new PlatformResponse("PaaS", 5);

        return List.of(dto1, dto2, dto3, dto4);
    }
}
