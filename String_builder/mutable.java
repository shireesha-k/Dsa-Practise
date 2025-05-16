public class mutable {
    public static void main(String[] args) {
        String s="shireesha";
        System.out.println(s);
        s+='s';
        System.out.println(s);
        StringBuilder s1=new StringBuilder("siri");

        s1.append("s");
        System.out.println(s1);
        String name=s1.toString();
    }
}
