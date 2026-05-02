import java.util.Arrays;
import java.util.Random;
class random{
    public static void main(String[] args) {
        Random rn =new Random();
        int n=rn.nextInt();
        System.out.println(n);
        boolean b=rn.nextBoolean();
        System.out.println(b);
        double d=rn.nextGaussian();
        System.out.println(d);
        byte bt[]=new byte[4];
        System.out.println(Arrays.toString(bt));
        rn.nextBytes(bt);
        System.out.println(Arrays.toString(bt));


    }
}