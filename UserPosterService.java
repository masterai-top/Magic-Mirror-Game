package com.msld.magicmirror.service;

import com.msld.magicmirror.domain.UserPoster;

public interface UserPosterService {

    UserPoster queryByUserId(Long userId);
}
