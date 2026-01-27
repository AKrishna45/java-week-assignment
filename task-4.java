class UserMainCode 
{
    public int addLastDigits(int input1, int input2) {
        if(input1 < 0)
            input1 = (-1) * input1;
        if(input2 < 0)
            input2 = (-1) * input2;
        return (input1 % 10) + (input2 % 10);
    }
    
    public static void main(String[] args) {
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.addLastDigits(123, 456));    // 3 + 6 = 9
        System.out.println(obj.addLastDigits(-123, 456));   // 3 + 6 = 9
        System.out.println(obj.addLastDigits(100, 200));    // 0 + 0 = 0
        System.out.println(obj.addLastDigits(789, -321));   // 9 + 1 = 10
    }
}
