package com.wubin.service;

import com.wubin.dao.TypeMapper;
import com.wubin.entity.BillType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    @Autowired
    private TypeMapper typeMapper;

    public List<BillType> list(){
        return typeMapper.selectAll();
    }
}
