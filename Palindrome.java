class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
/*
class Palindrom{
    public static void main(String args[]){
        String str="aabbbba";

        int i=0;
        int n=str.length();
        String rev="";
        for(i = n - 1; i >= 0; i--){
            rev=rev+str.charAt(i);
            }
        if(str.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}*/