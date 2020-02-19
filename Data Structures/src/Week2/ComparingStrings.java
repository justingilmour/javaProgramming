package Week2;

public class ComparingStrings {

    public static void main(String[] args) {
//        System.out.println("abc".compareTo("abd") <= 0);
//        System.out.println("abc".compareTo("abc") <= 0 );
//        System.out.println("abd".compareTo("abc") <= 0);

//        System.out.println("abcdef".length());
//        System.out.println("abcdef".charAt(0));
//        String stri = "abcdef";
//        System.out.println(stri.substring(1,5));

        String s1 = "Monty";
        String s2 = "Python";
        System.out.println(s1.length() + s2.length());
        System.out.println(s2.charAt(4));
        System.out.println(s1.charAt(2)==s2.charAt(s2.length()-1));
        System.out.println(s1.substring(0,2)+s2.substring(4,6));
        System.out.println(s1.contains("ty") && s2.contains("yt"));
        System.out.println("hello".indexOf("l"));
        System.out.println(s1.indexOf("on")+s2.indexOf("a"));
        System.out.println((s1 + s2).replace("o", "i"));
        System.out.println("remove all the e's from this text".replace("e",""));
    }
}
