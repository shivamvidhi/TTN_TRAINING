package java1.question5;

import java.util.Arrays;

public class ans_5 {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]={1,6,3,7,5};
        Arrays.sort(a);
        Arrays.sort(b);

        int al = a.length;
        int bl = b.length;
        for(int i=0,j=0; i<al && j<bl;)
        {
            if(a[i]==b[j])
            {
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j])i++;
            else j++;
        }
    }
}
