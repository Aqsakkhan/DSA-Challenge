// 1. Count vowels and consonants in a string
import java.util.*;
class first{
    public static void main(String args[]){
        String str="Hello Java";
        int vowel=0;
        int consonant=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i) ;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
             vowel++;
                System.out.println(ch+" is a vowel");
            }
            else if(ch ==' ' || ch =='.'){
                continue;
            }
            else{
                consonant++;
                System.out.println(ch+" is a consonant");
                
            }
        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+consonant);
    }
}