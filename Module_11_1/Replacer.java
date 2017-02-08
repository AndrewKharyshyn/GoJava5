package Module_11_1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Replacer {
    File file = new File("D:\\newFile.txt");
    void createFile() throws IOException {
        try {
            if (file.exists()) {
                throw new IOException();
            }
            FileWriter writer = new FileWriter("D:\\newFile.txt", false);
            String textString = "I am learning Java Core SE";
            writer.write(textString);
            writer.flush();
            fileReader();

        } catch (IOException e) {
            System.err.println("The file already exists!");
        }
    }

    void fileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\newFile.txt"));
        String fileText = "";
        try {
            while ((fileText = reader.readLine()) != null) {
                System.out.print("This is the original file content: " + "\n" + fileText + "\n");
            }
            reader.close();
            //Create Map, where Key is the words to be found and Value is the words to change
            Map<String, String> request = new HashMap<>();
            request.put("I am", "We are");
            replacer(request);

        } catch (IOException e) {
            System.err.println("File not found!");
        }
    }

    String replacer(Map<String, String> map) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        FileWriter writer = new FileWriter(file);
        String line;
        while ((line = reader.readLine()) != null) {
                String editedLine = line.replaceAll(map.entrySet().stream().findFirst().get().getKey(), map.entrySet().stream().findFirst().get().getValue());
                writer.write(editedLine);
        }
        reader.close();
        writer.flush();
        writer.close();
        System.out.println("Here is the replaced value:" + "\n" + map.entrySet().stream().findFirst().get().getValue());
        return line;
    }
}
