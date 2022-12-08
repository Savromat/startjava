public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n\t1. Вывод значений переменных на консоль\n");
        byte numVerWindows = 10;
        System.out.println("Версия Windows " + numVerWindows);
        short typeSystem = 64;
        System.out.println("Тип системы x" + typeSystem + "-based PC");
        int volumePhysMemory = 1234567;
        System.out.println("Объем физической памяти " + volumePhysMemory + "МБ");
        long volumeDisk = 33444555;
        System.out.println("Объем жесткого диска " + volumeDisk + "байт");
        float cpuClockSpeed = 2.304f;
        System.out.println("Тактовая частота процессора " + cpuClockSpeed + "Ггц");
        double priceWindows = 120.14367346d;
        System.out.println("Стоимость Windows " + priceWindows + "$");
        char systemSecretCode = '&';
        System.out.println("Секретное обозначение ОС " + systemSecretCode);
        boolean licensedSystem = true;
        System.out.println("Используется лицензионная система: true or false? - " + licensedSystem);
        
        System.out.println("\n\t2. Расчет стоимости товара со скидкой\n");
        int sumPrice = 100 + 200;
        double totalDiscount = 0.11d;
        System.out.println("Сумма скидки " + sumPrice * totalDiscount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой " + (sumPrice - sumPrice * 
                totalDiscount) + " руб.");
        
        System.out.println("\n\t3. Вывод слова JAVA\n");
        System.out.println("\t   J   a  v     v  a");
        System.out.println("\t   J  a a  v   v  a a");
        System.out.println("\tJ  J aaaaa  V V  aaaaa");
        System.out.println("\t JJ a     a  V  a     a");
        
        System.out.println("\n\t4. Вывод min и max значений целых числовых типов\n");
        byte numByte = 127;
        System.out.println("Тип byte: " + numByte);
        // делаем инкремент (numByte = 127 увеличиваем на 1, переполняем тип byte)
        numByte++; 
        System.out.println("После инкремента " + numByte);
        // делаем декремент, возвращаем numByte первоначальное значение 127
        numByte--;
        // делаем декремент (уменьшаем numByte = 127 на 1, нет переполнения, обычная арифметика)
        numByte--;
        System.out.println("После декремента: " + numByte);
        short numShort = 32767;
        System.out.println("Тип short: " + numShort);
        numShort++;
        System.out.println("После инкремента: " + numShort);
        numShort--;
        System.out.println("После декремента: " + numShort);
        int numInt = 2147483647;
        System.out.println("Тип int: " + numInt);
        numInt++;
        System.out.println("После инкремента: " + numInt);
        numInt--;
        System.out.println("После декремента: " + numInt);
        long numLong = 9223372036854775807L;
        System.out.println("Тип long: " + numLong);
        numLong++;
        System.out.println("После инкремента: " + numLong);
        numLong--;
        System.out.println("После декремента: " + numLong);
    
        System.out.println("\n\t5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        // поменяйте значения переменных местами с помощью третьей переменной
        int num3 = num1; 
        num1 = num2;
        num2 = num3;
        System.out.println("Перемена мест с помощью третьей переменной: " + num1 + " и " + num2);
        // поменяйте значения переменных местами с помощью арифметических операций
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Перемена мест с помощью арифметики: " + num1 + " и " + num2);
        // перемена значений переменных местами с помощью побитовой операции
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("Перемена мест с помощью побитовой операции ^: " + num1 + " и " + num2);
        
        System.out.println("\n\t6. Вывод символов и их кодов\n");
        char thirtyFive = 35;
        char thirtyEight = 38;
        char sixtyFour = 64;
        char ninetyFour = 94;
        char ninetyFive = 95;
        System.out.println("Код символа " + (byte)thirtyFive + " - Cимвол ASCII-таблицы " +
                thirtyFive);
        System.out.println("Код символа " + (byte)thirtyEight + " - Cимвол ASCII-таблицы " +
                thirtyEight);
        System.out.println("Код символа " + (byte)sixtyFour + " - Cимвол ASCII-таблицы " +
                sixtyFour);
        System.out.println("Код символа " + (byte)ninetyFour + " - Cимвол ASCII-таблицы " +
                ninetyFour);
        System.out.println("Код символа " + (byte)ninetyFive + " - Cимвол ASCII-таблицы " +
                ninetyFive);
        
        System.out.println("\n\t7. Вывод в консоль ASCII-арт Дюка\n");
        char rightSlash = '/';
        char leftSlash = '\\';
        char roundBracketOpen = '(';
        char roundBracketClose = ')';
        System.out.println("    " + rightSlash + leftSlash);
        System.out.println("   " + rightSlash + "  " + leftSlash);
        System.out.println("  " + rightSlash + ninetyFive + roundBracketOpen + " " + 
                roundBracketClose + leftSlash);
        System.out.println(" " + rightSlash + "      " + leftSlash);
        System.out.println("" + rightSlash + ninetyFive + ninetyFive + ninetyFive + 
                ninetyFive + rightSlash + leftSlash + ninetyFive + ninetyFive + 
                leftSlash);
        
        System.out.println("\n\t8. Вывод количества сотен, десятков и единиц числа\n");
        short onetwothree = 123;
        short sot = (short)(onetwothree/100);
        short des = (short)((onetwothree-100)/10);
        short ed = (short)((onetwothree-100)%10);
        System.out.println("Число 123 содержит: \n" + sot + " сотню\n" + des + " десятка\n" + ed + 
                " единицы");
        System.out.println("Сумма его цифр = " + (sot+des+ed));
        System.out.println("А произведение = " + sot*des*ed);
    }
}