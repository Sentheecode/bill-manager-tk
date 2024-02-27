package com.wubin.dao;

import com.wubin.entity.Bill;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service
public interface BillMapper extends Mapper<Bill> {

    public List<Bill> select(Bill bill);
}
