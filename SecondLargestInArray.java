import java.util.Arrays;  
public class SecondLargestInArray{  
public static int getSecondLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-2];  
}  
public static void main(String args[]){  
int a[]={7, 12, 9, 15, 19, 32, 56, 70};  
System.out.println("Second Largest: "+getSecondLargest(a,8));
}}  