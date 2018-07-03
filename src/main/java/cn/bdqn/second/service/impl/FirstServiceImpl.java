package cn.bdqn.second.service.impl;

import cn.bdqn.second.dao.FirstMapper;
import cn.bdqn.second.pojo.First;
import cn.bdqn.second.service.FirstService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FirstServiceImpl implements FirstService {
    @Resource
    private FirstMapper firstMapper;
    @Override
    public First getFirst(String username, String password) {
        return firstMapper.getFirst(username,password);
    }
}
