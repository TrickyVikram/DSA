package Basics;

public class Rstr {

    public static void main(String[] args) {
        String name = "Vikram";

        String Rname = "";
        int n = name.length();

     
        for (int i = n-1 ; i >= 0; --i) {
            Rname += name.charAt(i);
        }

        System.out.println(Rname);
    }
}
