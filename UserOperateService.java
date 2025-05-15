package com.msld.magicmirror.service;

import com.msld.magicmirror.domain.UserOperate;
import com.msld.magicmirror.framework.enums.UserOperateEnum;


public interface UserOperateService {

    int save(Long userId, UserOperateEnum userOperateEnum);
}
