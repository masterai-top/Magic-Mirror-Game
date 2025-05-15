package com.msld.magicmirror.service;

import com.msld.magicmirror.domain.User;
import com.msld.magicmirror.domain.UserData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDataService {

    List<UserData> queryByUserId(Long userId);

    UserData queryById(Integer id);

    int save(UserData userData);

    int delete(Integer id);

    int queryTotalByUserId(Long userId);

    int updateIsDefault(Integer id, Long userId);

    UserData queryByIsDefault(Long userId);
}
