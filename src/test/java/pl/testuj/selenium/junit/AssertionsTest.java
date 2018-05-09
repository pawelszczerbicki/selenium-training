package pl.testuj.selenium.junit;

import org.junit.jupiter.api.*;

import static java.time.Duration.ofSeconds;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

    
    @BeforeAll
    static void beforeAllExample() {
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAllExample() {
        System.out.println("After all");
    }

    @BeforeEach
    void beforeEachExample() {
        System.out.println("Before each");
    }

    @AfterEach
    void afterEachExample() {
        System.out.println("After each");
    }

    @Test
    void assertEq() {
        assertEquals(1, 1);
    }

    @Test
    void assertException() {
        String test = null;
        Assertions.assertThrows(NullPointerException.class, () -> test.toLowerCase());
    }

    @Test
    void notSame() {
        assertNotSame("a", "b");
//        assertNotSame("a", "a");
    }

    @Test
    void collectionsEquals() {
        assertIterableEquals(asList("1", "2", "3"), asList("1", "2", "3"));
    }

    @Test
    void timeout() {
        assertTimeout(ofSeconds(6), () -> {
        });
    }

    @Test
    @Disabled
    void ignore() {
        System.out.println("test disabled");
    }

    @Test
    void shouldFail() {
        if (1 == 2)
            Assertions.fail();
    }
}
