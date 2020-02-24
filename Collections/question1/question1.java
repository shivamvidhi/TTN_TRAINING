package Collections.question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class question1
{
    public static void main(String[] args) {
        List<Float> list = new ArrayList<Float>();
        list.add(1.0f);
        list.add(1.0f);
        list.add(1.0f);
        list.add(1.0f);
        list.add(1.0f);
        float sum = 0.0f;

//        for(float i: list)
//        {
//            sum=sum + i;
//        }
//        System.out.println("sum is "+sum);

        Iterator<Float> it = list.iterator();
        while(it.hasNext())
        {
            sum+= it.next();

        }
        System.out.println(sum);
    }
}
