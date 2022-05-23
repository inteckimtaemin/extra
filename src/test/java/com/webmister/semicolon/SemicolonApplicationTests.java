package com.webmister.semicolon;

import com.webmister.semicolon.domain.Report;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SemicolonApplicationTests {

    @Autowired
    Report report;

    @Test
    void contextLoads() {
    }
    @Test
    void testDateCreate(){

    }

}
