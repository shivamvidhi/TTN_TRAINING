package java1.question3;

public class ans_3_occuranceCharacter {
    public static void main(String args[])
    {
        String input = "abcdaa";
        int count = input.length()-input.replace("a", "").length();
        System.out.println(count);
    }
}
