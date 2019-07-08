package com.example.standard1.service.impl;


import com.example.standard1.domain.Standard;
import com.example.standard1.mapper.StandardMapper;
import com.example.standard1.service.StandardService;
import com.example.standard1.util.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StandardServiceImpl implements StandardService {

    @Autowired
    private StandardMapper standardMapper;
    @Override
    public int pageCount(Standard standard) {
        return standardMapper.pageCount(standard);
    }

    @Override
    public int save(Standard standard) {
        return standardMapper.save(standard);
    }

    @Override
    public List<Standard> findByCount(Standard standard, Pagination pagination) {
        //先获得行数
        //int count = standardMapper.pageCount(standard);


        return standardMapper.findByCount(standard,pagination);
    }

    @Override
    public int update(Standard standard) {
        return standardMapper.update(standard);
    }

    @Override
    public int delete(Set<Integer> ids) {
        return standardMapper.delete(ids);
    }
}
