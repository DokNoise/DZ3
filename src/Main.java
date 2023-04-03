
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*1.Организовать беспрерывный  ввод чисел с клавиатуры, пока пользователь не введёт 0.
          После ввода нуля, показать на экран количество чисел, которые были введены,
          их общую сумму и среднее арифметическое.*/

        int summ = 0;
        int kolvo = 0;
        System.out.println("\nВведите желаемые числа. Когда захотите закончить, то введите 0");
        int chislo = in.nextInt();
        while (chislo != 0){
            summ += chislo;
            kolvo += 1;
            chislo = in.nextInt();
        }
        System.out.println("Количество введённых чисел:" + kolvo);
        System.out.println("Сумма введённых чисел:" + summ);
        System.out.println("Среднее арифмитическое введённых чисел:" + ((float) summ / kolvo));

        /*2.Написать программу, выводящую факториал числа (произведение чисел от 1 одного до n), заданного с клавиатуры.*/

        System.out.println("\nВведите число, факториал которого выхотите найти.\n");
        int number = in.nextInt();
        int fuck = 1;
        for (int i = 1; i <= number; i++){
            fuck *= i;
        }
        System.out.println("Факториал задонного числа:" + fuck);

        /*3.Написать программу, которая выводит на экран значение функции y = 5*x2-3*x-10 в диапазоне от -4 до 4,
        с шагом изменения аргумента в 0.5.*/

        for (float i = -4; i <= 4; i += 0.5f){
            System.out.println("\n Значение функции в точке " + i + ": "+ (5*Math.pow(i,2)-3*i-10));
        }

        /*4.Вводится действительное х и натуральное n. Вычислить: sin x + sin x в квадрате + ... sin x в степени n.*/

        float x = in.nextFloat();
        int n = in.nextInt();
        float summa = 0;
        for (int i = 1; i <= n; i++){
            summa += Math.pow(Math.sin(x),i);
        }
        System.out.println("\nВывод: " + summa);

        /*5.Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.*/

        System.out.println("\nВведите натурально число: ");
        int natur = in.nextInt();
        int summchet = 0;
        while (natur > 0 ){
            if (natur % 2 == 0)
                summchet += (natur % 10);
            natur /= 10;
        }
        System.out.println("\nСумма четных цифр числа: " + summchet);

        /*6.Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов.*/

        int n6 = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        for (int i = 1; i <= n6; i++){
            System.out.print(f2 + " ");
            f2 = f2 + f1;
            f1 = f2 - f1;
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

        float m = in.nextFloat();
        float s = in.nextFloat();
        int let = 0;
        while (m <= s){
            let += 1;
            s -= 0.2f * s;
        }
        System.out.println(let);

        /*9.Найти сумму n-го количества элементов ряда 1, -0.5, 0.25, -0.125, …*/

        int n9 = in.nextInt();
        float summ9 = 0;
        float element = 1;
        for ( int i = 1; i <= n9; i++){
            summ9 += element;
            element *= -0.5f;
        }
        System.out.println(summ9);

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

        char bukva = 1040;
        for (int i = 0; i < 6; i++){
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            for (int j = 0; j < 2; j++){
                System.out.print("|  "+ bukva + " " +(char)(bukva + 32) + "  |");
                bukva += 10;
            } for (int j = 1; j > 0; j--){
                bukva += 1;
                System.out.print("|  "+ bukva + " " +(char)(bukva + 32) + "  |");
            }
            bukva -= 20;
        }   System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.print("|  "+ (char) 1025 + " " +(char) 1105 + "  |");
                bukva = 1056;
            for (int j = 0; j < 2; j++){
                System.out.print("|  "+ bukva + " " +(char)(bukva + 32) + "  |");
                bukva += 11;
            }
         bukva -= 32;
        for (int i = 0; i < 4; i++){
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            for (int j = 0; j < 3; j++){
                System.out.print("|  "+ bukva + " " +(char)(bukva + 32) + "  |");
                bukva += 11;
            }
            bukva -= 32;
        }
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
                System.out.print(i + " " + 23436 / i + " ");
        }System.out.println("");
        for (int i = 1; i <= Math.sqrt(190187200); i++){
            if (190187200 % i == 0)
                System.out.print(i + " " + 190187200 / i + " ");
        }System.out.println("");
        for (long i = 1; i <= Math.sqrt(380457890232L); i++){
            if (380457890232L % i == 0)
                System.out.print(i + " " + 380457890232L / i + " ");
        }
    }
}