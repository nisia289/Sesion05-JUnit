package ual.hmis.session05.exercise1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void transform1() {//x=1
        Exercise1 for1 = new Exercise1();
        int result = for1.transform(1);
        int expected = 1;
        assertEquals(expected,result);
    }
    @Test
    void transform2() {//x=2
        Exercise1 for2 = new Exercise1();
        int result = for2.transform(2);
        int expected = 1;
        assertEquals(expected,result);
    }

    @Test
    void transform3() {//x=3
        Exercise1 for3 = new Exercise1();
        int result = for3.transform(3);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void transform5() {//x=5
        Exercise1 for5 = new Exercise1();
        int result = for5.transform(5);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void transformMinus() {//x=-7
        Exercise1 forMinus = new Exercise1();
        int result = forMinus.transform(-7);
        int expected = -7;
        assertEquals(expected, result);
    }
}




