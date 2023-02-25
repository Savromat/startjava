public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);
        
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = -1;
        int num2 = 5;
        int num3 = 10;
        int numEndInterval;
        int numMin;
        if (num1 > num2 && num1 > num3) {
            numEndInterval = num1;
        } else if (num2 > num1 && num2 > num3) {
            numEndInterval = num2;
        } else {
            numEndInterval = num3;
        }

        if (num1 < num2 && num1 < num3) {
            numMin = num1;
        } else if (num2 < num1 && num2 < num3) {
            numMin = num2;
        } else {
            numMin = num3;
        }

        for (int i = (numEndInterval - 1); i > numMin; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        
        while (num > 0) {
           int digit = num % 10;
            sum += digit;
            System.out.print(digit + " ");
            num /= 10;
        }
        System.out.println("\n" + sum);
        
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int numStartInterval = 1;
        int numFinishInterval = 24;
        for (int i = numStartInterval; i < numFinishInterval; i += 2) {
            System.out.printf("%5d", i);
            numStartInterval = numStartInterval + 1;
                if (numStartInterval > 5 && numStartInterval < 7) {
                    System.out.println("");
                }
                if (numStartInterval > 10 && numStartInterval < 12) {
                    System.out.println("");
                }
                if (numStartInterval > 15 && numStartInterval < 17) {
                    System.out.println("");
                }
        }
        for (int j = 1; j < numFinishInterval / 5; j++) {
                        System.out.printf("%5d", 0);
                    }
        
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int numTwos = 3242592;
        int numCounter = 0;
        while (numTwos >= 1) {
            if (numTwos % 10 == 2) {
                numCounter = numCounter + 1;
            }
            numTwos /= 10; 
        }
        if (numCounter % 2 == 0) {
            System.out.println("Число 3242592" + " содержит " + numCounter + 
                    " (четное) количество двоек");
        } else {
            System.out.println("Число 3242592" + " содержит " + numCounter + 
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
            triangle += "#";
            System.out.println(triangle);
            triangleCounter++;
        }

        int cornerUpCounter = 0;
        String cornerUp = "$";
        System.out.println(cornerUp);
        do {
            cornerUp += "$" ;
            System.out.println(cornerUp);
            cornerUpCounter++;
        } while (cornerUpCounter < 2);

        int cornerDownCounter = 0;
        String cornerDown = "$";
        do {
            cornerDown += "$";
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
        int numFirst = 0;
        int numEnd = palindrome.length() - 1;
        int countPalindrome = 0; 

        while (numFirst < numEnd) {
            if (palindrome.charAt(numFirst) == palindrome.charAt(numEnd)) {
                countPalindrome += 1;
            }
            numFirst++;
            numEnd--;
            if (countPalindrome == (numFirst + numEnd) / 2) {
                System.out.println("Число " + palindrome + " является палиндромом");
            }
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        int numHappy = 456456;
        int FirstThreeNum = numHappy / 1000;
        int LastThreeNum = numHappy % 1000;
        int sum1 = FirstThreeNum / 100 + FirstThreeNum / 10 % 10 + FirstThreeNum % 10;
        int sum2 = LastThreeNum /100 + LastThreeNum / 10 % 10 + LastThreeNum % 10;
        System.out.println("Сумма цифр " + FirstThreeNum + " = " + sum1);
        System.out.println("Сумма цифр " + LastThreeNum + " = " + sum2);
        
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