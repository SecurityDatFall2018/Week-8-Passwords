package dk.cphbusiness.hashing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TextFile {
    private List<String> lines = new ArrayList<>();
    
    public TextFile(String name) throws FileNotFoundException {
        ClassLoader cl = getClass().getClassLoader();
        BufferedReader in = new BufferedReader(
                new FileReader(new File(cl.getResource(name).getFile()))
                );
        in.lines().forEach(line -> lines.add(line));
        }
    
    public List<String> getLines() { return lines; }
    
    }
