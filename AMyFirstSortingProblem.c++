#include<iostream>
using namespace std;

void printSort(){
    int a, b;
    cin >> a >> b;
    if(a < b){
        cout << a << " " << b << endl;
    }
    else{
        cout << b << " " << a << endl;
    }
}

int main(){
    int test;
    cin >> test;
    do {
        printSort();
    } while (test-- > 1);
    
    return 0;
}
