// 4. Remove duplicates from a sorted array
import java.util.*;
class fourth{
    public static void main(String[] args){
        int num[]={2,3,5,5,9,10,11,11,12};
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j])
                    num[j]=0;
            }
        }
        for(int i=0;i<num.length;i++){
            if(num[i]!=0)
                System.out.println(num[i]); 
        }
    }
}