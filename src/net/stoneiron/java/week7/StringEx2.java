package net.stoneiron.java.week7;

public class StringEx2 {
    public static void main(String[] args) {
        String a = new String("    Java ");
        String b = new String("Programming ");
        a = a.concat(b);
        System.out.println(a);
        a = a.trim();
        System.out.println(a);
        a = a.replace("Java", "자바");
        System.out.println(a);
        String s[] = a.split(" ");
        for (int i = 0; i < s.length; i++)
            System.out.println("분리된 문자열 " + i + ": " + s[i]);
        a = a.substring(0,2);
        System.out.println(a);
    }
}
