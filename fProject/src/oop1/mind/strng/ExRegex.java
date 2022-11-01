package oop1.mind.strng;

public class ExRegex {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    static void ex2(){
        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);

    }

    static void ex1(){
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));//true
//        "440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");

        String s = "a+b$#c".replaceAll("[$+#]", "NNN");//aNNNbNNNNNNc
        System.out.println(s);

    }
}
