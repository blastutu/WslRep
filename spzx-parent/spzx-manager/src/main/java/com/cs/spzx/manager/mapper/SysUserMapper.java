package com.cs.spzx.manager.mapper;

import com.cs.spzx.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysUserMapper {

    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    @Select("SELECT * from sys_user where username=#{username}")
    public abstract SysUser selectByUserName(String userName) ;

}