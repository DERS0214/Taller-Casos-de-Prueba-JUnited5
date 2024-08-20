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
    public void TCS01() {
        System.out.println("suma");
        double a = -2;
        double b = -2;
        Calculadora instance = new Calculadora();
        double expResult = -4.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCS02() {
        System.out.println("suma");
        double a = 0;
        double b = 0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCS03() {
        System.out.println("suma");
        double a = 2.5;
        double b = 3.6;
        Calculadora instance = new Calculadora();
        double expResult = 6.2;
        double result = instance.suma(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCS04() {
        System.out.println("suma");
        double a = 1000000;
        double b = 2000000;
        Calculadora instance = new Calculadora();
        double expResult = 3000000.00;
        double result = instance.suma(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCS05() {
        System.out.println("suma");
        double a = 7;
        double b = -2;
        Calculadora instance = new Calculadora();
        double expResult = 5.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result);
    }    

    @Test
    public void TCR01() {
        System.out.println("resta");
        double a = 10;
        double b = 5;
        Calculadora instance = new Calculadora();
        double expResult = 5;
        double result = instance.resta(a, b);
        assertEquals(expResult, result);      
    }
    
    @Test
    public void TCR02() {
        System.out.println("resta");
        double a = -10;
        double b = -5;
        Calculadora instance = new Calculadora();
        double expResult = -5;
        double result = instance.resta(a, b);
        assertEquals(expResult, result);      
    }
    
    @Test
    public void TCR03() {
        System.out.println("resta");
        double a = 0;
        double b = 0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result);      
    }
    
    @Test
    public void TCR04() {
        System.out.println("resta");
        double a = 3.5;
        double b = 1.2;
        Calculadora instance = new Calculadora();
        double expResult = 2.3;
        double result = instance.resta(a, b);
        assertEquals(expResult, result);      
    }   

    @Test
    public void TCM01() {
        System.out.println("multiplicacion");
        double a = 4;
        double b = 6;
        Calculadora instance = new Calculadora();
        double expResult = 24;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCM02() {
        System.out.println("multiplicacion");
        double a = -7;
        double b = 5;
        Calculadora instance = new Calculadora();
        double expResult = -35;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCM03() {
        System.out.println("multiplicacion");
        double a = -6;
        double b = -6;
        Calculadora instance = new Calculadora();
        double expResult = 36;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCM04() {
        System.out.println("multiplicacion");
        double a = 0;
        double b = 2;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCM05() {
        System.out.println("multiplicacion");
        double a = 0.5;
        double b = 0.2;
        Calculadora instance = new Calculadora();
        double expResult = 0.1;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCM06() {
        System.out.println("multiplicacion");
        double a = 10000;
        double b = 0.01;
        Calculadora instance = new Calculadora();
        double expResult = 100;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);       
    }

    @Test
    public void TCD01() {
        System.out.println("division");
        double a = 10;
        double b = 2;
        Calculadora instance = new Calculadora();
        double expResult = 5;
        double result = instance.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD02() {
        System.out.println("division");
        double a = 10;
        double b = -2;
        Calculadora instance = new Calculadora();
        double expResult = -5;
        double result = instance.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD03() {
        System.out.println("division");
        double a = 0;
        double b = 25;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD04() {
        System.out.println("division");
        double a = 108;
        double b = 0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCD05() {
        System.out.println("division");
        double a = 25;
        double b = 10;
        Calculadora instance = new Calculadora();
        double expResult = 2.50;
        double result = instance.division(a, b);
        assertEquals(expResult, result);
    }
    
    // EXPONENCIACIÓN
    @Test
    public void TCE01() {
        System.out.println("exponenciacion");
        double base = 2;
        double exponente = 3;
        Calculadora instance = new Calculadora();
        double expResult = 8;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCE02() {
        System.out.println("exponenciacion");
        double base = 2;
        double exponente = -3;
        Calculadora instance = new Calculadora();
        double expResult = 0.125;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCE03() {
        System.out.println("exponenciacion");
        double base = -2;
        double exponente = 3;
        Calculadora instance = new Calculadora();
        double expResult = -8;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCE04() {
        System.out.println("exponenciacion");
        double base = 2;
        double exponente = 0;
        Calculadora instance = new Calculadora();
        double expResult = 1;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCE05() {
        System.out.println("exponenciacion");
        double base = 0;
        double exponente = 2;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void TCE06() {
        System.out.println("exponenciacion");
        double base = 2;
        double exponente = 0.5;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0.00999);       
    }
    
    @Test
    public void TCE07() {
        System.out.println("exponenciacion");
        double base = 2;
        double exponente = 1/2;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result);       
    }

    //RADICACIÓN
    @Test
    public void TCRD01() {
        System.out.println("radicacion");
        double numero = 16;
        double indice = 2;
        Calculadora instance = new Calculadora();
        double expResult = 4;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCRD02() {
        System.out.println("radicacion");
        double numero = 27;
        double indice = 3;
        Calculadora instance = new Calculadora();
        double expResult = 3;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCRD03() {
        System.out.println("radicacion");
        double numero = -16;
        double indice = 2;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCRD04() {
        System.out.println("radicacion");
        double numero = 0;
        double indice = 2;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCRD05() {
        System.out.println("radicacion");
        double numero = 81;
        double indice = 4;
        Calculadora instance = new Calculadora();
        double expResult = 3;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCRD06() {
        System.out.println("radicacion");
        double numero = 10;
        double indice = 2.5;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCRD07() {
        System.out.println("radicacion");
        double numero = 10.5;
        double indice = 2;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCRD08() {
        System.out.println("radicacion");
        double numero = 10.5;
        double indice = 0;
        Calculadora instance = new Calculadora();
        double result = instance.radicacion(numero, indice);
        assertTrue(Double.isInfinite(result));
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
    }
    
    @Test
    public void TNA02() {
        System.out.println("sonAmigos");
        int a = 10;
        int b = 10;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
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

    //SUMA DE DIVISORES
    @Test
    public void TCSD01() {
        System.out.println("sumaDivisores");
        int x = 6;
        Calculadora instance = new Calculadora();
        int expResult = 12;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCSD02() {
        System.out.println("sumaDivisores");
        int x = -10;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCSD03() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }   
       
    @Test
    public void TCSD05() {
        System.out.println("sumaDivisores");
        int x = 7;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        double result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TCSD06() {
        System.out.println("sumaDivisores");
        int x = 1;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        double result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
}
