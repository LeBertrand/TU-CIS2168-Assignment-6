/** To be covered in Lec#15.
*   Test the basic implementation of BinarySearchTree.
*   It creates an empty binary search tree of Strings, insert 5 strings in array names,
*       print the BST tree data and structure before, after, and during insertion.
*/
package bst4stu;

/**
 * @author cindy
 */
public class BinarySearchTreeTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a binary search tree
        BinarySearchTree<String> bstNames = new BinarySearchTree<String>();
        String[] names = {"house", "kiss", "dog", "cat", "man" };
        System.out.println(bstNames.toString());
        System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            bstNames.add(names[i]);
            System.out.println("After adding " + names[i] + "==>\n");
            System.out.println(bstNames.toString());
            System.out.println("---------------------");
        }

        //verify the BST structure using inorder traversal
        System.out.println("**************");
        System.out.println("Inorder traversal of names tree:  ");
        //To be implemented by students in class BinarySearchTree
        //System.out.println(bstNames.inorderToString());

    }

}
