package rocks.zipcode;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestStack2(){
        String expected = "Hello world";
        Stack<String> stack = new Stack<>();
        stack.push(expected);
        String actual = stack.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void TestStack3(){
        String expected = "Hello world";
        Stack<String> stack = new Stack<>();
        stack.push(expected);
        String actual = stack.pop();
        assertEquals(expected, actual);
    }
        //HashSet
    @Test
    public void TestSet1() {
        Set set = new HashSet<String>();
        set.add("Hello World");
        assertEquals(false, set.isEmpty());
    }

    @Test
    public void TestSet2() {
        String expected = "Hello World";
        Set set = new HashSet<String>();
        set.add(expected);
        assertTrue(set.contains(expected));
    }

    @Test
    public void TestSet3(){
        String expected = "Hello World";
        Set set = new HashSet<String >();
        set.add(expected);
        assertEquals(false, set.add(expected));
    }

    //List
    @Test
    public void TestList1() {
        List list = new ArrayList<String>();
        list.add("Hello World");
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void TestList2(){
        String expected = "Hello World";
        List list = new ArrayList<String>();
        list.add(expected);
        assertEquals(expected, list.get(0));
    }

    //Map
    @Test
    public void TestMap(){
        Map map = new HashMap<String, Person>();
        String name = "Bob";
        Person person =new Person(name, 10);
        map.put(name, person);
        assertTrue(map.containsValue(person));

    }

    @Test
    public void TestMap1(){
        Map map = new HashMap<String , Person>();
        String name = "Bob";
        Person person= new Person(name, 10);
        map.put(name, person);
        assertTrue(map.containsKey(name));
    }
    @Test
    public void TestMap3 (){
        Map map = new HashMap<String, Person>();
        String name = "Bob";
        Person person = new Person(name, 10);
        map.put(name, person);
        assertEquals(person, map.get(name));
    }


}
