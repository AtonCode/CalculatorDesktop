import com.aslbank.calculadora.model.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraIT {

    private Calculator calculator;

    @Before
    public void setUpClass() {
        this.calculator = new Calculator();
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("Function Add");
        this.calculator.setA(3);
        this.calculator.setB(5);
        float expResult = 8;
        float result = this.calculator.add();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testSubstract(){
        System.out.println("Function Substract");
        this.calculator.setA(5);
        this.calculator.setB(3);
        float expResult = 2;
        float result = this.calculator.substract();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testMultiply(){
        System.out.println("Function Multiply");
        this.calculator.setA(1);
        this.calculator.setB(5);
        float expResult = 5;
        float result = this.calculator.multiply();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testDiv(){
        System.out.println("Function Div");
        this.calculator.setA(4);
        this.calculator.setB(2);
        float expResult = 2;
        float result = this.calculator.div();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testPow10(){
        System.out.println("Function Pow10");
        this.calculator.setA(3);
        float expResult = 30;
        float result = this.calculator.x10();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testSqrt(){
        System.out.println("Function Sqrt");
        this.calculator.setA(1);
        float expResult = 1;
        float result = (float) this.calculator.sqrt();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testNfact(){
        System.out.println("Function n!");
        this.calculator.setA(10);
        float expResult = 3628800;
        float result = (float) this.calculator.Nfactorial();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testLog10(){
        System.out.println("Function Log base 10");
        this.calculator.setA(10);
        float expResult = 1;
        float result = (float) this.calculator.log10();
        assertEquals(expResult,result,0.0);
    }

    @Test
    public void testMod(){
        System.out.println("Function Modulo");
        this.calculator.setA(6);
        this.calculator.setB(9);
        float expResult = 6;
        float result = this.calculator.mod();
        assertEquals(expResult,result,0.0);
    }


    
}
