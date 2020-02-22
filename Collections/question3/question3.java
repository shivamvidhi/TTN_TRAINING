package Collections.question3;

import java.util.TreeMap;

public class question3 {
    /*public static void main(String[] args) {
        String s ="abcabc";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i =0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                int value = map.get(ch);
                value = value + 1;
                map.put(ch, value);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(char ch : map.keySet())
        {
            System.out.println(ch+ ": "+ map.get(ch));
        }
    }*/
    // now for sorted output:

    public static void main(String[] args) {
        String s ="abcabc";
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        for(int i =0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                int value = map.get(ch);
                value = value + 1;
                map.put(ch, value);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(char ch : map.keySet())
        {
            System.out.println(ch+ ": "+ map.get(ch));
        }
    }
}
