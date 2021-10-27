import com.aslbank.calculadora.model.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraIT {

    private Calculator calculator;

    @Before
    public void setUpClass() {this.calculator = new Calculator();}

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("Function Add");
        float a = 3;
        float b = 5;
        float expResult = a+b;
        float result = this.calculator.add(a,b);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testSubstract(){
        System.out.println("Function Substract");
        float a = 3;
        float b = 5;
        float expResult = b-a;
        float result = this.calculator.substract(b,a);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testMultiply(){
        System.out.println("Function Multiply");
        float a = 3;
        float b = 5;
        float expResult = a*b;
        float result = this.calculator.multiply(b,a);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testDiv(){
        System.out.println("Function Div");
        float a = 3;
        float b = 5;
        float expResult = a/b;
        float result = this.calculator.div(a,b);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testPow10(){
        System.out.println("Function Pow10");
        float a = 3;
        float expResult = (float) Math.pow(a,10);
        float result = this.calculator.pow10(a);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testSqrt(){
        System.out.println("Function Sqrt");
        double a = 3;
        double expResult = Math.sqrt(a);
        double result = this.calculator.sqrt(a);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testNfact(){
        System.out.println("Function n!");
        double a = 10;
        double expResult = 3628800;
        double result = this.calculator.Nfactorial(a);
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testLog10(){
        System.out.println("Function Log base 10");
        double a = 10;
        double expResult = 1;
        double result = this.calculator.log10(a);
        assertEquals(expResult,result,0.0);
    }

    
}
