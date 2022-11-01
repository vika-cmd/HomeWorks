package oop1.mind.strng;

public class BuffBuilder {
    public static void main(String[] args) {
        //br1();
        //br2();
        br3();
    }
    static void br3() {
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);
        System.out.println(s);//Java
        System.out.println(builder);//Java and HTML
    }
    private static void change(String s, StringBuilder builder) {
        s = s + " and HTML";
        builder.append(" and HTML");
    }


    static void br2(){
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");

        System.out.println(s1.append(" is fun"));//Java is fun
        System.out.println(s1.append(s2));//Java is funHTML
        System.out.println(s1.insert(2, "is fun"));//Jais funva is funHTML
        System.out.println(s1.insert(1, s2));//JHTMLais funva is funHTML

        System.out.println(s1.charAt(2));//T
        System.out.println(s1.length());//25
        System.out.println(s1.deleteCharAt(3));//JHTLais funva is funHTML
        System.out.println(s1.delete(1, 3));//JLais funva is funHTML

        System.out.println(s1.reverse());//LMTHnuf si avnuf siaLJ
        System.out.println(s1.replace(1, 3, "Computer"));//LComputerHnuf si avnuf siaLJ
        System.out.println(s1.substring(1, 3));//Co
        System.out.println(s1.substring(2));//omputerHnuf si avnuf siaLJ

//        ѕокажите значение s1 после каждого из следующих предложений. ѕредположите, что предложени€ не зависимы друг от друга.
//        1. s1.append(" is fun");
//        2. s1.append(s2);
//        3. s1.insert(2, "is fun");
//        4. s1.insert(1, s2);
//        5. s1.charAt(2);
//        6. s1.length();
//        7. s1.deleteCharAt(3);
//        8. s1.delete(1, 3);
//        9. s1.reverse();
//        10. s1.replace(1, 3, "Computer");
//        11. s1.substring(1, 3);
//        12. s1.substring(2);

    }

    static void br1(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");
        System.out.println(stringBuilder);//Welcome to Java
        stringBuilder.insert(11, "HTML and ");
        System.out.println(stringBuilder);//Welcome to HTML and Java

    }
}
