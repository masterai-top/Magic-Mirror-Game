package com.msld.magicmirror.service;

import com.msld.magicmirror.domain.ZhanBu;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public interface ZhanBuService {

    ZhanBu queryByTypeAndGuaXiangCode(Integer type, Integer guaXiangCode);

    Map<String, Object> info(Long userId, Integer type);

    void draw(Long userId, Integer type, OutputStream outputStream) throws IOException;
}
