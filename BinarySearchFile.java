
import java.util.Random;

/**
 *
 * @author klaus
 */
public class BinarySearchTree {
    public class TreeNode{
        public int data;
        public TreeNode leftChild, rightChild, parent;

        public TreeNode(int d){
            data = d;
            leftChild = null;
            rightChild = null;
            parent = null;
        }

        public void setLeftChild(TreeNode n){
            leftChild = n;
            if(n != null){
                n.parent = this;
            }
        }

        public void setRightChild(TreeNode n){
            rightChild = n;
            if(n != null){
                n.parent = this;
            }
        }
    }