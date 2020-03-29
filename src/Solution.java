import java.util.*;
public class Solution {
    public static void arrangeString(String str, int x, int y)
    {
        int a = 0;
        int b = 0;
        int len1 = str.length();
        for (int i = 0; i < len1; i++)
        {
            if (str.charAt(i) == '0')
                a++;
            else
                b++;
        }
        while (a > 0 || b > 0){
            for (int j = 0; j < x && a > 0; j++)
            {
                if (a > 0)
                {
                    System.out.print ("0");
                    a--;
                }
            }
            for (int j = 0; j < y && b > 0; j++) {
                if (b > 0)
                {
                    System.out.print("1");
                    b--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int x = sc.nextInt();
        int y = sc.nextInt();
        arrangeString(str, x, y);
    }
}