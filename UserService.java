package com.msld.magicmirror.service;

import com.msld.magicmirror.domain.User;

import java.util.Map;

public interface UserService {

    User queryByUserId(Long userId);

    User queryByOpenid(String openid);

    int save(User user);

    int update(User user);

    Map<String, Object> getInfo(Long userId);

    String getQrCode(Long userId);

    Map<String, Object> getInfoByType(Long userId, Integer type);
}
