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
        int penPrice = 100;
        int bookPrice = 200;
        int sumPrice = penPrice + bookPrice;
        double discount = 0.11d;
        System.out.println("Сумма скидки " + sumPrice * discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой " + 
                (sumPrice - sumPrice * discount) + " руб.");
        
        System.out.println("\n\t3. Вывод слова JAVA\n");
        System.out.println("\t   J   a  v     v  a");
        System.out.println("\t   J  a a  v   v  a a");
        System.out.println("\tJ  J aaaaa  V V  aaaaa");
        System.out.println("\t JJ a     a  V  a     a");
        
        System.out.println("\n\t4. Вывод min и max значений целых числовых типов\n");
        byte maxByte = 127;
        System.out.println("Тип byte: " + maxByte);
        System.out.println("После инкремента: " + ++maxByte);
        System.out.println("После декремента: " + --maxByte);
        short maxShort = 32767;
        System.out.println("Тип short: " + maxShort);
        System.out.println("После инкремента: " + ++maxShort);
        System.out.println("После декремента: " + --maxShort);
        int maxInt = 2147483647;
        System.out.println("Тип int: " + maxInt);
        System.out.println("После инкремента: " + ++maxInt);
        System.out.println("После декремента: " + --maxInt);
        long maxLong = 9223372036854775807L;
        System.out.println("Тип long: " + maxLong);
        System.out.println("После инкремента: " + ++maxLong);
        System.out.println("После декремента: " + --maxLong);
        
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
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Перемена мест с помощью арифметики: " + num1 + " и " + num2);
        // перемена значений переменных местами с помощью побитовой операции
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("Перемена мест с помощью побитовой операции ^: " + num1 + " и " + num2);
        
        System.out.println("\n\t6. Вывод символов и их кодов\n");
        char sym35 = '#';
        char sym38 = '&';
        char sym68 = '@';
        char sym94 = '^';
        char sym95 = '_';
        System.out.println("Код символа " + (byte) sym35 + 
                " - Cимвол ASCII-таблицы " + sym35);
        System.out.println("Код символа " + (byte) sym38 + 
                " - Cимвол ASCII-таблицы " + sym38);
        System.out.println("Код символа " + (byte) sym68 + 
                " - Cимвол ASCII-таблицы " + sym68);
        System.out.println("Код символа " + (byte) sym94 + 
                " - Cимвол ASCII-таблицы " + sym94);
        System.out.println("Код символа " + (byte) sym95 + 
                " - Cимвол ASCII-таблицы " + sym95);
        
        System.out.println("\n\t7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char roundBracketOpen = '(';
        char roundBracketClose = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + sym95 + roundBracketOpen + " " + 
                roundBracketClose + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + sym95 + sym95 + sym95 + 
                sym95 + slash + backslash + sym95 + sym95 + 
                backslash);
        
        System.out.println("\n\t8. Вывод количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        int hundred = srcNum / 100;
        int twos = srcNum / 10 % 10;
        int ones = srcNum % 10;
        System.out.println("Число 123 содержит: \n" + hundred + " сотню\n" + twos + 
                " десятка\n" + ones + " единицы");
        System.out.println("Сумма его цифр = " + (hundred + twos + ones));
        System.out.println("А произведение = " + hundred * twos * ones);
        
        System.out.println("\n\t9. Вывод времени\n");
        int time = 86399;
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = minute % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}