package ual.hmis.session5.exercise2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise2Test {
    @Test
    void testFirst() {
        Exercise2 test1 = new Exercise2();
        boolean result = test1.checkLoginInDB("", "");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void testSecond() {
        Exercise2 test2 = new Exercise2();
        boolean result = test2.checkLoginInDB("xavi", "pass");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void testThird() {
        Exercise2 test3 = new Exercise2();
        boolean result = test3.checkLoginInDB("user", "xavi");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void testFourth() {//assertTrue(login.compruebaLoginEnBD("user", "pass"));
        Exercise2 test4 = new Exercise2();
        boolean result = test4.checkLoginInDB("user", "pass");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void testFifth() {//dwa zle
        Exercise2 test5 = new Exercise2();
        boolean result = test5.checkLoginInDB("abcd", "efgh");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void loginTest1() {
        Exercise2 test6 = new Exercise2();
        boolean result = test6.login("user", "pass");
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    void loginTest2() {
        Exercise2 test7 = new Exercise2();
        boolean result = test7.login("", "");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void loginTest3() {
        Exercise2 test8 = new Exercise2();
        boolean result = test8.login("user", "qwertyuiopasdfghjklzxcvbnmqwert");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void loginTest4() {
        Exercise2 test9 = new Exercise2();
        boolean result = test9.login("qwertyuiopasdfghjklzxcvbnmqwert", "pass");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void loginTest5() {
        Exercise2 test10 = new Exercise2();
        boolean result = test10.login("", "pass");
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void loginTest6() {
        Exercise2 test11 = new Exercise2();
        boolean result = test11.login("user", "");
        boolean expected = false;
        assertEquals(expected, result);
    }

}
