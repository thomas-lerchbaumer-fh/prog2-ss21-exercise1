import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class PasswordTest {

    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp() {}

    @Test
    void testCheckLength1() {
        PasswordChecker pw = new PasswordChecker();
        boolean expected = false;
        boolean actual = pw.checkLength("thomas");
        assertEquals(expected,actual);
    }

    @Test
    void testCheckLength2() {
        PasswordChecker pw = new PasswordChecker();
        boolean expected = false;
        boolean actual = pw.checkLength("thomas231589472895748954238905048927892357923457489235432");
        assertEquals(expected,actual);
    }

    @Test
    void testCheckLength3() {
        PasswordChecker pw = new PasswordChecker();
        boolean expected = true;
        boolean actual = pw.checkLength("thomasIsTesting");
        assertEquals(expected,actual);
    }

    @Test
    void testCheckUpperCase1(){
        PasswordChecker password = new PasswordChecker();
        boolean expected = false;
        boolean actual = password.checkCaps("thomas");
        assertEquals(expected,actual);
    }

    @Test
    void testCheckUpperCase2(){
        PasswordChecker password = new PasswordChecker();
        boolean expected = false;
        boolean actual = password.checkCaps("THOMAS");
        assertEquals(expected,actual);
    }

    @Test
    void testCheckUpperCase3(){
        PasswordChecker password = new PasswordChecker();
        boolean expected = true;
        boolean actual = password.checkCaps("THOmAS");
        assertEquals(expected,actual);
    }




}
