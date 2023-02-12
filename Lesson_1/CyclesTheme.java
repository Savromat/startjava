public class CyclesTheme {
    
    public static void main (String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int var1 = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (var1 % 2 == 0) {
                sumEven = sumEven + var1;
            } else {
                sumOdd = sumOdd + var1;
            }
            var1++;
        } while (var1 <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);
        
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        }
        if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        }
        if (num3 > num1 && num3 > num2) {
            maxNum = num3;
        }
        
        if (num1 < num2 && num1 < num3) {
            minNum = num1;
        }
        if (num2 < num1 && num2 < num3) {
            minNum = num2;
        }
        if (num3 < num1 && num3 < num2) {
            minNum = num3;
        }
        
        for (int j = (maxNum - 1); j > minNum; j--) {
            System.out.print(j + " ");
        }
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int numReverse = 0;
        int sum = 0;
                
        while (num > 0) {
            numReverse = num % 10;
            sum = sum + numReverse;
            System.out.print(numReverse + " ");
            num /= 10;
        }
        System.out.println();
        System.out.println(sum);
        
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int x = 0;
        for (int i = 1; i < 11; i += 2) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        for (int j = 11; j < 21; j += 2) {
            System.out.printf("%5d", j);
        }
        System.out.println();
        for (int k = 21; k < 24; k += 2) {
            System.out.printf("%5d", k);
        }
        System.out.printf("%5d%5d%5d", x, x, x);
        System.out.println();
       
        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int number = 3242592;
        int n = 0;
        while (number >= 1) {
            if (number % 10 == 2) {
                n = n + 1;
            }
            number /= 10; 
        }
        if (n % 2 == 0) {
            System.out.println("Число 3242592" + " содержит " + n + " (четное) количество двоек");
        } else {
            System.out.println("Число 3242592" + " содержит " + n + " (нечетное) количество двоек");
        }
       
        System.out.println("\n6. Отображение фигур в консоли");
        String str1 = "* * * * * * * *";
        for (int i = 0; i < 4; i++) {
            System.out.println(str1);
        }

        String str2 = "#";
        System.out.println(str2);
        int j6 = 0;
        while (j6 < 4) {
            str2 = str2 + "#";
            System.out.println(str2);
            j6++;
        }

        int k6 = 0;
        String ch1 = "$";
        System.out.println(ch1);
        do {
            ch1 = ch1 + "$" ;
            System.out.println(ch1);
            k6++;
        } while (k6 < 2);

        int var6 = 0;
        String ch2 = "$";
        do {
            ch2 = ch2 + "$";
            System.out.println(ch2);
            var6++;
        } while (var6 < 1);
        System.out.println("$");
        
        System.out.println("\n7. Отображение ASCII-символов");
        for (char i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%30s\n", i);
            }
        }

        for (char j = 97; j <= 122; j++) {
            if (j % 2 == 0) {
                System.out.printf("%30s\n", j);
            }
        }
    
        System.out.println("\n8. Проверка, является ли число палиндромом");
        String s = "1234321";
        int i8 = 0;
        int j8 = s.length() - 1;
        int counter = 0; 

        while (i8 < j8) {
            if (s.charAt(i8) == s.charAt(j8)) {
                counter += 1;
            }
            i8++;
            j8--;
            if (counter == (i8 + j8) / 2) {
                System.out.println("Число " + s + " является палиндромом");
            }

        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        int numberHappy = 456456;
        int abc = numberHappy / 1000;
        int def = numberHappy % 1000;
        int sum1 = abc / 100 + abc / 10 % 10 + abc % 10;
        int sum2 = def /100 + def / 10 % 10 + def % 10;
        System.out.println("Сумма цифр " + abc + " = " + sum1);
        System.out.println("Сумма цифр " + def + " = " + sum2);
        
        if (sum1 == sum2) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число является несчастливым");
        }
        
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.printf("%2s%4d%4d%4d%4d%4d%4d%4d%4d\n", "|", 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.printf("%2s", "__________________________________");
        System.out.println("");
        
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d%s", i, "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}