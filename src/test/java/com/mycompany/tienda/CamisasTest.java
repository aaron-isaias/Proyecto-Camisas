package com.mycompany.tienda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CamisasTest {
    
    public CamisasTest() {
    }

    @Test
    public void testCamisaCort() {
        System.out.println("Prueba unitaria de camisas cortas");
        int num1 = 0;
        Camisas instance = new Camisas();
        int expResult = 0;
        int result = instance.camisaCort(num1);
        assertEquals(expResult, result);
    }

    @Test
    public void testCamisaCas() {
        System.out.println("Prueba unitaria de camisas Casuales de manga larga");
        int num2 = 0;
        Camisas instance = new Camisas();
        int expResult = 0;
        int result = instance.camisaCas(num2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCamisaFor() {
        System.out.println("Prueba unitaria de camisas Formales de manga larga");
        int num3 = 0;
        Camisas instance = new Camisas();
        int expResult = 0;
        int result = instance.camisaFor(num3);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumCam() {
        System.out.println("Suma de las Camisas");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Camisas instance = new Camisas();
        int expResult = 0;
        int result = instance.SumCam(num1, num2, num3);
        assertEquals(expResult, result);

    }
    
}
