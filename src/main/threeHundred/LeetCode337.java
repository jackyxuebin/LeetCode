package main.threeHundred;

/**
 * Created by bxue on 20/4/2016.
 */
public class LeetCode337 {
    public int rob(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.val;
        }
        int robRoot=root.val;
        if(root.left!=null) {
            robRoot +=  rob(root.left.left) + rob(root.left.right);
        }
        if(root.right!=null){
            robRoot += rob(root.right.left) + rob(root.right.right);
        }

        int doNotRobRoot = 0;
        doNotRobRoot += rob(root.left) + rob(root.right);
        return robRoot > doNotRobRoot ? robRoot : doNotRobRoot;
    }

    private TreeNode createTreeNode(Integer[] input, int index){
        if(index<input.length){
            Integer value = input[index];
            if(value!=null){
                TreeNode t = new TreeNode(value);
                t.left=createTreeNode(input,index*2+1);
                t.right=createTreeNode(input,index*2+2);
                return t;
            }
        }
        return null;
    }

    public TreeNode arrayToTree(Integer[] input){
        TreeNode root = createTreeNode(input,0);
        return root;
    }

    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        Integer[] input = {3,4,5,1,3,null,1};
        LeetCode337 leetCode337 = new LeetCode337();
        TreeNode root = leetCode337.arrayToTree(input);
        //leetCode337.preOrder(root);
       System.out.println(leetCode337.rob(root));
    }


}
