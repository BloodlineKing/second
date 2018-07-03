package cn.bdqn.second.dao;

import cn.bdqn.second.pojo.First;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FirstMapper {
    /**
     * 登陆获取用户
     * @param username
     * @param password
     * @return
     */
    First getFirst(@Param("username") String username, @Param("password") String password);
}
