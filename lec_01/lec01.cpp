#include <iostream>
using namespace std;
int main(){
   
    //reversing the given number(check)
    /*int n=0;
    int ans=0;
    cout<<"enter the number";
    cin>>n;
    while (n>0)
    {
      int rem = n%10;
      n=n/10;
      ans=ans*10 +rem;
    }
    cout<<ans;
    */
    
    //counting the total digit present(check)
   /*int n=0;
   int count=0;
   cout<<"enter the numer";
   cin>>n;
   while (n!=0)
   {
      n=n/10;
      count++;
   }
   cout<<count;
   */
    

    //12345 to r=3(34512) and r=-3(45123)
    int n =0;
    cout<<"enter the number :";
    cin>>n;
    int n1=n;
    int r=0;
    cout<<"enter the value for r :";
    cin>>r;
    int len=0;
    while (n1!=0)
    {
        n1=n1/10;
        //cout<<n1<<"number"<<endl;
        len++;
        //cout<<len<<"length"<<endl;
    }
    r=r%len;
    cout<<r<<endl;
    if (r<0){
        r=r+len;
    }
    int r1=r;
    int post=0;
    int pow=1;
    while (r>0)
    {
        int rem = n%10;
        n=n/10;
        post=rem*pow+post;
        pow=pow*10;
        r--;
    }
    len=len-r1;
    while (len>0)
    {
        post=post*10;
        len--;
    }
    post=post+n;
    cout<<post;
    


    
    //the prime number in btw 2 to 99(check this code)
    /*int i,n=0;
    cout<<"enter the number till you want to check:";
    cin>>n;
     
    for ( i = 2; i < n; i++)
    {  bool isprime=true; 
        for (int j = 2; j*j < i; i++)
        {
        
        if(j%i==0){
            isprime=false;
            break;
        }   
    }
    if(isprime==true){
        cout<<i;
    }
    
    }*/
    
    

    //prime number for best case i.e i for the n sqr case
    /*int i,n=0;
    cout<< "enter the number:"<<endl;
    cin>>n;
    bool isprime=true;
    for ( i = 2; i*i <=n ; i++)
    {
      if (n%i==0)
      {
          isprime=false;
          break;
        }
    }
      if(isprime==true){
           cout<<"the give number is prime";
       }
       else{
           cout<<"the give number is not prime";
       }
    */
    

    return 0;
}