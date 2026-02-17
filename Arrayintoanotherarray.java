package module1;

import java.util.Arrays;

public class Arrayintoanotherarray {

	public static void main(String[] args) {
     int a1[]=new int[2];  
     a1[0]=10;
     a1[1]=20;
     int a2[]=new int[a1.length];
     for(int i=0;i<a1.length;i++)
     {
    	 a2[i]=a1[i];
     }
     
System.out.println(Arrays.toString(a2));
	}

}
