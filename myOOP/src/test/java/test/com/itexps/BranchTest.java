/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.group2.java.myoop.Branch;
import com.group2.java.myoop.Employee;
import com.group2.java.myoop.FullTime;
import com.group2.java.myoop.PartTime;
import java.util.ArrayList;
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
public class BranchTest {
    
    Branch branch;
    
    
    public BranchTest() {
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
    
    public void testBranch(){
        branch = new Branch(1, "IT Expert Branch");
        Employee e1 = new FullTime(2000, 1, "Mary");
        Employee e2 = new FullTime(3000, 2, "Amy");
        Employee e3 = new PartTime(30, 45, 3, "Kevin");
        Employee e4 = new PartTime(40, 55, 4, "Mike");
        
        ArrayList <Employee> empList = new ArrayList<Employee>();
        
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        
        branch.setEmployeeList(empList);
        
        assertEquals(branch.getEmployeeList().size(), 4);
        assertEquals(branch.getEmployeeList().get(1).getName(),"Amy");
        assertEquals( ( (FullTime) ( branch.getEmployeeList().get(0) ) ).getSalary(),2000);
        assertEquals( ( (PartTime) ( branch.getEmployeeList().get(2) ) ).getHours(),30);
        
    }
    
    
    
    
    
    
    
}
