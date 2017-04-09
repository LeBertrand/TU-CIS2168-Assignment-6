/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assign6_shmuel_jacobs.BinarySearchTree;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test package for methods required in Assignment 6.
 * @author Shmuel Jacobs
 */
public class compTree {
    
    BinarySearchTree<Character> myTree;
    BinarySearchTree<Integer> checkTree;
    String testReport;
    
    public compTree() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Each tree, or pair of trees, printed "
                + "is followed by a statement\nexplaining some signifigance of"
                + " tests performed.\n\n");
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
    public void DepthMinValRecItEmptyOneLongPerfect(){
        
        myTree = new BinarySearchTree<Character>();
        
        //empty tree don't throw and return 0
        assertEquals(0, myTree.depthOfMinValueIterative() );
        assertEquals(0, myTree.depthOfMinValueRecursive() );
        System.out.println(myTree.toString());
        testReport = "Empty Trees' nodes have no depth.\n";
        System.out.println(testReport);
        
        //root leaves don't throw and return 1
        myTree.add('h');
        assertEquals(1, myTree.depthOfMinValueIterative() );
        assertEquals(1, myTree.depthOfMinValueRecursive() );
        System.out.println(myTree.toString());
        testReport = "Root of tree has depth of 1.\n";
        System.out.println(testReport);
        
        //add right child and see that it changes nothing
        myTree.add('z');
        assertEquals(1, myTree.depthOfMinValueIterative() );
        assertEquals(1, myTree.depthOfMinValueRecursive() );
        System.out.println(myTree.toString());
        testReport = "Even with greater values present, " + testReport;
        System.out.println(testReport);
        
        //add to both subtrees and check that only left child is counted
        myTree.add('a');
        myTree.add('i');
        assertEquals(2, myTree.depthOfMinValueIterative() );
        assertEquals(2, myTree.depthOfMinValueRecursive() );
        System.out.println(myTree.toString());
        testReport = "Depth of minimum value in tree correct: 2\n";
        System.out.println(testReport);
    }
    
    @Test
    public void structCheckEmptyOneSmallBig(){
        myTree = new BinarySearchTree<Character>();
        checkTree = new BinarySearchTree<Integer>();
        
        //trees are empty - same structure
        assertTrue(myTree.equalStruct(checkTree));
        assertTrue(checkTree.equalStruct(myTree));
        
        System.out.println(myTree.toString());
        System.out.println(myTree.toString());
        printTrees();
        testReport = "Empty trees have same structure.\n";
        System.out.println(testReport);
        
        //add one, equalsStruct is false
        myTree.add('h');
        assertFalse(myTree.equalStruct(checkTree));
        printTrees();
        testReport = "Leaf doesn't have same structure as empty tree.\n";
        System.out.println(testReport);
        
        //add one to check tree, to make structures equal again
        checkTree.add(5);
        assertTrue(myTree.equalStruct(checkTree));
        assertTrue(checkTree.equalStruct(myTree));
        printTrees();
        testReport = "Leaves have same shape.\n";
        System.out.println(testReport);
        
        //put three nodes in both, at different places in right subtree
        checkTree.add(3);
        checkTree.add(2);
        checkTree.add(7);
        
        myTree.add('d');
        myTree.add('f');
        myTree.add('w');
        
        assertFalse(myTree.equalStruct(checkTree));
        printTrees();
        testReport = "Trees have different shapes.\n";
        System.out.println(testReport);
        
        //fill trees and make them match again
        
        checkTree.add(4);
        myTree.add('a');
        
        assertTrue(myTree.equalStruct(checkTree));
        assertTrue(checkTree.equalStruct(myTree));
        
        printTrees();
        testReport = "Algorithm can determine that large trees have "
                + "same structure.\n";
        System.out.println(testReport);
    }
    
    private void printTrees(){
        System.out.println(myTree.toString());
        System.out.println(checkTree.toString());
    }
}
