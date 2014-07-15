/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class InterfaceTest {
    
    public InterfaceTest() {
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
     * Test of cambiarFrecuencia method, of class Interface.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        Interface instance = new InterfaceImpl();
        instance.cambiarFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Interface.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int boton = 0;
        Interface instance = new InterfaceImpl();
        double expResult = 0.0;
        double result = instance.sacar(boton);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of freq method, of class Interface.
     */
    @Test
    public void testFreq() {
        System.out.println("freq");
        int boton = 0;
        Interface instance = new InterfaceImpl();
        boolean expResult = false;
        boolean result = instance.freq(boton);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Interface.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int boton = 0;
        double emisora = 0.0;
        boolean frecuencia = false;
        Interface instance = new InterfaceImpl();
        instance.guardar(boton, emisora, frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subirEstacion method, of class Interface.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        boolean frecuencia = false;
        double emisora = 530.0;
        Interface instance = new InterfaceImpl();
        double expResult = 540.0;
        double result = instance.subirEstacion(frecuencia, emisora);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class Interface.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        boolean frecuencia = false;
        double emisora = 530.0;
        Interface instance = new InterfaceImpl();
        double expResult = 1610.0;
        double result = instance.bajarEstacion(frecuencia, emisora);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class InterfaceImpl implements Interface {

        public void cambiarFrecuencia() {
        }

        public double sacar(int boton) {
            return 0.0;
        }

        public boolean freq(int boton) {
            return false;
        }

        public void guardar(int boton, double emisora, boolean frecuencia) {
        }

        public double subirEstacion(boolean frecuencia, double emisora) {
            return 0.0;
        }

        public double bajarEstacion(boolean frecuencia, double emisora) {
            return 0.0;
        }
    }
    
}
