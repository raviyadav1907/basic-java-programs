import java.util.*;
public class btree {

    static node root = null;

    static class node{
        int data;
        node left;
        node right;
        node(int d){
            this.data = d;
            this.left = this.right = null;
        }
    }

    static class diaHelper{
        int d = 0 ;
        int h = 0 ;
    }

    public static diaHelper diameterDP(node root){
        if(root == null){
            diaHelper baseAns = new diaHelper();
            return baseAns;
        }

        diaHelper left = diameterDP(root.left);
        diaHelper right = diameterDP(root.right);

        diaHelper myans = new diaHelper();

        myans.d = Math.max(left.h + right.h +1,Math.max(left.d,right.d));
        myans.h = Math.max(left.h,right.h)+1;
        return myans;
    }

    static class balHelper{
        int h =0;
        boolean b = true ;
    }

    public static balHelper isBalancedDP(node root){
        if(root == null){
            balHelper baseAns = new balHelper();
            return baseAns;
        }

        balHelper left = isBalancedDP(root.left);
        balHelper right = isBalancedDP(root.right);
        balHelper myans = new balHelper();

        myans.b = left.b && right.b && ( left.h - right.h >= -1 && left.h - right.h <= 1 );
        myans.h = Math.max( left.h, right.h ) + 1;
        return myans;
    }

    public static void btreeConstructor(int[] data){
        ArrayList<node> cpList = new ArrayList<>();
        for( int i = 0 ; i < data.length ; i++){
            if(data[i] == -1){
                cpList.remove(cpList.size()-1);
            }else{
                node currnode = new node(data[i]);
                if(root == null){
                    root = currnode;
                }else{
                    node cp = cpList.get(cpList.size()-1);
                    if(cp.left == null){
                        cp.left = currnode;
                    }else{
                        cp.right = currnode;
                    }
                }
                cpList.add(currnode);
            }
        }
    }

    public static void preOrderIterative(node root){
        ArrayList<node> stack = new ArrayList<>();
        stack.add(root);
        while(stack.size() > 0){
            node currNode = stack.remove(stack.size() - 1);
            System.out.print(currNode.data + " ");
            if(currNode.right != null){
                stack.add(currNode.right);
            }
            if(currNode.left != null){
                stack.add(currNode.left);
            }
        }
    }

    public static void main(String[] args){
        int[] data = {10,20,30,80,-1,-1,40,-1,-1,50,70,-1,60};
        btreeConstructor(data);
        preOrderIterative(root);
        System.out.println();
        diaHelper ans = diameterDP(root);
        System.out.println(ans.d);
        balHelper ans1 = isBalancedDP(root);
        System.out.print(ans1.b);
    }

}