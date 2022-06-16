package myapp.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
  private List<String> contents = new ArrayList<>();

  public FileParser(String fileName) throws IOException{
      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fr);
      String line;
      while (null != (line = br.readLine()))
          contents.add(line);
      fr.close();
  }

  public List<String> getContents(){
    return this.contents;
  }
}