public class VariablesTheme {
    // Перед public static void main(String[] args) желательно ставить пустую строку
    public static void main(String[] args) {
        // TODO: 1. Вывод значений переменных на консоль
        System.out.println("\n\t1. Вывод значений переменных на консоль\n");
        byte numVerWindows = 10;
        System.out.println("Версия Windows " + numVerWindows);
        short typeSystem = 64;
        System.out.println("Тип системы x" + typeSystem + "-based PC");
        int volumePhysMemory = 1234567;
        System.out.println("Объем физической памяти " + volumePhysMemory + "МБ");
        long volumeDisk = 33444555;
        System.out.println("Объем жесткого диска " + volumeDisk + "байт");
        float procClockSpeed = 2.304f;
        System.out.println("Тактовая частота процессора " + procClockSpeed + "Ггц");
        double priseWindows = 120.14367346d;
        System.out.println("Стоимость Windows " + priseWindows + "$");
        char systemSecretCode = '&';
        System.out.println("Секретное обозначение ОС " + systemSecretCode);
        boolean licensedSystem = true;
        System.out.println("Используется лицензионная система: true or false? - " + licensedSystem);
        
        // TODO: 2. Расчет стоимости товара со скидкой
        System.out.println("\n\t2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        double totalDiscount = 0.11d;
        System.out.println("Сумма скидки " + (penPrice + bookPrice)*totalDiscount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой " + ((penPrice + bookPrice) - 
                (penPrice + bookPrice)*totalDiscount) + " руб.");
        
        // TODO: 3. Вывод слова JAVA
        System.out.println("\n\t3. Вывод слова JAVA\n");
        System.out.println("\t   J   a  v     v  a");
        System.out.println("\t   J  a a  v   v  a a");
        System.out.println("\tJ  J aaaaa  V V  aaaaa");
        System.out.println("\t JJ a     a  V  a     a");
        
        // TODO: 4. Вывод min и max значений целых числовых типов
        byte numByte = 127;
        byte numByteIncrement = (byte) (numByte + 1);
        byte numByteDecrement = (byte) (numByte - 1);
        short numShort = 32767;
        short numShortIncrement = (short) (numShort + 1);
        short numShortDecrement = (short) (numShort - 1);
        int numInt = 2147483647;
        int numIntIncrement = (int) (numInt + 1);
        int numIntDecrement = (int) (numInt - 1);
        long numLong = 9223372036854775807L;
        long numLongIncrement = (long) (numLong + 1);
        long numLongDecrement = (long) (numLong - 1);
        System.out.println("\n\t4. Вывод min и max значений целых числовых типов\n");
        System.out.println("Первоначальное значение переменной byte: " + numByte);
        System.out.println("Значение после инкремента переменной byte: " + numByteIncrement);
        System.out.println("Значение после декремента переменной byte: " + numByteDecrement);
        System.out.println("Первоначальное значение переменной short: " + numShort +
                "\nЗначение после инкремента переменной short: " + numShortIncrement + 
                "\nЗначение после декремента переменной short: " + numShortDecrement);
        System.out.println("Первоначальное значение переменной int: " + numInt + 
                "\nЗначение после инкремента переменной int: " + numIntIncrement + 
                "\nЗначение после декремента переменной int: " + numIntDecrement);
        System.out.println("Первоначальное значение переменной long: " + numLong + 
                "\nЗначение после инкремента переменной long: " + numLongIncrement + 
                "\nЗначение после декремента переменной long: " + numLongDecrement);
        
        // TODO: 5. Перестановка значений переменных
        System.out.println("\n\t5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения переменных: " + num1 + " и " + num2);
        // поменяйте значения переменных местами с помощью третьей переменной
        int num3 = num1; //2
        num1 = num2; //5
        num2 = num3; //2
        System.out.println("Перемена мест с помощью третьей переменной: " + num1 + " и " + num2);
        // поменяйте значения переменных местами с помощью арифметических операций
        num1 = num1 + num2 - num1; // 5+2-5=2
        num2 = num1 + num2 + 1; // 2+2+1=5
        System.out.println("Перемена мест с помощью арифметики: " + num1 + " и " + num2);
        // перемена значений переменных местами с помощью побитовой операции
        System.out.println("Перемена мест с помощью побитовой операции ^: " + (num2^num1 - num1) +
                " и " + (num1^num2 - num2) );
        
        // TODO: 6. Вывод символов и их кодов
        System.out.println("\n\t6. Вывод символов и их кодов\n");
        char thirtyFiveChar = '#';
        byte thirtyFiveByte = (byte) thirtyFiveChar;
        char thirtyEightChar = '&';
        byte thirtyEightByte = (byte) thirtyEightChar;
        char sixtyFourChar = '@';
        byte sixtyFourByte = (byte) sixtyFourChar;
        char ninetyFourChar = '^';
        byte ninetyFourByte = (byte) ninetyFourChar;
        char ninetyFiveChar = '_';
        byte ninetyFiveByte = (byte) ninetyFiveChar;
        System.out.println("Код символа " + thirtyFiveByte + " - Cимвол ASCII-таблицы " +
                thirtyFiveChar);
        System.out.println("Код символа " + thirtyEightByte + " - Cимвол ASCII-таблицы " +
                thirtyEightChar);
        System.out.println("Код символа " + sixtyFourByte + " - Cимвол ASCII-таблицы " +
                sixtyFourChar);
        System.out.println("Код символа " + ninetyFourByte + " - Cимвол ASCII-таблицы " +
                ninetyFourChar);
        System.out.println("Код символа " + ninetyFiveByte + " - Cимвол ASCII-таблицы " +
                ninetyFiveChar);
        
        // TODO 7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n\t7. Вывод в консоль ASCII-арт Дюка\n");
        char rightSlash = '/';
        char leftSlash = '\\';
        char roundBracketOpen = '(';
        char roundBracketClose = ')';
        System.out.println("    " + rightSlash + leftSlash);
        System.out.println("   " + rightSlash + "  " + leftSlash);
        System.out.println("  " + rightSlash + ninetyFiveChar + roundBracketOpen + " " + 
                roundBracketClose + leftSlash);
        System.out.println(" " + rightSlash + "      " + leftSlash);
        System.out.println("" + rightSlash + ninetyFiveChar + ninetyFiveChar + ninetyFiveChar + 
                ninetyFiveChar + rightSlash + leftSlash + ninetyFiveChar + ninetyFiveChar + 
                leftSlash);
        
        // TODO 8. Вывод количества сотен, десятков и единиц числа
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