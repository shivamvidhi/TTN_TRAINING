package java1.question1;

public class ans_1_replace {
    public static void main (String[] args)
    {
        // your code goes here
        String input = "My name is shivam";
        String replace = "shivam arora";
        String sub = input.substring(11);

        input = input.replace(sub,replace);
        System.out.println(input);
    }
}

