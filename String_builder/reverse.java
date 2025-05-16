

public class reverse {
    public static void main(String[] args) {
        String s="shireesha";
        StringBuilder ans=new StringBuilder(s);
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
        }
        System.out.println(ans);
        System.out.println(ans.reverse());
    }
}
