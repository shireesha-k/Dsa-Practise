import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class anagrams {
    boolean check(String a,String b,HashMap<Character,Integer> sha,HashMap<Character,Integer> shb){
        for(char key:sha.keySet()){
            if(!shb.containsKey(key)){
                return false;
            }
        }
        return true;
      }
    public static void main(String[] args){
        anagrams obj=new anagrams();
          Scanner sc=new Scanner(System.in);
          int r=0;
          System.out.println("Enter your first string");
          String a=sc.nextLine();
          System.out.println("wnter your second string");
          String b=sc.nextLine();
          HashMap <Character,Integer>sha=new HashMap<>();
          HashMap <Character,Integer> shb=new HashMap<>();
          ArrayList<Integer> arr=new ArrayList<>();
          for(char n:a.toCharArray()){
            sha.put(n,sha.getOrDefault(n,0)+1);
          }
          for(char k:b.toCharArray()){
            shb.put(k,shb.getOrDefault(k,0)+1);
          }
          for(r=0;r<a.length();r++){
            while(obj.check(a, b, sha, shb)==true){
              arr.add(r);
            }
            sc.close();
          }
          System.out.println(arr);
         
         

          }

}
