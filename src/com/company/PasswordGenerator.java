package com.company;

public class PasswordGenerator
{
    String prefix;
    private int digitLength;
    private int randomDigits;
    private static int count = 0;
    public PasswordGenerator (int a, String b)
    {
        digitLength = a;
        prefix = b;
    }
    public PasswordGenerator (int a)
    {
        digitLength = a;
        prefix = "A";
    }
    public String pwGen ()
    {
        randomDigits = (int) (Math.random() * Math.pow(10,digitLength));
        String a = prefix + "." + randomDigits;
        count++;
        return a;
    }
    public int pwCount ()
    {
        return count;
    }
    public static void main(String[] args)
    {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }

}
/*
0
chs.4568
chs.9970
2
2
A.497854
3
3

Process finished with exit code 0
 */
