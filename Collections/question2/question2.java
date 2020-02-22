package Collections.question2;


import java.util.HashSet;

import java.util.Set;

public class question2 {
    public static void main(String[] args) {
        String s ="abcdefacd";
        Set<Character> list= new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            list.add(ch);
        }
        System.out.println("Number of unique characters are "+list.size());
    }
}
