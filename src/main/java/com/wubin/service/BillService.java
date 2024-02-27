package com.wubin.service;

import com.wubin.dao.BillMapper;
import com.wubin.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillMapper billMapper;

    public List<Bill> list(Bill bill){
        return billMapper.select(bill);
    }

    public int add(Bill bill){
        return billMapper.insert(bill);
    }

    public Bill get(Long id){
        return billMapper.selectByPrimaryKey(id);
    }

    public int update(Bill bill){
        return billMapper.updateByPrimaryKey(bill);
    }

    public int delete(Long id){
        return billMapper.deleteByPrimaryKey(id);
    }
}
