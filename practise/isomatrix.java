import java.util.*;
public class isomatrix {
    public static void main(String[] args) {
        String s="egg";
        String r="add";

        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        LinkedHashMap<Character,Integer>map1=new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0;i<r.length();i++)
        {
            map1.put(r.charAt(i),map1.getOrDefault(r.charAt(i), 0)+1);
        }


        for(int i=0;i<s.length();i++)
        {
            Character key1=s.charAt(i);
            int x1=map.get(key1);

            Character key2=r.charAt(i);
            int x2=map1.get(key2);
            
            if(x1!=x2)
            {
                System.out.println("Problem");
                // break;
            }
        }
    }
}
