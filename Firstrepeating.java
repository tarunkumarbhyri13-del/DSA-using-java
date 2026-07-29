import java.util.*;
public class Firstrepeating{
    public static void main(String[] args){
        String s="abcab";
        HashSet<Character> h=new HashSet<>();
        for(char c:s.toCharArray()){
            if(h.contains(c)){
                System.out.println(c);
                break;
            }else{
                h.add(c);
            }
        }
    }
}