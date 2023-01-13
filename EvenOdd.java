public class EvenOdd{
public static void main(String args[]){
int a[]={11,13,18,20,25,88,0};
for(int i=0;i<a.length;i++){
if(a[i]%2==0 &a[i]!=0){
System.out.println("Even Numbers:");
System.out.println(a[i]);
}
}
for(int i=0;i<a.length;i++){
if(a[i]%2!=0){
System.out.println("Odd Numbers:");
System.out.println(a[i]);
}
}
System.out.println("Neither odd nor even");
System.out.println(a[i]==0);
}
}