import java.util.*;
public class Lastrepeating{
    public static void main(String[] args){
        String s="abcab";
        HashSet<Character> h=new HashSet<>();
        for(int i=s.length()-1;i>=0;i--){
            if(h.contains(s.charAt(i))){
                System.out.print(s.charAt(i));
                break;
            }else{
                h.add(s.charAt(i));
            }
        }
    }
}