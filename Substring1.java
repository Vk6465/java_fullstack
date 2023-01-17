class Substring1 {
    static int isSubstring(String s1, String s2)
    {
        return s2.indexOf(s1);
    }
    public static void main(String[] args)
    {
        String s1 = "hara";
        String s2 = "visharad";
 
        int res = isSubstring(s1, s2);
        if (res == -1)
            System.out.println("No");
        else
            System.out.println("Yes ");
    }
}