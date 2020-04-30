import java.util.*;
class gtree{
    static node root = null;
    static class node{
        int data;
        ArrayList<node> child;
        node(int d){
            this.data = d;
            child = new ArrayList<>();
        }
    }
    public static void treeConstructor(int[] data){
        ArrayList<node> currentParentList = new ArrayList<>();
        for(int i = 0 ; i < data.length ; i++){
            if(data[i] == -1){
                currentParentList.remove(currentParentList.size()-1);
            }else{
                node currentNode = new node(data[i]);
                if(root == null){
                    root = currentNode;
                }else{
                    node currentParrent = currentParentList.get(currentParentList.size()-1);
                    currentParrent.child.add(currentNode);
                }
                currentParentList.add(currentNode);
            }
        }
    }
    public static void display(node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + "  ->");
        for(int i = 0 ; i < root.child.size() ;i++){
            System.out.print(root.child.get(i).data + ",");
        }
        System.out.println(".");
        for(int i = 0 ;i<root.child.size();i++){
            display(root.child.get(i));
        }
    }
    public static int sizeofthegtree(node root){
        if(root == null){
            return 0;
        }
        int ans = 1;
        for(int i = 0 ;i<root.child.size();i++){
            ans+=sizeofthegtree(root.child.get(i));
        }
        return ans;
    }
    public static int maxofgtree(node root){
        if( root == null ){
            return -1;
        }
        int mymax = root.data ;
        for(int  i=0 ; i<root.child.size(); i++){
            int childmax = maxofgtree(root.child.get(i));
            if(childmax > mymax){
                mymax = childmax;
            }
        }
        return mymax;
    }
    public static int minofgtree(node root){
        if( root == null ){
            return -1;
        }
        int mymin = root.data;
        for(int i=0;i<root.child.size();i++){
            int childmin = minofgtree(root.child.get(i));
            if(childmin < mymin){
                mymin = childmin;
            }
        }
        return mymin;
    }
    public static boolean Find_In_gtree(node root,int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        for(int i=0;i<root.child.size();i++){
            boolean ans = Find_In_gtree(root.child.get(i),data);
            if(ans == true){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        treeConstructor(data);
        display(root);
        System.out.println("size = " + sizeofthegtree(root));
        System.out.println(maxofgtree(root));
        System.out.println(minofgtree(root));
        System.out.println(Find_In_gtree(root, 95));
    }
}