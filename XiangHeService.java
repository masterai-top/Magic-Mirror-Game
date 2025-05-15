package com.msld.magicmirror.service;

import com.msld.magicmirror.domain.XiangHe;
import com.msld.magicmirror.domain.vo.XiangHeVO;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public interface XiangHeService {

    XiangHe queryByTypeAndGuaXiangCode(Integer type, Integer guaXiangCode);

    Map<String, Object> info(Long userId, XiangHeVO xiangHeVO);

    void draw(Long userId, XiangHeVO xiangHeVO, OutputStream outputStream) throws IOException;
}
