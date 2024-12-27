package com.cs.spzx.manager.service;

import com.cs.spzx.model.dto.system.LoginDto;
import com.cs.spzx.model.vo.system.LoginVo;

// com.cs.spzx.manager.service
public interface SysUserService {

    /**
     * 根据用户名查询用户数据
     * @return
     */
    public abstract LoginVo login(LoginDto loginDto) ;

}