//The program takes a "C program Source Code"
//reads it into a list and counts the number of comment lines
//return an output telling the user how many lines of comments are present

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.File;

public class SourceCode {
    public static void main(String[] args) throws IOException {
        int count = 0;
        List<String> list = Files.readAllLines(Path.of("C:\\Users\\hardw\\IdeaProjects\\" +
                "Assignment2\\src\\example1.txt"), Charset.defaultCharset());
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).contains("//")){
                count++;
            }
        }
        System.out.println("You're source code has " + count + " lines of comments");
    }
}
