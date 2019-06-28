public class main {
    public static void main(String[] args) {
        int i = -5;
        int q = 3;



        System.out.println("I: " + intToString(i,4));
        System.out.println("Q: " + intToString(q,4));


        int x = i|q;
        //x = -x;
       // System.out.println("__");
        System.out.println("X: " + intToString(x,4));
        System.out.println("x: " + x);





        //forLoopExample(5);
    }


    public static void forLoopExample(int number)
    {
        for(int i = 31; i >= 0 ; i--) {
            int mask = 1 << i;
            int bitAdd = number & mask;

            System.out.println();
            System.out.println("Iteration: " + i);
            System.out.println("Mask: " + mask);
            System.out.println("Maskb: " + intToString(mask,4));
            System.out.println("Numbe: " + intToString(number,4));
            System.out.println("Bitad: " + intToString(bitAdd,4));
            System.out.println("Bitad: " + bitAdd);
            System.out.println();
            System.out.println();










        }
    }


    public static String intToString(int number, int groupSize) {
        StringBuilder result = new StringBuilder();

        for(int i = 31; i >= 0 ; i--) {
            int mask = 1 << i;
            result.append((number & mask) != 0 ? "1" : "0");

            if (i % groupSize == 0)
                result.append(" ");
        }
        result.replace(result.length() - 1, result.length(), "");

        return result.toString();
    }



}


