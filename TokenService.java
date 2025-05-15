package com.msld.magicmirror.service;

import com.msld.magicmirror.domain.Token;

import java.util.Map;

public interface TokenService {

    Token queryByToken(String token);

    Map<String, Object> generateToken(Long userId);
}
