package demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class JavaTestApplicationTests1 {

    /**
     * 算法练习
     */

    @Test
    public void testLambda(){
        System.out.println(UUID.randomUUID());
    }

}
