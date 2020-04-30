class lec10{

    public static void main(String[] args){
       //substr(args); 
       //strComp(args);
       //substring(a);
       String a="abacd";
       //System.out.print(captosmallandsmalltocap(a));
       System.out.print(diffbtwToASCII(a));
    }
    public static void strComp(String a){
        String b=new String("abc");
        if(a.equals(b)){
            System.out.print("the given string equal");
        }
    }
    public static void substr(String a){
        String b=a.substring(0,1);
        String c=a.substring(0,1);
        System.out.println(c==b);
    }
    public static  void substring(String a){
        for(int i=0;i<a.length();i++){
            for(int j=i+1;i<=a.length();j++){
               System.out.println(a.substring(i,j));
            }
        }
    }
    public static String captosmallandsmalltocap(String a){
        String ans="";
        for (int i=0;i<a.length();i++){
            char  ch=a.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch = (char) (ch-'a'+'A');
            }else{
                ch = (char) (ch-'A'+'a');
            }
            ans=ans+ch;
        }
        return ans;
    }
    public static String diffbtwToASCII(String a){
        String ans="";
        for(int i=0;i<a.length()-1;i++){
            ans += a.charAt(i);
            ans +=a.charAt(i+1)- a.charAt(i);
        }
        ans+=a.charAt(a.length()-1);
        return ans;
    }
}
