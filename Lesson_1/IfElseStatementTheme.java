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
        int number = 3;
        System.out.println("Исходное число " + number);
        if (number == 0) {
            System.out.println("Число равно " + number);
        } else {
            if (number % 2 == 0) {
                System.out.print("четное ");
            } else if (number % 2 != 0) {
                System.out.print("нечетное");
            } 
            if (number > 0) {
                System.out.println(" положительное");
            } else if (number < 0) {
                System.out.println(" отрицательное");
            }
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int srcNum1 = 124;
        int srcNum2 = 123;
        System.out.println("Исходные числа " + srcNum1 + " и " + srcNum2);
        if (srcNum1 / 100 == srcNum2 / 100) {
            System.out.println("Одинаковые цифры в первом разряде " + srcNum1 / 100 + " " 
                    + srcNum2 / 100);
        } else {
            System.out.println("Равных цифр в первом разряде нет");
        }
        if (srcNum1 / 10 % 10 == srcNum2 / 10 % 10) {
            System.out.println("Одинаковые цифры во втором разряде " + srcNum1 / 10 % 10 + " " 
                    + srcNum2 / 10 % 10);
        } else {
            System.out.println("Равных цифр во втором разряде нет");
        }
        if (srcNum1 % 10 == srcNum2 % 10) {
            System.out.println("Одинаковые цифры в третьем разряде " + srcNum1 % 10 + " " 
                    + srcNum2 % 10);
        } else {
            System.out.println("Равных цифр в третьем разряде нет");
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
        float procentHistory = 0.59F;
        float procentProgramming = 0.91F;
        int gradeHistory = 2;
        int gradeProgramming = 2;
        if (procentHistory > 0.6 && procentHistory <= 0.73) {
            gradeHistory = 3;
        } else if (procentHistory > 0.73 && procentHistory <= 0.91) {
            gradeHistory = 4;
        } else if (procentHistory > 0.91) {
            gradeHistory = 5;
        }
        if (procentProgramming > 0.6 && procentProgramming <= 0.73) {
            gradeProgramming = 3;
        } else if (procentProgramming > 0.73 && procentProgramming <= 0.91) {
            gradeProgramming = 4;
        } else if (procentProgramming > 0.91) {
            gradeProgramming = 5;
        }
        System.out.println(gradeHistory + " - История");
        System.out.println(gradeProgramming + " - Программирование");
        System.out.println("Средний балл оценок по предметам " + 
                (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний % по предметам " + 
                100 * (procentHistory + procentProgramming) / 2 + "%");
        
        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int sale = 13000;
        int netCost = 9000;
        int profitYear = (sale - netCost - rent) * 12;
        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        } else if (profitYear < 0) {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        }
        
        System.out.println("\n9. Подсчет количества банкнот");
        int sumRequest = 567;
        // имеем банкноты номиналом 100, 10 и 1
        int hundred = 100;
        int twos = 10;
        int ones = 1;
        System.out.println("Номиналы банкнот " + hundred + ", " + twos + ", " + ones);
        // рассчитываем требуемое по запросу кол-во банкнот для выдачи 567
        int numHundredRequest = sumRequest / hundred;
        int numTwosRequest = sumRequest / twos % 10;
        int numOnesRequest = sumRequest % 10;
        // указываем фактическое кол-во банкнот в банкомате 10 по 100, 5 по 10, 50 по 1
        int numHundredFact = 10;
        int numTwosFact = 5;
        int numOnesFact = 50;
        if (numHundredRequest <= numHundredFact && numTwosRequest <= numTwosFact 
            && numOnesRequest <= numOnesFact) {
            System.out.println("Требуемое количество: " + 
                    numHundredRequest + " банкнот по " + hundred + ", " + 
                    numTwosRequest + " банкнот по " + twos + ", " +
                    numOnesRequest + " банкнот по " + ones);
        } else if (numHundredRequest <= numHundredFact && numTwosRequest > numTwosFact 
            && numOnesRequest <= numOnesFact) {
            // рассчитываем требуемое количество банкнот по 1 на замену
            int onesChange = (numTwosRequest - numTwosFact) * 10;
            System.out.println("Требуемое количество: " + 
                    numHundredRequest + " банкнот по " + hundred + ", " + 
                    numTwosFact + " банкнот по " + twos + ", " +
                    (numOnesRequest + onesChange) + " банкнот по " + ones);
            // находим сумму, фактически выданную банкоматом
            int sumFact = numHundredRequest * hundred + numTwosFact * twos + 
                (numOnesRequest + onesChange) * ones;
            System.out.println("Выдаваемая сумма: " + sumFact + " USD");
                    // проверяем равенство суммы по запросу и суммы, выданной по факту
                    if (sumRequest != sumFact) {
                        System.out.println("Ошибка");
                    }
        } else {
            System.out.println("Банкнот не хватает");
        }
    }
}