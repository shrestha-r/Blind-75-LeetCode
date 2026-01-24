package Bit_Manipulation;

public class BitManipulation {

    public static void checkEvenOdd(int n){
        if((n&1) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void checkKthBit(int num, int pos){
        // System.out.println(num>>pos); // --> 111 --> 
        System.out.println(1&(num>>pos));
    }
    public static void setKthBit(int num, int pos){
        System.out.println(num|(1<<pos));
    }
    public static void clearBit(int num, int pos){
        System.out.println(num&~(1<<pos));
    }

    public static void toggleBit(int num, int pos){
        System.out.println(num ^ (1<<pos));  
    }
    public static void divideBy2(int num){
        System.out.println(num >> 1 );
    }
      public static void multiplyBy2(int num){
        System.out.println(num << 1);
    }
    public static void main(String[] args) {
        // right shift
            int n = 8;
            System.out.println(n>>2); // 1000 --> 0010 = 2
        //left shift 
        System.out.println(n<<4); // 0010 --> 0100 = 4
        checkEvenOdd(11);
        for(int i = 0;i<=1;i++){
            checkKthBit(1,i); // 100000
        }
        setKthBit(10, 2); // 1010 -- ? 14
        clearBit(14, 3); // 1110 --> 6
        toggleBit(6, 3);// 1010  --> 0010 = 2
        toggleBit(6, 2);// 1010  --> 
        divideBy2(13);
        multiplyBy2(13);
    }
}




