
    // sorting any array ascnding order

import java.util.*;
//import java.util.Collections;
//import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        
        System.out.println("enter the no.of elements");

         int a1[]={58,69,44,68,68,26,5625,5,58,66,66};
        char a[]={'a','c','h','b','k','y','m'};
        double a2[]={52.6,55.4,52.1};
       /*  Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        //Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
*/
            Arrays.sort(a);
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));


        Arrays.sort(a1,Collections.reverseOrder());
        System.out.println(Arrays.toString(a1));

        Arrays.sort(a2,Collections.reverseOrder());
        System.out.println(Arrays.toString(a2));



    }


}

