import com.zipcodewilmington.scientificcalculator.CalculatorEngine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static java.lang.Math.*;
import java.util.function.*;



class CalculatorEngineTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void add() {
        double expected = 5;
        double actual = CalculatorEngine.add(2, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        double expected = -1;
        double actual = CalculatorEngine.subtract(2, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        double expected = 6;
        double actual = CalculatorEngine.multiply(2, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void square() {
        double expected = 4;
        double actual = CalculatorEngine.square(2, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sqRoot() {
        double expected = 2;
        double actual = CalculatorEngine.sqRoot(4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void degreeToRad() {
        double expected = 0.7853981633974483;
        double actual = CalculatorEngine.degToRad(45);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void radToDegree() {
        double expected = 45;
        double actual = CalculatorEngine.radToDeg(0.7853981633974483);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sine() {
        double expected = 0.8509035245341184;
        double actual = CalculatorEngine.sine(45);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void cosine() {
        double expected = -0.4161468365471424;
        double actual = CalculatorEngine.cosine(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void tangent() {
        double expected = -0.1425465430742778;
        double actual = CalculatorEngine.tangent(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void aSine() {
        double expected = 0.5510698464925733;
        double actual = CalculatorEngine.aSine(0.523599);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void aCosine() {
        double expected = 1.0471975511965979;
        double actual = CalculatorEngine.aCosine(0.5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void aTangent() {
        double expected = 1.4125642791467878;
        double actual = CalculatorEngine.aTangent(6.267);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Log() {
        double expected = 3;
        double actual = CalculatorEngine.commonLog(1000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void invCommonLog() {
        double expected = 100;
        double actual = CalculatorEngine.invCommonLog(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ln() {
        double expected = 2.302585092994046;
        double actual = CalculatorEngine.ln(10);
        Assertions.assertEquals(expected, actual);
        }


    @Test
    void invLn() {
        double expected = 7.38905609893065;
        double actual = CalculatorEngine.invLn(2);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void factorial() {
        double expected = 120;
        double actual = CalculatorEngine.factorial(5);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void randomNum() {
        double actual = CalculatorEngine.randomNum();
        Assertions.assertTrue(actual < 1000);

    }
}