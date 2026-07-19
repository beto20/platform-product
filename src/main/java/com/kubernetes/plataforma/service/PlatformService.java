package com.kubernetes.plataforma.service;


import com.kubernetes.plataforma.model.PlatformResponse;

import java.util.List;

public interface PlatformService {

    List<PlatformResponse> getAll();
}
