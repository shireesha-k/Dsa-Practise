
import java.util.HashMap;
import java.util.Scanner;
public class longestSub{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int r=0;
        int l=0;
        int ans=0;
        HashMap<Character,Integer> sh=new HashMap<>();
        for(r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(!sh.containsKey(ch)){
                sh.put(ch,1);
            }else{
                while(sh.containsKey(ch)){
                    sh.remove(s.charAt(l));
                    l++;
                }
                sh.put(ch,1);
            }

            

            ans=Math.max(ans,r-l+1);
            sc.close();
        }
        System.out.println(ans);
        
    }

}