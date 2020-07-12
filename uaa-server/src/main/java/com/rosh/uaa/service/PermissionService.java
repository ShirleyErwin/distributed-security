package com.rosh.uaa.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rosh.uaa.entity.PermissionEntry;
import com.rosh.uaa.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: zhurongsheng
 * @Date: 2020/7/11 16:44
 */
@Service
public class PermissionService extends ServiceImpl<PermissionMapper, PermissionEntry> {


    public List<PermissionEntry> getPermissionsByUserId(Integer userId){

        return baseMapper.selectPermissionsByUserId(userId);
    }

}
