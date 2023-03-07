// создать файл и записать в нем 10 раз слово "тест"

package seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task_4 {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("test\n");
        }
        try {
            FileWriter fr = new FileWriter(file,true);
            fr.write(sb.toString());
            fr.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
