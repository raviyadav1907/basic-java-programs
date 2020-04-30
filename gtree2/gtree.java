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

    public static ArrayList<Integer> NodeToRootPath(node root,int data){
        if(root == null){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(root.data);
            return ans ;
        }
        for(int i=0;i<root.child.size();i++){
            ArrayList<Integer> recAns = NodeToRootPath(root.child.get(i), data);
            if(recAns != null){
                recAns.add(root.data);
                return recAns;
            }
        }
        return null;
    }

    public static int commonfactor(node root,int data1,int data2){
        ArrayList<Integer> n2rpathd1 = NodeToRootPath(root, data1);
        ArrayList<Integer> n2rpathd2 = NodeToRootPath(root, data2);
        int i = n2rpathd1.size()-1;
        int j = n2rpathd2.size()-1;
        while(i>=0 && j >=0){
            if(n2rpathd1.get(i) != n2rpathd2.get(j)){
                break;
            }
            i--;
            j--;
        }
        return n2rpathd1.get(i+1);
    }

    public static void levelorderTraversal(node root){
        Queue<node> qu = new LinkedList<>();
        qu.add(root);
        while(qu.size()>0){
            node currNode = qu.remove();
            System.out.print(currNode.data + " ");
            for(int i = 0 ; i<currNode.child.size() ; i++){
                qu.add(currNode.child.get(i));
            }
        }
    }
    
    public static int heightofthetree(node root) {
        if( root == null ){
            return 0;
        }
        int myhieght = 0 ;
        for(int i = 0 ; i< root.child.size(); i++){
            myhieght = Math.max(myhieght,heightofthetree(root.child.get(i)));
        }
        return myhieght+1;
    }

    public static void main (String[] args){
        int[] data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        treeConstructor(data);
        System.out.println(NodeToRootPath(root, 120));
        System.out.println(commonfactor(root, 80, 120));
        levelorderTraversal(root);
        System.out.println();
        System.out.println(heightofthetree(root));
    }

}