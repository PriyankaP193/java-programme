class strng{
    public static void main(String[] args){
        String s="Hello World";
        String p="  Nandhini  ";
        String m="Hello World";
        String n=" ";
        System.out.println(m.length());
        System.out.println(n.isEmpty());
        System.out.println(n.isBlank());
          
        System.out.println(s.equals("Hello"));
        System.out.println(s.equalsIgnoreCase("hello wOrLd"));
        System.out.println(s.compareTo(p));
        System.out.println(s.contains("World"));

        
        System.out.println(s.charAt(1));
        System.out.println(s.substring(0, 5));
        System.out.println(s.indexOf('o'));           // first match (char)
        System.out.println(s.indexOf("World"));       // first match (String)
        System.out.println(s.lastIndexOf('o'));       // last match

        
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("World"));

        
        System.out.println(p.trim());
        System.out.println(p.strip());
        System.out.println(s.replace("World", "Java"));
        System.out.println("Hi ".repeat(3));
        System.out.println(s.repeat(3));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
    
