package dz1Part2dop;

/**
 3. (2 балла) Старый телефон Андрея сломался, поэтому он решил приобрести
 новый. Продавец телефонов предлагает разные варианты, но Андрея
 интересуют только модели серии samsung или iphone. Также Андрей решил
 рассматривать телефоны только от 50000 до 120000 рублей. Чтобы не тратить
 время на разговоры, Андрей хочет написать программу, которая поможет ему
 сделать выбор.
 На вход подается строка – модель телефона и число – стоимость телефона.
 Нужно вывести "Можно купить", если модель содержит слово samsung или
 iphone и стоимость от 50000 до 120000 рублей включительно. Иначе вывести
 "Не подходит".
 Гарантируется, что в модели телефона не указано одновременно несколько
 серий.
 */
public class TskDop3 {
    public static void main(String[] args) {
        String str;
        int poz;
        String dStr;

//        Scanner scanner=new Scanner(System.in);
//        str=scanner.nextLine();
        //str="samsung-2 S 21 120000";
        str="iphone XL 58000";
        poz=str.lastIndexOf(" ");
        dStr=str.substring(poz+1);

        String s1="samsung";
        String s2="iphone";
        //String strd = str.replaceAll("\\D+","");
        int intValue = Integer.parseInt(dStr);

        if((str.contains(s1)||str.contains(s2))&&(intValue>=50000&&intValue<=120000))
            System.out.println("Можно купить");
        else
            System.out.println("Не подходит");
    }
}
