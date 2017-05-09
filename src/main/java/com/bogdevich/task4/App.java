package com.bogdevich.task4;

import com.bogdevich.task4.entity.composite.AbstractComponent;
import com.bogdevich.task4.exception.TextReaderException;
import com.bogdevich.task4.util.parser.AbstractParser;
import com.bogdevich.task4.util.parser.Impl.TextParser;
import com.bogdevich.task4.util.reader.TextReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
//            String str = TextReader.read("data/input.txt");
//            Files.write(Paths.get("data/output.txt"), str.getBytes());

            AbstractParser parser = new TextParser();
            AbstractComponent text = parser.parse(TextReader.read("data/input.txt"));
            Files.write(Paths.get("data/output.txt"), text.toString().getBytes());

//            System.out.println(str);
        } catch (TextReaderException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
