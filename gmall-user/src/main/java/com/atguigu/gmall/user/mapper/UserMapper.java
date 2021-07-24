package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 通用mapper
 */
public interface UserMapper extends Mapper<UmsMember>{

    //此处也可以自定义select语句（此处的select语句未被使用）
    List<UmsMember> selectAllUser();

}
