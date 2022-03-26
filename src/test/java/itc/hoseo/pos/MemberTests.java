package itc.hoseo.pos;

import itc.hoseo.pos.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootApplication
public class MemberTests {

    @Test
    void test_김은성(){

        Member m2 = Member.builder()
                .name("김은성")
                .build();

        assertEquals ("김은성",m2.getName());
        assertEquals (30 ,m2.getAge());
    }

    void test_김봉남(){

        Member m1 = new Member(1,"김봉남","1",25);

        assertEquals ("김봉남",m1.getName());
        assertEquals (30 ,m1.getAge());
    }

}



