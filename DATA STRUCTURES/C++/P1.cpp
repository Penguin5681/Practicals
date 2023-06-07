/*
    1. Write a C program to perform following operations on strings. (Use library functions for all
    operations) a) Find length of given string b) Copy string c) Compare given strings d)
    Concatenate given strings.
*/

#include <bits/stdc++.h>

using namespace std;

signed main(void) {
    // a) Length
    string s = "I Love Pizza";
    cout << s.length() << '\n';

    // b) Copy String
    string sCOPY(s.size(), ' ');
    copy(s.begin(), s.end(), sCOPY.begin());
    cout << sCOPY << '\n';

    // c) Compare the strings
    if (s == sCOPY) cout << "SAME STRINGS" << '\n';
    else cout << "DIFFERENT" << '\n';

    // d) Concatenate given strings
    string str1 = "I Love ";
    string str2 = "Amul Butter";
    cout << str1 + str2;
}