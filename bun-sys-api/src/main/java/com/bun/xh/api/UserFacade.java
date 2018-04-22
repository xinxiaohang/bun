package com.bun.xh.api;

import com.bun.xh.vo.LoginRequest;
import com.bun.xh.vo.LoginResponse;
import com.bun.xh.vo.RegisterRequest;
import com.bun.xh.vo.RegisterResponse;

/**
 * Created by xin on 2018/4/6.
 */
public interface UserFacade {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);


}
