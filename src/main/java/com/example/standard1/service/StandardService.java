package com.example.standard1.service;


import com.example.standard1.domain.Standard;
import com.example.standard1.util.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface StandardService {
    int pageCount(@Param("standard") Standard standard);
    int save(Standard standard);
    List<Standard> findByCount(@Param("standard") Standard standard, @Param("pagination") Pagination pagination);
    int update(Standard standard);
    int delete(Set<Integer> ids);
}
