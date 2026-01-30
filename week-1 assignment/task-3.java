class Task3 {
    int isPalinNum(int input1) {
        int temp = input1;
        int rev = 0;
        while(input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }
        if(rev == temp) return 1;  
        return 2;  
    }
    
    public static void main(String[] args) {
        Task3 obj = new Task3();
        System.out.println(obj.isPalinNum(121));   
        System.out.println(obj.isPalinNum(12321)); 
        System.out.println(obj.isPalinNum(123));   
        System.out.println(obj.isPalinNum(1001));   
    }
}
