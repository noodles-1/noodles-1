class ReverseInt {

    public int reverse(int x) {
        
        String sign = "";
        int num = Math.abs(x);
        if (x < 0)
            sign += "-";
        
        while (num > 0) {
            
            sign += Integer.toString(num % 10);
            num /= 10;
        }
        
        int result = Integer.parseInt(sign);
        return result;
    }

    public static void main(String[] args) {

        ReverseInt num = new ReverseInt();
        System.out.println(num.reverse(-100));
    }
}