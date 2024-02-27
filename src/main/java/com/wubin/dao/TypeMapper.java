package com.wubin.dao;

import com.wubin.entity.BillType;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service
public interface TypeMapper extends Mapper<BillType> {
}
