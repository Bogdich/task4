package com.bogdevich.task4.util.reader;

import com.bogdevich.task4.exception.TextReaderException;
import com.sun.istack.internal.NotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Adrienne on 24.04.17.
 */
public class TextReader {
    public static String read(@NotNull String path) throws TextReaderException {
        try {
            StringBuilder result = new StringBuilder();
            Files.lines(Paths.get(path), Charset.defaultCharset()).forEach((item)->result.append(item).append("\n"));
            return result.toString();
        } catch (FileNotFoundException ex) {
            throw new TextReaderException("File not found " + path, ex);
        } catch (IOException ex) {
            throw new TextReaderException("Exception while reading file " + path, ex);
        }
    }
}
