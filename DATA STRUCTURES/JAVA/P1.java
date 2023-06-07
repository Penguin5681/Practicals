/*
    1. Write a C program to perform following operations on strings. (Use library functions for all
    operations) a) Find length of given string b) Copy string c) Compare given strings d)
    Concatenate given strings.
*/

public class P1 {
    public static void main(String[] args) {
        // a) Find length of given string 
        String str = "I love Pizza";
        System.out.println(str.length());
        
        // b) Copy string 
        String dest;
        dest = str;
        System.out.println(dest);   

        // c) Compare given strings 
        if (str == dest) System.out.println("Same String");
        else System.out.println("Different String");
        
        // d) Concatenate given strings.
        String S1 = "I Love ";
        String S2 = "Amul Butter";
        System.out.println(S1 + S2);
    }
}