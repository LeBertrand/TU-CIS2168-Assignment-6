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
public class BSTgetsTests {
    
    BinarySearchTree<Character> myTree;
    
    public BSTgetsTests() {
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
    public void DepthMinValRecItEmptyOneLongPerfect(){
        
        myTree = new BinarySearchTree<Character>();
        
        //empty tree don't throw and return 0
        assertEquals(0, myTree.depthOfMinValueIterative() );
        assertEquals(0, myTree.depthOfMinValueRecursive() );
        
        //root leaves don't throw and return 1
        myTree.add('h');
        assertEquals(1, myTree.depthOfMinValueIterative() );
        assertEquals(1, myTree.depthOfMinValueRecursive() );
        
        //add right child and see that it changes nothing
        myTree.add('z');
        assertEquals(1, myTree.depthOfMinValueIterative() );
        assertEquals(1, myTree.depthOfMinValueRecursive() );
        
        //add to both subtrees and check that only left child is counted
        myTree.add('a');
        myTree.add('i');
        assertEquals(2, myTree.depthOfMinValueIterative() );
        assertEquals(2, myTree.depthOfMinValueRecursive() );
    }
    
    @Test
    public void structCheckEmptyOneSmallBig(){
        myTree = new BinarySearchTree<Character>();
        BinarySearchTree<Integer> checkTree = new BinarySearchTree<>();
        
        //trees are empty - same structure
        assertTrue(myTree.equalStruct(checkTree));
        assertTrue(checkTree.equalStruct(myTree));
        
        //add one, equalsStruct is false
        myTree.add('h');
        assertFalse(myTree.equalStruct(checkTree));
        
        //add one to checktree, to make structures equal again
        checkTree.add(5);
        assertTrue(myTree.equalStruct(checkTree));
        assertTrue(checkTree.equalStruct(myTree));
        
        //put three nodes in both, at different places in right subtree
        checkTree.add(3);
        checkTree.add(2);
        checkTree.add(7);
        
        myTree.add('d');
        myTree.add('f');
        myTree.add('w');
        
        assertFalse(myTree.equalStruct(checkTree));
        
        //fill trees and make them match again
        
        checkTree.add(4);
        myTree.add('a');
        
        assertTrue(myTree.equalStruct(checkTree));
        assertTrue(checkTree.equalStruct(myTree));
    }
}
