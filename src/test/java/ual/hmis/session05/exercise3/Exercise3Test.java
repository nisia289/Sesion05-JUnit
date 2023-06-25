package ual.hmis.session05.exercise3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    @Test
    void correctPassword1() {
        Exercise3 test1 = new Exercise3();
        String result = test1.correctPassword("xavi"); //<5
        String expected = "password too short";
        assertEquals(expected, result);
    }

    @Test
    void correctPassword2() {
        Exercise3 test2 = new Exercise3();
        String result = test2.correctPassword("abcdefg"); //5<8
        String expected = "********";
        assertEquals(expected, result);
    }

    @Test
    void correctPassword3() {
        Exercise3 test3 = new Exercise3();
        String result = test3.correctPassword("barcelonaisthebest"); //<40
        String expected = "************";
        assertEquals(expected, result);
    }

    @Test
    void correctPassword4() {
        Exercise3 test3 = new Exercise3();//has more than 40 characters
        String result = test3.correctPassword("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        String expected = "password too long";
        assertEquals(expected, result);
    }





}