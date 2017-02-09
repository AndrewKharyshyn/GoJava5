package Module_11_2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ContentReplacer {

    File file = new File("D:\\newFile2.txt");

    void createFile() throws IOException {
        try {
            if (file.exists()) {
                throw new IOException();
            }
            FileWriter writer = new FileWriter("D:\\newFile2.txt", false);
            String textString = "I am learning Java Core SE";
            writer.write(textString);
            writer.flush();
            writer.close();
            fileReader();

        } catch (IOException e) {
            System.err.println("The file already exists!");
        }
    }

    void fileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\newFile2.txt"));
        String fileText;
        try {
            while ((fileText = reader.readLine()) != null) {
                System.out.print("This is the original file content: " + "\n" + fileText + "\n");
            }
            reader.close();
            //Create Map, where Key is the words to be found and Value is the words to change
            Map<String, String> request = new HashMap<>();
            request.put("I am", "We are");
            contentReplacer(request);

        } catch (IOException e) {
            System.err.println("File not found!");
        }
    }

    File contentReplacer(Map<String, String> map) throws IOException {
        BufferedReader buffReader = new BufferedReader(new FileReader(file));

        String searchText = map.entrySet().stream().findFirst().get().getKey();
        String newText = map.entrySet().stream().findFirst().get().getValue();
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = buffReader.readLine()) != null) {
            line = line.replace(searchText, newText);
            stringBuilder.append(line);
        }
        buffReader.close();
        FileWriter buffWriter = new FileWriter(file);
        buffWriter.write(stringBuilder.toString());
        buffWriter.close();

        System.out.println("Changes saved to file. Here is the new file content:" + "\n'" + stringBuilder + "'");
        return file;
    }
}
