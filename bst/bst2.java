import java.util.*;

class bst2{

    static node root = null;

    static class node{
        int data ;
        node left;
        node right;

        node(int d) {
            this.data = d;
            this.left = this.right = null;
        }
    }

    public static node Constructor(int[] data, int lo, int hi) {
        int mid = (lo + hi) / 2;
        node root = new node(dat[mid]);
        node.left = Construct(data, lo, mid - 1);
    }

    public static int max(node root,int data){
        if(root == null){
            return 0;
        }

        return ans;
    }

    public static int min(node root,int data){
        if(root == null){
            return 0;
        }

        return ans;
    }

    public static Boolean find(node root,int data){
        if(root == null){
            return false;
        }

        return ans;
    }

    public static void main(String[] args){
        int[] data = {10,20,30,40,50,60,70,80,90};
        node root = costruct(data,0,data.length-1);

    }

}