
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*1.Организовать беспрерывный  ввод чисел с клавиатуры, пока пользователь не введёт 0.
          После ввода нуля, показать на экран количество чисел, которые были введены,
          их общую сумму и среднее арифметическое.*/

        int Summ = 0;
        int Kolvo = 0;
        System.out.println("\nВведите желаемые числа. Когда захотите закончить, то введите 0");
        int Chislo = in.nextInt();
        while (Chislo != 0){
            Summ += Chislo;
            Kolvo += 1;
            Chislo = in.nextInt();
        }
        System.out.println("Количество введённых чисел:" + Kolvo);
        System.out.println("Сумма введённых чисел:" + Summ);
        System.out.println("Среднее арифмитическое введённых чисел:" + ((float) Summ / Kolvo));

        /*2.Написать программу, выводящую факториал числа (произведение чисел от 1 одного до n), заданного с клавиатуры.*/

        System.out.println("\nВведите число, факториал которого выхотите найти.\n");
        int Number = in.nextInt();
        int Fuck = 1;
        for (int i = Number; i > 0; i--){
            Fuck *= i;
        }
        System.out.println("Факториал задонного числа:" + Fuck);

        /*3.Написать программу, которая выводит на экран значение функции y = 5*x2-3*x-10 в диапазоне от -4 до 4,
        с шагом изменения аргумента в 0.5.*/

        for (double i = -4; i <= 4; i += 0.5){
            System.out.println("\n Значение функции в точке " + i + ": "+ (5*Math.pow(i,2)-3*i-10));
        }

        /*4.Вводится действительное х и натуральное n. Вычислить: sin x + sin x в квадрате + ... sin x в степени n.*/

        float X = in.nextFloat();
        int N = in.nextInt();
        float Summa = 0;
        for (int i = 1; i <= N; i++){
            Summa += Math.pow(Math.sin(X),i);
        }
        System.out.println("\nВывод: " + Summa);

        /*5.Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.*/

        System.out.println("\nВведите натурально число: ");
        int Natur = in.nextInt();
        int Summchet = 0;
        while (Natur > 0 ){
            if (Natur % 2 == 0)
                Summchet += (Natur % 10);
            Natur /= 10;
        }
        System.out.println("\nСумма четных цифр числа: " + Summchet);

        /*6.Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов.*/

        int N6 = in.nextInt();
        int F1 = 0;
        int F2 = 1;
        while (N6 >= 0){
            System.out.print(F2 + " ");
            F2 = F2 + F1;
            F1 = F2 - F1;
            N6 -= 1;
        }

        /*7.Вывести на экран таблицу умножения в виде таблицы*/

        System.out.println("\nТаблица умножения");
        System.out.print("  ");
        for (int i = 1; i <= 9; i++)
            System.out.print(" "+ i);
            System.out.print("\n-------------------------\n");
        for (int i = 2; i <= 9; i++){
            System.out.print(i + "| ");
            for (int j = 1; j <= 9; j++)
                System.out.print((i * j) + " ");
                System.out.println("");
        }
            /* 8.Бизнессмен взял ссуду М тысяч рублей в банке под 20% годовых.
            Через сколько лет его долг превысит S тысяч рублей, если за это время он не будет отдавать долг.*/

        float M = in.nextFloat();
        float S = in.nextFloat();
        int Let = 0;
        while (M <= S){
            Let += 1;
            S -= 0.2f * M;
        }
        System.out.println(Let);

        /*9.Найти сумму n-го количества элементов ряда 1, -0.5, 0.25, -0.125, …*/

        int N9 = in.nextInt();
        float Summ9 = 0;
        float Element = 1;
        for ( int i = 1; i <= N9; i++){
            Summ9 += Element;
            Element *= -0.5f;
        }
        System.out.println(Summ9);

        /*10.Напечатать все четырехзначные числа, в десятичной записи которых нет двух одинаковых цифр.*/

        for (int i = 1; i <= 9; i++)
            for (int j = 0; j <= 9; j++)
                for (int k = 0; k <= 9; k++)
                    for (int l = 0; l <= 9; l++){
                        if (i != j && i != k && i != l &&
                                j != k && j != l && k != l) {
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");
                        }
                    }

        /*  1*)Вывести (Естественно не просто забить в консольный вывод):
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  А а  ||  К к  ||  Х х  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  Б б  ||  Л л  ||  Ц ц  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  В в  ||  М м  ||  Ч ч  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  Г г  ||  Н н  ||  Ш ш  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  Д д  ||  О о  ||  Щ щ  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  Е е  ||  П п  ||  Ъ ъ  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  Ё ё  ||  Р р  ||  Ы ы  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  Ж ж  ||  С с  ||  Ь ь  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  З з  ||  Т т  ||  Э э  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  И и  ||  У у  ||  Ю ю  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^
                |  Й й  ||  Ф ф  ||  Я я  |
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^*/

        char Bukva = 1040;
        for (int i = 6; i > 0; i--){
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            for (int j = 2; j > 0; j--){
                System.out.print("|  "+ Bukva + " " +(char)(Bukva + 32) + "  |");
                Bukva += 10;
            } for (int j = 1; j > 0; j--){
                Bukva += 1;
                System.out.print("|  "+ Bukva + " " +(char)(Bukva + 32) + "  |");
            }
            Bukva -= 20;
        }for (int i = 1; i > 0; i--) {
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            for (int j = 1; j > 0; j--) {
                Bukva = 1025;
                System.out.print("|  " + Bukva + " ");
                Bukva = 1105;
                System.out.print(Bukva + "  |");
            }
                Bukva = 1056;
            for (int j = 2; j > 0; j--){
                System.out.print("|  "+ Bukva + " " +(char)(Bukva + 32) + "  |");
                Bukva += 11;
            }
        } Bukva -= 32;
        for (int i = 4; i > 0; i--){
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            for (int j = 2; j > 0; j--){
                System.out.print("|  "+ Bukva + " " +(char)(Bukva + 32) + "  |");
                Bukva += 11;
            } for (int j = 1; j > 0; j--){
                System.out.print("|  "+ Bukva + " " +(char)(Bukva + 32) + "  |");
            }
            Bukva -= 21;
        }
        for (int i = 1; i > 0; i--)
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        /* 2*) Валентина прогуляла лекцию по математике.
        Преподаватель решил подшутить над нерадивой студенткой и
        попросил ее на практическом занятии перечислить все положительные делители некоторых целых чисел.
        Для несложных примеров студентка быстро нашла решения (для числа 6 это: 1, 2, 3, 6; а для числа 16 это: 1, 2, 4, 8, 16), но этим все не закончилось.
        На домашнее задание ей дали варианты посложнее: 23436, 190187200, 380457890232.
        Решить такое вручную, как вы понимаете, практически нереально.
        Вот Валентина и обратилась к вам за помощью.*/

        for (int i = 1; i <= Math.sqrt(23436); i++){
            if (23436 % i == 0)
                System.out.print(i + " " + 23436 / i);
        }

        for (int i = 1; i <= Math.sqrt(190187200); i++){
            if (190187200 % i == 0)
                System.out.print(i + " " + 190187200 / i);
        }
        for (long i = 1; i <= Math.sqrt(380457890232L); i++){
            if (380457890232L % i == 0)
                System.out.print(i + " " + 380457890232L / i);
        }
    }
}