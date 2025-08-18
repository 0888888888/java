public class BitManipulation {
    public static void main(String[] args) {
         oddOrEven(3);
         oddOrEven(11);
         oddOrEven(14);
         System.out.println(getIthBit(10, 2));
         System.out.println(setIthBit(10, 2));
         System.out.println(clearIthBit(10, 1));
         System.out.println(updateIthBit(10, 2, 1));
         System.out.println(clearLastIBits(15, 2));
         System.out.println(clearBitsinRange(10, 2, 4));
        }


    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("even number"); 
        } else {
            System.out.println("odd number");
        }
    }

    //Get bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    //Set bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    //clear bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    //update bit
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }


    //clear last i bits
    public static int clearLastIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    //clear bits in range
    public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    
}
