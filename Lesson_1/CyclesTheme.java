public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int range = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (range % 2 == 0) {
                sumEven = sumEven + range;
            } else {
                sumOdd = sumOdd + range;
            }
            range++;
        } while (range <= 21);
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
        
        for (int i = (maxNum - 1); i > minNum; i--) {
            System.out.print(i + " ");
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
        int originalNumber = 0;
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
        System.out.printf("%5d%5d%5d", originalNumber, originalNumber, originalNumber);
        System.out.println();
        
        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int number = 3242592;
        int numberCounter = 0;
        while (number >= 1) {
            if (number % 10 == 2) {
                numberCounter = numberCounter + 1;
            }
            number /= 10; 
        }
        if (numberCounter % 2 == 0) {
            System.out.println("Число 3242592" + " содержит " + numberCounter + 
                    " (четное) количество двоек");
        } else {
            System.out.println("Число 3242592" + " содержит " + numberCounter + 
                    " (нечетное) количество двоек");
        }
       
        System.out.println("\n6. Отображение фигур в консоли");
        String rectangle = "* * * * * * * *";
        for (int i = 0; i < 4; i++) {
            System.out.println(rectangle);
        }

        String triangle = "#";
        System.out.println(triangle);
        int triangleCounter = 0;
        while (triangleCounter < 4) {
            triangle = triangle + "#";
            System.out.println(triangle);
            triangleCounter++;
        }

        int cornerUpCounter = 0;
        String cornerUp = "$";
        System.out.println(cornerUp);
        do {
            cornerUp = cornerUp + "$" ;
            System.out.println(cornerUp);
            cornerUpCounter++;
        } while (cornerUpCounter < 2);

        int cornerDownCounter = 0;
        String cornerDown = "$";
        do {
            cornerDown = cornerDown + "$";
            System.out.println(cornerDown);
            cornerDownCounter++;
        } while (cornerDownCounter < 1);
        System.out.println("$");
        
        System.out.println("\n7. Отображение ASCII-символов");
        for (char i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%30s\n", i);
            }
        }

        for (char i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%30s\n", i);
            }
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        String palindrome = "1234321";
        int numberFirst = 0;
        int numberEnd = palindrome.length() - 1;
        int counter = 0; 

        while (numberFirst < numberEnd) {
            if (palindrome.charAt(numberFirst) == palindrome.charAt(numberEnd)) {
                counter += 1;
            }
            numberFirst++;
            numberEnd--;
            if (counter == (numberFirst + numberEnd) / 2) {
                System.out.println("Число " + palindrome + " является палиндромом");
            }
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        int numberHappy = 456456;
        int FirstThreeNumbers = numberHappy / 1000;
        int LastThreeNumbers = numberHappy % 1000;
        int sum1 = FirstThreeNumbers / 100 + FirstThreeNumbers / 10 % 10 + FirstThreeNumbers % 10;
        int sum2 = LastThreeNumbers /100 + LastThreeNumbers / 10 % 10 + LastThreeNumbers % 10;
        System.out.println("Сумма цифр " + FirstThreeNumbers + " = " + sum1);
        System.out.println("Сумма цифр " + LastThreeNumbers + " = " + sum2);
        
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