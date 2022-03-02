public class FirstLesson {
    public static void main(String[] args) {
        //sout
        System.out.println("Информация для входа в консоль");
        //типДанных имяПеременной
        int size; //объявили переменную size типа int
        int count = 71899;
        int lenght = 122, width = 500;

        count = 80_000; // _ для удобства чтения
        System.out.println(count);

        //bute data = 327; превышен допустимый диапазон

        //integer number too large
        long veryBig = 67_000_000_000L;

        //деление целых чисел на 0 нельзя


        double price = 56.7;
        float temp = -78.3f;

        //деление с плавающей точкой на 0
        System.out.println(price/0); // Infinity
        System.out.println(temp/0); // - Infinity

        //double price = 34; // в рамках одной области видимости не могут быть задана одна и та же переменная, только отдельно на строчке

        count = 8700; // int 8700
        //автоматическое приведение типов
        price = count; // double 8700.0
        System.out.println(price);

        // явное приведение типов
        byte small = (byte) count; //-4
        System.out.println(small);

        //операторы
        int a = 9, b = 4;
        //int c = a/b;
        double c = (double) a/b; // 2
        System.out.println(c); // 2.0


        byte x = 6, y = 12;
        byte z = (byte)( x + y); // byte + byte = int


        //%
        lenght = 9;
        width = 4;
        System.out.println(lenght % width); // 1
        // 4.5 4.5
        // 0.5 + 0.5 = 1

        System.out.println(7 % 4); // 3
        System.out.println(9 % 2); // 1
        System.out.println(8 % 2); // 0
        System.out.println(3 % 90); // 3


        // операторы присваивания
        int num = 10;
        num += 10; // num = num + 10
        num -= 10; // num = num - 10
        num *= 10; // num = num * 10
        num /= 10; // num = num / 10
        num %= 10; // num = num % 10

        System.out.println(a > b); // true
        System.out.println(lenght == width); // false
        System.out.println(400 != 40); // true


        // тернарный оператор
        int start = 3, end = 5000;
        int res = start > end ? end - start : 0; // true (1 значение до :) false (2 значение после :)
        System.out.println(res);


    }
}
