package oop1.mind.obertka;

public class Ex {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        ex6();
    }

    static void ex6(){
        Double x = 3.5;
        System.out.println(x.intValue());//3
        System.out.println(x.compareTo(4.5));//-1
    }

    static void ex5(){
        Integer x = 3 + new Integer(5);//
        Integer x1 = 3;
//        Double x2 = 3;//	Не допустимо, это аналогично Double x = new Integer(3);.
        Double x3 = 3.0;
        int x4 = new Integer(3);
        int x5 = new Integer(3) + new Integer(4);
    }

    static void ex4(){
        System.out.println(Integer.parseInt("10"));//10
        System.out.println(Integer.parseInt("10", 10));//10
        System.out.println(Integer.parseInt("10", 16));//16
        System.out.println(Integer.parseInt("11"));//11
        System.out.println(Integer.parseInt("11", 10));//11
        System.out.println(Integer.parseInt("11", 16));//17
    }

    static void ex3(){
        Integer x = new Integer(3);
        System.out.println(x.intValue());//3
        System.out.println(x.compareTo(new Integer(4)));//-1
    }

    static void ex2(){
        Integer i = new Integer("23");
        //System.out.println(i);//23
        Integer i2 = new Integer(23);
        //System.out.println(i2);//23
        Integer i3 = Integer.valueOf("23");
        //System.out.println(i3);//23
        Integer i4 = Integer.parseInt("23", 8);
        //System.out.println(i4);//19
//        Double d = new Double();  NO ARG!!
        Double d = Double.valueOf("23.45");
        //System.out.println(d);//23.45
        int i5 = (Integer.valueOf("23")).intValue();
        //System.out.println(i5);//23
        double d1 = (Double.valueOf("23.4")).doubleValue();
        System.out.println(d);//23.45
        int i6 = (Double.valueOf("23.4")).intValue();
        System.out.println(i6);//23
        String s = (Double.valueOf("23.4")).toString();
        System.out.println(s);//23.4

    }

    static void ex1(){
        System.out.println(new Double(5.0));
        System.out.println(new Integer("5")+1);//6

        Double doubleObject = Double.valueOf("12.4");
        System.out.println(doubleObject);//12.4

        Integer.parseInt("11", 2);// возвращает 3
        Integer.parseInt("12", 8);//возвращает 10
        Integer.parseInt("13", 10);// возвращает 13
        Integer.parseInt("1A", 16);// возвращает 26
        // десятичное число можно преобразовать в шестнадцатеричное с помощью метода format().
        System.out.println( String.format("%x", 26));//возвращает 1A  1a


    }

}
