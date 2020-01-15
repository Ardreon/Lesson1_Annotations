package org.lesson.tester;

public class MyTest {

    @Before
    public void before1(){
        System.out.println("before 1");
    }

    @After
    public void after1(){
        System.out.println("after 1");
    }

    @AfterAll
    public void afterAll(){
        System.out.println("afterAll 1");
    }

    @BeforeAll
    public void beforeAll(){
        System.out.println("beforeAll 1");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }


    private void noTest(){
        System.out.println("no a test");
    }
}