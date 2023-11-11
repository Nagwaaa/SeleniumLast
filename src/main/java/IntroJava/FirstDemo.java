package IntroJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstDemo {


    public static void main(String[] args)
    {
        //int String char float decimal boolean
        // Arraylist add get remove contain
        // how convert to array to arraylist list l=Arrays.aslist(arrayName);
        // string method split trim charAt(i)
        String name="Nagwa ibrahim";
        String nam=name.split(" ")[1];
        System.out.println("name after split is "+nam);
        for(int x=0;x<name.length();x++)
        {
            System.out.println(name.charAt(x));
        }
        ArrayList<Integer> aa=new ArrayList<Integer>();
        aa.add(5);
        aa.add(15);
        aa.add(25);
        System.out.println(aa.contains(5));
        System.out.println(aa.get(2));
        for (Integer integer : aa) {
            System.out.println(integer);
        }
        int[] arr = new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=35;
        arr[4]=50;
        arr[5]=60;
        String[] na={"Nagwa","sara","mohamed"};
        List l = Arrays.asList(arr);
        System.out.println(l.get(0));
        System.out.println(l.contains(10));
        for (int j : arr) {
            if(j%2==0)
            {
                System.out.println(j);
                break;
            }else
            {
                System.out.println(j+" is not multiple");
            }

        }
    }
}
