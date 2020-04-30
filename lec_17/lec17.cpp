//reversion of recursion in c++.
#include <iostream>
#include <vector>
using namespace std;



void printinc(vector<int>& arr,int index){
    if(index==arr.size()){
        return ;
    }
    cout<<arr[index];
    printinc(arr,index+1);
}



void printdec(vector<int>& arr,int index){
    if(index==arr.size()){
        return ;
    }
    printdec(arr,index+1);
    cout<<arr[index];
}



int firstocc(vector<int>& arr,int index,int data){
    if(index==arr.size()){
        return -1;
    }
    int a=firstocc(arr,index+1,data);
    if(arr[index]==data){
        return index;
    }
    return a;
}



int lastocc(vector<int>& arr,int index,int data){
    if(index==arr.size()){
        return -1;
    }
    int a=lastocc(arr,index+1,data);
    if(a==-1&&arr[index]==data){
        return index;
    }
    return a;
}



int LastOccInPre(vector<int> arr,int index,int data,int loc){
    if(index==arr.size()){
        return loc;
    }
    if(arr[index]==data){
        loc=index;
    }
    int a =LastOccInPre(arr,index+1,data,loc);
    return a;
}


vector<int> numpresentnumberoftime(vector<int> arr,int index,int data,int count){
    if(index==arr.size()){
        vector<int> arr1(count,0);
        return arr1;
    }
    if(arr[index]==data){
        count++;
    }
    vector<int> arr1=numpresentnumberoftime(arr,index+1,data,count);
    if(arr[index]==data){
        arr1[count-1]=index;
    }
    return arr1;
}


void displayForOneDArr(vector<int>& arr){
    for(int i=0;i<arr.size();i++){
        cout<<arr[i];
    }
}


void subseq(string ques,string ans){
    if(ques.size()==0){
        cout<<ans<<endl;
        return ;
    }
    char ch=ques[0];
    string RestOfQues=ques.substr(1);
        subseq(RestOfQues, ans+ch);
        subseq(RestOfQues, ans);
}


vector<string> subsequence(string ques){
    if(ques.size()==0){
        vector<string> baseans;
        baseans.push_back("");
        return baseans;
    }
    string RestOfQues=ques.substr(1);
    vector<string> recursionAns=subsequence(RestOfQues);
    vector<string> myanswer;
    for(int i=0;i<recursionAns.size();i++){
        myanswer.push_back(ques[0]+recursionAns[i]);
    }
    for(int i=0;i<recursionAns.size();i++){
        myanswer.push_back(recursionAns[i]);
    }
    return myanswer;
}

void displayForOneDArrString(vector<string>& arr){
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<endl;
    }
}


int FloodFill(vector<vector<int>> arr,int i,int j,string path){
    if(i==arr.size()-1 && j==arr[0].size()-1){
        cout<<path<<endl;
        return 1;
    }
    int ans=0;
    arr[i][j]=1;
    if(i-1>=0 && arr[i-1][j]!=1){
            ans+=FloodFill(arr, i-1, j, path+"up ");
        }
        if(j-1>=0 && arr[i][j-1]!=1){
            ans+=FloodFill(arr, i, j-1, path+"left ");
        }
        if(i+1<arr.size() && arr[i+1][j]!=1){
            ans+=FloodFill(arr, i+1, j, path+"down ");
        }
        if(j+1<arr[0].size() && arr[i][j+1]!=1){
            ans+=FloodFill(arr, i, j+1, path+"right ");
        }
        arr[i][j]=0;
    return ans;
}


vector<string> Floodfillwithvector(vector<vector<int>> arr,int i,int j){
    if(i==arr.size()-1 && j==arr[0].size()-1){
        vector<string> baseans;
        baseans.push_back("");
        return baseans;
    } 
    vector<string> myans;
    arr[i][j]=1;
    if(i-1>=0 && arr[i-1][j]!=1){
        vector<string> recans=Floodfillwithvector(arr,i-1,j);
        for(i=0;i<recans.size();i++){
            myans.push_back("up"+recans[i]);
        }
    }
    if(j-1>=0 && arr[i][j-1]!=1){
        vector<string> recans=Floodfillwithvector(arr,i,j-1);
        for(i=0;i<recans.size();i++){
            myans.push_back("left"+recans[i]);
        }
    }
    if(i+1>=arr.size() && arr[i+1][j-1]!=1){
        vector<string> recans=Floodfillwithvector(arr,i+1,j);
        for(i=0;i<recans.size();i++){
            myans.push_back("down"+recans[i]);
        }
    }
    if(j+1>=0 && arr[i][j-1]!=1){
        vector<string> recans=Floodfillwithvector(arr,i,j+1);
        for(i=0;i<recans.size();i++){
            myans.push_back("right"+recans[i]);
        }
    }
    arr[i][j]=0;
    return myans;   
}


int main(){
    //vector<int> arr{2,8,9,7,9,6};

    // displayForOneDArr(arr);
    // cout<<endl;
    // printinc(arr,0);
    // cout<<endl;
    // printdec(arr,0);
    // cout<<endl;
    // cout<<firstocc(arr,0,9)<<endl;
    // cout<<lastocc(arr,0,9)<<endl;
    // cout<<LastOccInPre(arr,0,9,0)<<endl;
    // vector<int> a = numpresentnumberoftime(arr,0,9,0);
    // displayForOneDArr(a);



    // subseq("abcd","");
    // vector<string> a=subsequence("abcd");
    // displayForOneDArrString(a);

     vector<vector<int>> arr= {{0,0,0,0,0,0},{0,1,0,1,0,0},{0,0,0,0,0,0},{0,0,1,0,1,0},{1,0,0,0,0,0},{0,0,0,0,0,0}};
    // cout<<FloodFill(arr,0,0," ");

    vector<string> a= Floodfillwithvector(arr,0,0);
    displayForOneDArrString(a);
    return 0;
}
