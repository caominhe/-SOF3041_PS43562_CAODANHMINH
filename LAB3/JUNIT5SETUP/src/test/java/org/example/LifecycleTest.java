package org.example;


import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifecycleTest {

    @BeforeAll
    void beforeAll() {
        System.out.println("1. @BeforeAll - Chạy 1 lần trước tất cả test");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("2. @BeforeEach - Chạy trước mỗi test");
    }

    @Test
    void testCase1() {
        System.out.println("3. @Test - Test case 1");
    }

    @Test
    void testCase2() {
        System.out.println("3. @Test - Test case 2");
    }

    @AfterEach
    void afterEach() {
        System.out.println("4. @AfterEach - Chạy sau mỗi test");
    }

    @AfterAll
    void afterAll() {
        System.out.println("5. @AfterAll - Chạy 1 lần sau tất cả test");
    }
}


