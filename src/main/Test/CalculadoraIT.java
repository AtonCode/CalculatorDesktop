import com.aslbank.calculadora.model.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraIT {


    @Before
    public void setUpClass() {}

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("Function Add");
        float a = 3;
        float b = 5;
        float expResult = a+b;
        float result = Calculator.add(a,b);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testSubstract(){
        System.out.println("Function Substract");
        float a = 3;
        float b = 5;
        float expResult = b-a;
        float result = Calculator.substract(b,a);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testMultiply(){
        System.out.println("Function Multiply");
        float a = 3;
        float b = 5;
        float expResult = a*b;
        float result = Calculator.multiply(b,a);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testDiv(){
        System.out.println("Function Div");
        float a = 3;
        float b = 5;
        float expResult = a/b;
        float result = Calculator.div(a,b);
        assertEquals(expResult,result,0.0);
    }

    
}
