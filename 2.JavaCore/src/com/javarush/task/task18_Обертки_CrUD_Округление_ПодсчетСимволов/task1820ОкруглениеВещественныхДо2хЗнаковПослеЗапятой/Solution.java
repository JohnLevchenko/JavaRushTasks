package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1820ОкруглениеВещественныхДо2хЗнаковПослеЗапятой;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до 2-х знаков после запятой и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 — 3
3.50 — 4
3.51 — 4
-3.49 — -3
-3.50 — -3
-3.51 — -4

Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inStream = new FileInputStream(file1);
        BufferedWriter outStream = new BufferedWriter(new FileWriter(file2));


        String tranfer = "";
        while (inStream.available() > 0) {
            char data = ((char) inStream.read());
            tranfer = tranfer + String.valueOf(data);
        }

        String[] str = tranfer.split(" ");
        for (int i = 0; i < str.length; i++) {
            double numberLong = Double.parseDouble(str[i]);

            BigDecimal bigDecimal = new BigDecimal(numberLong, MathContext.DECIMAL64);
            double numberNew = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            outStream.write(numberNew+" ");
        }

        outStream.close();
        reader.close();
        inStream.close();
    }

}

































