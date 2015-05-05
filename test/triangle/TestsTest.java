/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał
 */
public class TestsTest {

    static List<Triangle> triangle_List;
    static List<String> expectedOutput;

    public TestsTest() {
        triangle_List = new ArrayList<>();
        expectedOutput = new ArrayList<>();

        triangle_List.add(new Triangle(4, 1500, 6));
        expectedOutput.add("0");
        triangle_List.add(new Triangle(6, 6, 6));
        expectedOutput.add("1");
        triangle_List.add(new Triangle(4, 1500, 6));
        expectedOutput.add("0");
        triangle_List.add(new Triangle(4, 3333, 6));
        expectedOutput.add("0");

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

    @Test
    public void test1() {
        for (int i = 0; i < triangle_List.size(); i++) {
            assertEquals(Integer.parseInt(expectedOutput.get(i)), triangle_List.get(i).test_triangle());
        }
    }

    @Test
    public void test2() {
        assertEquals(new Triangle(3, 4, 5).test_triangle(),4);
    }
    
    @Test
    public void test3() {
        assertEquals(new Triangle(6,7,8).test_triangle(),5);
    }
    
    // zła odpowiedź
    @Test
    public void test4() {
        assertEquals(new Triangle(6,7,8).test_triangle(),4);
    }

}
