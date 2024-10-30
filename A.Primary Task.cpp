#include<iostream>
using namespace std;
void Task(int n){
    while(n--){
        string S;
        cin>>S;
        int a= S.length();
        int b= S[2]-'0';
        if(S[0]=='1' && S[1]=='0' && b>=2 && a==3 ){
            cout<<"Yes"<<endl;
        }

        else if(S[0]=='1' && S[1]=='0' && b>=1 && a>3 ){
            cout<<"Yes"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
        
    }
}
int main(){
    int n;
    cin>>n;
    Task(n);
    return 0;
}