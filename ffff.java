class ffff{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Priyanka");
        sb.append("Vanitha");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(0,5,"hi");
        System.out.println(sb);
        sb.insert(3,"ngianga");
        System.out.println(sb);
        System.out.println("capacity value: "+sb.capacity());
        sb.delete(3,10);
        System.out.println(sb);
        System.out.println("Character : "+sb.charAt(11));
        sb.trimToSize();
        System.out.println(sb);

    }
}