/*  To be covered in Lec#15.
*   Test the basic implementation of BinarySearchTree.
*   It creates an empty binary search tree of Integer objects,
*       insert 5 int values available in array numbers,
*       print the BST tree data and structure before, after, and during insertion.
*/
package bst4stu;

/**
 * @author cindy
 */
public class BinarySearchTreeTest2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a binary search tree
        BinarySearchTree<Integer> bstNumbers = new BinarySearchTree<Integer>();
        int[] numbers = {45, 27, 15, 21, 36};
        System.out.println(bstNumbers.toString());
        System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            bstNumbers.add(numbers[i]);
            System.out.println("After adding " + numbers[i] + "==>\n");
            System.out.println(bstNumbers.toString());
            System.out.println("---------------------");
        }

        //verify the BST structure using inorder traversal
        System.out.println("**************");
        System.out.println("Inorder traversal of names tree:  ");
        //To be implemented by students in clcass BinarySearchTree2
        //System.out.println(bstNumbers.inorderToString());
    }
}
