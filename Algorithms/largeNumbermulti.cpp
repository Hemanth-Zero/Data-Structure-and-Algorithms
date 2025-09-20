#include<iostream>
#include<algorithm>
#include<string>

using namespace std;

string stradd(string num1, string num2) {
    int carry = 0;
    string res = "";
    int i = num1.size() - 1, j = num2.size() - 1;

    while (i >= 0 || j >= 0 || carry) {
        int sum = carry;
        if (i >= 0) sum += num1[i--] - '0';
        if (j >= 0) sum += num2[j--] - '0';
        carry = sum / 10;
        res.push_back((sum % 10) + '0');
    }
    reverse(res.begin(), res.end());
    return res;
}


// Shift (multiply by 10^n)
string shift(string num, int n) {
    return num + string(n, '0');
}


string multiply(string num1,string num2){
        
        
        int maxlen = max(num1.length(),num2.length());
        int mid = maxlen/2;


        while (num1.length() < maxlen) num1 = "0" + num1;
        while (num2.length() < maxlen) num2 = "0" + num2;
        
        
        string a = num1.substr(0,maxlen/2);
        string b = num1.substr(maxlen/2);
        string c = num2.substr(0,maxlen/2);
        string d = num2.substr(maxlen/2);
        
        string p0 = shift(multiply(a,c),maxlen);
        string p2= shift(multiply(stradd(a,b),stradd(c,d)),maxlen/2);
        string p1 = multiply(b,d);
        
        string result = stradd(p0,p1);
        string p21 = strsub(p2,stradd(p1,p0));
        return stradd(result,p21);

}
int main(){
        string num1,num2;
        cout<<"Enter num1:" ;
        cin>>num1;
        cout<<"Enter num2";
        cin>>num2;
        cout<<"he result multiplicaton is "<<multiply(num1,num2)<<endl;        
}