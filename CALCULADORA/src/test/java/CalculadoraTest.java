import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExponenciacion() {
        System.out.println("exponenciacion");
        double base = 0.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    //RADICACION
    @Test
    public void TCR01() {
        System.out.println("radicacion");
        double numero = 16;
        double indice = 2;
        Calculadora instance = new Calculadora();
        double expResult = 4;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void TCR02() {
        System.out.println("radicacion");
        double numero = 27;
        double indice = 3;
        Calculadora instance = new Calculadora();
        double expResult = 3;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void TCR03() {
        System.out.println("radicacion");
        double numero = -16;
        double indice = 2;
        Calculadora instance = new Calculadora();
        double expResult = 3;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
    }

    //NUMEROS AMIGOS
    @Test
    public void TNA01() {
        System.out.println("sonAmigos");
        int a = 220;
        int b = 284;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void TNA02() {
        System.out.println("sonAmigos");
        int a = 10;
        int b = 14;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void TNA03() {
        System.out.println("sonAmigos");
        int a = -220;
        int b = -284;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }

    //DIVISORES
    @Test
    public void TCD01() {
        System.out.println("sumaDivisores");
        int x = 6;
        Calculadora instance = new Calculadora();
        int expResult = 12;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD02() {
        System.out.println("sumaDivisores");
        int x = -10;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD03() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD04() {
        System.out.println("sumaDivisores");
        double x = 1.5;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        double result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD05() {
        System.out.println("sumaDivisores");
        int x = 7;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        double result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD06() {
        System.out.println("sumaDivisores");
        int x = 1;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        double result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
}
