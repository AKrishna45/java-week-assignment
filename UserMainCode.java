import java.io.*; 
import java.util.*;
class UserMainCode
{
    public long nthFibonacci(int input1){
        if(input1 <= 0) return 0;
        if(input1 == 1) return 0;
        if(input1 == 2) return 1;
        
        int a = 0;
        int b = 1;
        int c = 0;
        
        for(int i = 3; i <= input1; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.nthFibonacci(1));   // 0
        System.out.println(obj.nthFibonacci(2));   // 1
        System.out.println(obj.nthFibonacci(5));   // 3
        System.out.println(obj.nthFibonacci(10));  // 34
    }
}
