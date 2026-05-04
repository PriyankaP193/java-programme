import java.util.Random;
class methmath{
    public static void main(String[] args) {
        Random rn=new Random();
        int a=rn.nextInt();
        int b=rn.nextInt();
        int absolute=Math.abs(a);
        System.out.println("absolute: "+absolute);
        System.out.println("Minn: "+Math.min(a,b));
        System.out.println("Minn: "+Math.max(a,b));
        float c=5.6f;
        float d=6.6f;
        System.out.println("ceil: "+Math.ceil(c));
        System.out.println("ceil: "+Math.ceil(d));
        System.out.println("floor: "+Math.floor(c));
        System.out.println("floor: "+Math.floor(d));
        System.out.println("sqr: "+Math.sqrt(c));
        System.out.println("power: "+Math.pow(c,d));
        System.out.println("cube: "+Math.cbrt(c));
        System.out.println("Round: "+Math.round(d));
        double deg=rn.nextDouble();
        double rad=Math.toRadians(deg);
        double tan=Math.tan(rad);
        double sin=Math.sin(rad);
        double cos=Math.cos(rad);
        System.out.println("Sin:"+ sin);
        System.out.println("cos:"+ cos);
        System.out.println("tan:"+tan);
        System.out.println("log: "+Math.log(d));
        System.out.println("exp: "+Math.exp(d));

   }}
