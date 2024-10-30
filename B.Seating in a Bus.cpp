#include<iostream>
using namespace std;
void arrayIn( int t){
    while(t--){
        int arraysize,Jim=1;
        cin>>arraysize;
        int arr[arraysize];
        for(int i=0;i<arraysize;i++){
            cin>>arr[i];
        }
        for(int i=1;i<arraysize-1;i++){
            if(arr[i]!=arr[i-1]+1 || arr[i]!=arr[i-1]-1 || arr[i]!=arr[i+1]+1 || arr[i]!=arr[i-1]+1){
                Jim=0;
                break;
            }
        }
        if(Jim==0){
            cout<<"NO"<<endl;
        }
        else{
            cout<<"Yes"<<endl;
        }
        
    }
}
int main(){
    int t;
    cin>>t;
    arrayIn(t);
    return 0;
}