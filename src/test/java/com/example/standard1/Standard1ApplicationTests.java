package com.example.standard1;

import com.example.standard1.domain.Standard;
import com.example.standard1.mapper.StandardMapper;
import com.example.standard1.util.Pagination;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Standard1ApplicationTests {
    @Autowired
    private StandardMapper standardMapper;

    @Test
    public void contextLoads() {
/*        Standard standard = new Standard();
        Pagination<Standard> standardPagination = new Pagination<>();
        standardPagination.setCurrentPageIndex(1);
        standardMapper.findByCount(standard,standardPagination).forEach(System.out::println);*/

        //standardMapper.save(new Standard("GB66569-2019","玩具安全第一部分","2017","玩具、规范", LocalDateTime.now(),LocalDateTime.now(),"D:/AAAAA"));
        //standardMapper.update(new Standard(1,"GB66569-2020","玩具安全第一部分","2017","玩具、规范", LocalDateTime.now(),LocalDateTime.now(),"D:/AAAAA"));

        Set<Integer> ids = new HashSet<Integer>();
        ids.add(16);
        ids.add(15);
        ids.add(14);

        standardMapper.delete(ids);
    }

}
