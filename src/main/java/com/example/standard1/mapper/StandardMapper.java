package com.example.standard1.mapper;


import com.example.standard1.domain.Standard;
import com.example.standard1.util.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

@Mapper
public interface StandardMapper {
    int pageCount(@Param("standard") Standard standard);
    int save(Standard standard);
    List<Standard> findByCount(@Param("standard") Standard standard, @Param("pagination") Pagination pagination);
    int update(Standard standard);
    int delete(@Param("ids") Set<Integer> ids);
}
