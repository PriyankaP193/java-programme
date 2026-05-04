class tcf{
    public static void main(String[] args) {
//         int a=10;
//         int b=0;
//         try {
//             int c=a/b;
//             System.out.println(c);
//         } catch (ArithmeticException e) {
//             System.out.println("Invalid");
//         }
    

        
        int[] arr = {10, 20, 30};

        try {
            System.out.println(arr[5]); // index > size
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }
  

        try {
            System.out.println(arr[-1]); // negative index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }

        try {
            int i = 3;
            System.out.println(arr[i]); // index = size (invalid)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }

        //  NullPointerException


        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    

        //  ArithmeticException
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    finally{
            System.out.println("Final block is optional");
        }
    }
}