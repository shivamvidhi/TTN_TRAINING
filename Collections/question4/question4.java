package Collections.question4;

import java.util.*;

public class question4 {
    public static void main(String[] args) {
        int a[]={5,5,1,1,2,2,3,4,4,4};
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }

        List<Map.Entry<Integer,Integer>>list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        //System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<Integer,Integer> map2 = new LinkedHashMap<Integer, Integer>();
        for(Map.Entry<Integer,Integer> aa: list)
        {
            map2.put(aa.getKey(),aa.getValue());
        }
        for(Map.Entry<Integer, Integer> traverse : map2.entrySet())
        {
            System.out.println(traverse.getKey()+ "  "+traverse.getValue());

        }
    }
}
