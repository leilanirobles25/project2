/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.group2.java.myoop.Employee;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author wende
 */
public class EmployeeTest {
    
    Employee emp;
    
    public EmployeeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testId() {
        emp = new Employee (1, "Tom");
        assertEquals(emp.getId(), 1);
                
    }
    
    @Test
    public void testName() {
        emp = new Employee (2,"Amy");
        assertEquals(emp.getName(), "Amy");
    }
    
    @Test
    
    public void testIdName() {
        emp = new Employee (3,"Mary");
        emp.setId(5);
        emp.setName("Mira");
        
        assertEquals(emp.getId(), 5);
        assertEquals(emp.getName(), "Mira");
    }
    
}
