
package radio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Casa
 */
public class RadioclaseTest {
    
    public RadioclaseTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cambiarFrecuencia method, of class Radioclase.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        Radioclase instance = new Radioclase();
        instance.cambiarFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Radioclase.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        Radioclase instance = new Radioclase();
        double expResult = 0.0;
        double result = instance.sacar(boton);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of freq method, of class Radioclase.
     */
    @Test
    public void testFreq() {
        System.out.println("freq");
        int boton = 0;
        Radioclase instance = new Radioclase();
        boolean expResult = false;
        boolean result = instance.freq(boton);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Radioclase.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int boton = 0;
        double emisora = 0.0;
        boolean frecuencia = false;
        Radioclase instance = new Radioclase();
        instance.guardar(boton, emisora, frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Radioclase.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        boolean frecuencia = false;
        double emisora = 530.0;
        Radioclase instance = new Radioclase();
        double expResult = 540.0;
        double result = instance.subirEstacion(frecuencia, emisora);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class Radioclase.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        boolean frecuencia = false;
        double emisora = 530.0;
        Radioclase instance = new Radioclase();
        double expResult = 1610.0;
        double result = instance.bajarEstacion(frecuencia, emisora);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testSacardos() {
        Radioclase instance = new Radioclase();
        double expResult = 0.0;
        double result = instance.sacar(6);
        assertEquals(expResult, result, 0.0);
    }
    
}
