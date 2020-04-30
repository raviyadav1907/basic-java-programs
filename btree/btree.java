import java.util.ArrayList;

class btree{

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

    public static void displayBtree(node root){
        if( root == null ){
            return ;
        }
        if( root.left != null ){
            System.out.print(root.left.data + " -> ");
        }
        System.out.print(root.data + " ");
        if( root.right != null){
            System.out.print("<- " + root.right.data);
        }
        System.out.println(".");
        if(root.left != null){
            displayBtree(root.left);
        }
        if(root.right !=null){
            displayBtree(root.right);
        }

    }

    public static int sizeofBtree(node root){
        if(root == null){
            return 0;
        }
        int ans = 1;
        if( root.left != null){
            ans+=sizeofBtree(root.left);
        }
        if( root.right != null){
            ans+=sizeofBtree(root.right);
        }
        return ans;
    }

    public static int hieghtofBtree(node root){
        if(root == null){
            return 0;
        }
        int ans = 0;
        if( root.left != null ){
            ans = hieghtofBtree(root.left);
        }
        if( root.right != null ){
            ans = Math.max(ans,hieghtofBtree(root.right));
        }
        return ans+1;
    }

    public static int maxofBtree(node root){
        if( root == null){
            return 0;
        }
        int ans = root.data;
        if(root.left != null){
            ans = Math.max(ans,maxofBtree(root.left));
        }
        if(root.right != null){
            ans = Math.max(ans,maxofBtree(root.right));
        }
        return ans;
    }
    
    public static Boolean FindInBtree(node root,int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(root.left != null){
            boolean ans = FindInBtree(root.left, data);
            if(ans == true){
                return true;
            }
        }
        if(root.right != null){
            boolean ans = FindInBtree(root.right, data);
            if(ans == true){
                return true;
            }
        }
        return false;
    }

    public static void printPreOrder(node root){
        if( root == null ){
            return ;
        }
        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printPostOrder(node root){
        if( root == null ){
            return ;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.data);
    }

    public static void printInOrder(node root){
        if( root == null ){
            return ;
        }
        printInOrder(root.left);
        System.out.println(root.data);
        printInOrder(root.right);
    }
    
    public static node btreeFromPreAndIn(int[] pre , int[] in , int ps , int pe , int is ,int ie) {
        if(is == ie || ps == pe){
            node baseNode = new node(pre[ps]);
            return baseNode;
        }
        if(is > ie || ps > pe){
            return null ;
        }
        node croot = new node(pre[ps]);
        int i = is;
        int count = 0;
        while(pre[ps] != in[i]){
            i++;
            count++;
        }

        croot.left = btreeFromPreAndIn(pre, in, ps+1, ps+count, is, i-1);
        croot.right = btreeFromPreAndIn(pre, in, ps +count+1, pe, i+1, ie);
        return croot;
    }

    public static void main(String[] args){
        int[] data = {10,20,30,80,-1,-1,40,-1,-1,50,70,-1,60};
        btreeConstructor(data);
        displayBtree(root);
        sizeofBtree(root);
        System.out.println(sizeofBtree(root));
        System.out.println(hieghtofBtree(root));
        System.out.println(maxofBtree(root));
        System.out.println(FindInBtree(root, 20));
        System.out.println("Preorder :");
        printPreOrder(root);
        System.out.println("Postorder :");
        printPostOrder(root);
        System.out.println("Inorder :");
        printInOrder(root);
        System.out.println();
        int[] pre = {10,20,30,4,5,40,1,80,50,60,2,90,70,100,3};
        int[] in = {4,30,5,20,1,40,80,10,2,60,90,50,100,70,3};
        node root1 = btreeFromPreAndIn(pre, in, 0, 14, 0, 14);
        displayBtree(root1);
    }

}