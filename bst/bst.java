import java.util.*;

class bst{

    static node root = null ;
    static class node{
        int data ;
        node left ;
        node right ;
        node(int d){
            this.data = d ;
            this.left = this.right = null ;
        }
    }

    public static void treeConstructor(int[] data){
        ArrayList<node> CurrentParentList = new ArrayList<>() ;
        for( int i = 0 ; i < data.length ; i++){
            if(data[i] == -1){
                CurrentParentList.remove(CurrentParentList.size()  - 1) ;
            }else{
                node CurrentNode = new node(data[i]) ;
                if( root == null ){
                    root = CurrentNode ;
                }else{
                    node CurrentParent = CurrentParentList.get(CurrentParentList.size() - 1) ;
                    if(CurrentParent.left == null){
                        CurrentParent.left = CurrentNode ;
                    }else{
                        CurrentParent.right = CurrentNode ;
                    }
                }
                CurrentParentList.add(CurrentNode);
            }            
        }
    }

    static class bstHelper{
        int min = Integer.MIN_VALUE ;
        int max = Integer.MAX_VALUE ;
        boolean isBst = true ;
    }

    public static bstHelper Is_BST_or_Not(node root){
        if( root == null ){
            bstHelper baseAns = new bstHelper();
            return baseAns;
        }else if(root.left == null && root.right == null ){
            bstHelper baseAns = new bstHelper();
            baseAns.min = root.data ;
            baseAns.max = root.data ;
        }
        bstHelper left = Is_BST_or_Not(root.left) ;
        bstHelper right = Is_BST_or_Not(root.right) ;
        bstHelper myans = new bstHelper() ;
        myans.isBst = left.isBst && right.isBst && (root.data>left.max && root.data<right.min) ;
        if(myans.isBst){
            if(root.left != null){
                myans.min = left.min;
            }
            else{
                myans.min = root.data;
            } 
            if(root.right != null){
                myans.max = right.max;
            }else{
                myans.max = root.data;
            }
        }
        return myans;
    }

    static class largestbstHelper{
        int min = Integer.MIN_VALUE ;
        int max = Integer.MAX_VALUE ;
        boolean isBst = true ;
        node bstRoot = null;
        int size = 0;
    }

    public static largestbstHelper largestbst(node root){
        if( root == null ){
            largestbstHelper baseAns = new largestbstHelper();
            return baseAns;
        }else if(root.left == null && root.right == null ){
            largestbstHelper baseAns = largestbstHelper();
            baseAns.min = root.data ;
            baseAns.max = root.data ;
            baseAns.size =1;
            baseAns.bstRoot = root ;
            return baseAns;
        }
        largestbstHelper left = Is_BST_or_Not(root.left) ;
        largestbstHelper right = Is_BST_or_Not(root.right) ;
        largestbstHelper myans = new largestbstHelper() ;
        myans.isBst = left.isBst && right.isBst && (root.data>left.max && root.data<right.min) ;
        if(myans.isBst){
            if(root.left != null){
                myans.min = left.min;
            }
            else{
                myans.min = root.data;
            } 
            if(root.right != null){
                myans.max = right.max;
            }else{
                myans.max = root.data;
            }
            myans.bstRoot = root ;
            myans.size = left.size + right.size + 1 ;

        }else{
            if(left.size >= right.size){
                myans.size = left.size;
                myans.bstRoot = left.bstRoot;
            }else{
                myans.size = right.size;
                myans.bstRoot = right.bstRoot;
            }
        }
        return myans;
    }

    public static void main(String[] args){
        int[] data = {50,25,12,-1,40,35,-1,45,-1,-1,-1,70,60,-1,80} ;
        treeConstructor(data);
        bstHelper ans = Is_BST_or_Not(root);
        System.out.print(ans.isBst);
        
    }

}