package fileAnalyzer;

import java.io.IOException;
import java.util.Map;

public class FileAnalyzerDemo {

    public static void main(String[] args) throws IOException {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore1\\src\\fileAnalyzer\\text.txt";

        Map<String, Integer> stringIntegerMap = fileAnalyzer.wordMap(path);

        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }
    }
}
