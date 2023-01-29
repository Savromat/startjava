public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 15;
        if (age > 20) {
            System.out.println("Ave, принцип!");
        } else {
            System.out.println("Ave, гастат!");
        }
        boolean male = false;
        if (!male) {
            System.out.println("Амазонки рулят!");
        } else {
            System.out.println("Мужики - сила!");
        }
        float height = 1.70F;
        if (height < 1.80) {
            System.out.println("Рост не выше среднего");
        } else {
            System.out.println("Рост выше среднего");
        }
        char firstLetterName = "Ivan".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени - " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени - " + firstLetterName);
        } else {
            System.out.println("Первая буква имени не М и не I");
        }
        
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 48;
        int num2 = 25;
        if (num1 > num2) {
            System.out.println("Число num1 = " + num1 + " - max, число num2 = " + num2 + " - min");
        } else if (num1 < num2) {
            System.out.println("Число num1 = " + num1 + " - min, число num2 = " + num2 + " - max");
        } else {
            System.out.println("Числа равны");
        }
        
        System.out.println("\n3. Проверка числа");
        int number = -2;
        System.out.println("Исходное число " + number);
        if (number == 0) {
            System.out.println("Число равно " + number);
        } else {
            if (number % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("нечетное");
            } 
            if (number > 0) {
                System.out.println(" положительное");
            } else {
                System.out.println(" отрицательное");
            }
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int srcNum1 = 567;
        int srcNum2 = 124;
        System.out.println("Исходные числа " + srcNum1 + " и " + srcNum2);
        
        boolean result1 = srcNum1 / 100 == srcNum2 / 100;
        boolean result2 = srcNum1 / 10 % 10 == srcNum2 / 10 % 10;
        boolean result3 = srcNum1 % 10 == srcNum2 % 10;

        if (result1) {
            System.out.println("Одинаковые цифры в первом разряде " + srcNum1 / 100 + " " 
                    + srcNum2 / 100);
        }
        if (result2) {
            System.out.println("Одинаковые цифры во втором разряде " + srcNum1 / 10 % 10 + " " 
                    + srcNum2 / 10 % 10);
        }
        if (result3) {
            System.out.println("Одинаковые цифры в третьем разряде " + srcNum1 % 10 + " " 
                    + srcNum2 % 10);
        }
        if (!result1 && !result2 && !result3) {
            System.out.println("Равных цифр нет");
        }
        
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - число");
        } else {
            System.out.println(symbol + " - не буква и не число");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int sum = 300_000;
        float percent = 0.05F;
        System.out.println("Сумма вклада " + sum);
        if (sum >= 100_000 && sum <= 300_000) {
            percent = 0.07F;
        } else if (sum > 300_000) {
            percent = 0.10F;
        }
        System.out.println("Процентная ставка - " + percent * 100 + " %");
        System.out.println("Сумма, начисленная по % - " + (int) (sum * percent));
        System.out.println("Итоговая сумма с % " + (int) (sum + sum * percent));
        
        System.out.println("\n7. Определение оценки по предметам");
        float percentHistory = 0.59F;
        float percentProgramming = 0.91F;
        int gradeHistory = 2;
        int gradeProgramming = 2;
        if (percentHistory > 0.6 && percentHistory <= 0.73) {
            gradeHistory = 3;
        } else if (percentHistory > 0.73 && percentHistory <= 0.91) {
            gradeHistory = 4;
        } else if (percentHistory > 0.91) {
            gradeHistory = 5;
        }
        if (percentProgramming > 0.6 && percentProgramming <= 0.73) {
            gradeProgramming = 3;
        } else if (percentProgramming > 0.73 && percentProgramming <= 0.91) {
            gradeProgramming = 4;
        } else if (percentProgramming > 0.91) {
            gradeProgramming = 5;
        }
        System.out.println(gradeHistory + " - История");
        System.out.println(gradeProgramming + " - Программирование");
        System.out.println("Средний балл оценок по предметам " + 
                (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний % по предметам " + 
                100 * (percentHistory + percentProgramming) / 2 + "%");
        
        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int sale = 13000;
        int netCost = 9000;
        int profitYear = (sale - netCost - rent) * 12;
        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        }
        
        System.out.println("\n9. Подсчет количества банкнот");
        int sumRequest = 567;
        int hundredsRequest = sumRequest / 100;
        int tensRequest = sumRequest / 10 % 10;
        int onesRequest = sumRequest % 10;
        int hundredsFact = 10;
        int tensFact = 5;
        int onesFact = 50;

        if (hundredsRequest > hundredsFact) {
            tensRequest += (hundredsRequest - hundredsFact) * 10;
            hundredsRequest = hundredsFact;
        }
        if (tensRequest > tensFact) {
            onesRequest += (tensRequest - tensFact) * 10;
            tensRequest = tensFact;
        }
        if (onesRequest > onesFact) {
            System.out.println("Купюр в банкомате недостаточно");
        } else {
            System.out.println("Купюр 100$ - " + hundredsRequest + 
                    " шт., купюр 10$ - " + tensRequest + " шт., купюр 1$ - " + onesRequest +
                    " шт.\nВсего " + sumRequest + "$ к выдаче");
        }
    }
}