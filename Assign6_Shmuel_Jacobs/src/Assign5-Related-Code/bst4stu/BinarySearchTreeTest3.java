/*  To be covered in Lec#15.
*   Test the basic implementation of BinarySearchTree.
*   It creates an empty binary search tree of Integer objects,
*       insert a number of int values, then
*       delete the int value 27 from the bst tree.,
*       print the BST tree data and structure before and after the deletion.
*/
package bst4stu;

/**
 *
 * @author cindy
 */
public class BinarySearchTreeTest3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a binary search tree
        BinarySearchTree<Integer> bstNumbers = new BinarySearchTree<Integer>();
        int[] numbers = {45, 27, 15, 21, 36};
        for (int i = 0; i < 5; i++) {
            bstNumbers.add(numbers[i]);
        }
        System.out.println("---------------------");
        System.out.println("Before deleting 27");
        System.out.println(bstNumbers.toString());
        System.out.println("---------------------");
            //delete a node
        bstNumbers.delete(27);
        System.out.println("After deleting 27");
        System.out.println(bstNumbers.toString());
        System.out.println("---------------------");
    }
}

