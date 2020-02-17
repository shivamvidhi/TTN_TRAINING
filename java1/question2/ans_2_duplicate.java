package java1.question2;

import java.util.HashSet;
import java.util.Set;

public class ans_2_duplicate {
    public static void main (String[] args)
    {
        // your code goes here
        String input = "My name is shivam. My name is Arora. ";
        String arr[] = input.split(" ");
        Set<String> stringSet = new HashSet<>();
        for(String s:arr)
        {
            if(!stringSet.contains(s))stringSet.add(s);
            else System.out.println(s);
        }


    }
}
