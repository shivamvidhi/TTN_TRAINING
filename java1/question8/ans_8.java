package java1.question8;

public class ans_8 {
    public static void main(String[] args) {
        String s ="Shivam Arora";
        StringBuffer input = new StringBuffer(s);
        input = input.reverse();
        input = input.delete(4,9);
        System.out.println(input);
    }
}
