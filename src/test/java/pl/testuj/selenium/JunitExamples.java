package pl.testuj.selenium;

import org.junit.jupiter.api.*;

public class JunitExamples {

    @BeforeAll
    static void init(){
        System.out.println("before all");
    }

    @AfterAll
    static void clean(){
        System.out.println("after all");
    }

    @BeforeEach
    void setup(){
        System.out.println("setup");
    }

    @AfterEach
    void tearDown(){
        System.out.println("tear down");
    }

    @Test
    void shouldJunitWorks() {
        System.out.println("test");
        Assertions.assertTrue(true);
    }

    @Test
    void shouldJunitWorksSecond() {
        System.out.println("test2");
        Assertions.assertTrue(true);
    }
}
