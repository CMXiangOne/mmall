package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by johncheng on 2017/8/25.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
