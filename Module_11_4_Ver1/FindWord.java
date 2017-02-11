package Module_11_4_Ver1;

import java.io.*;

public class FindWord {
    File file = new File("D:\\TextFile.txt");
    int checkWord(String word) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String fileText;
        int counter = 0;
        try {
            while ((fileText = reader.readLine()) != null) {
                if (fileText.contains(word)) {
                    ++counter;
                }
            }
            if (counter == 0) {
                System.out.println("The word'" + word + "'not found (0).");
            }
            if (counter > 0) {
                System.out.println("The word '" + word + "'is used " + counter + " times in the file");
            }
        } catch (IOException e) {
            System.err.println("File not found!");
        } finally {
            reader.close();
        }
        return counter;
    }
}
