package com.elim.mybatisgeneratordemo;

import com.elim.mybatisgeneratordemo.mbg.mapper.TbTestMapper;
import com.elim.mybatisgeneratordemo.mbg.model.TbTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MybatisGeneratorDemoApplicationTests {

    @Autowired
    TbTestMapper tbTestMapper;
    @Test
    void contextLoads() {
        TbTest tbTest = new TbTest();
        tbTest.setName("aaaaaaa");
        tbTest.setPassword("1234546");
        tbTest.setPrice(new BigDecimal(23.20));

        tbTestMapper.insert(tbTest);
    }

}
