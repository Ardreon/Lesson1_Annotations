package org.lesson.tester;

public class TesterDemo {
    public static void main(String[] args) throws Exception {
        final TestRunner runner = new TestRunner();
        runner.run(MyTest.class);
    }
}
