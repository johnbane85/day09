package myapp.core;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    {
        FileParser fp = new FileParser(args[0]);
        Session ss = new Session(fp);
        // ss.printFileContents();
        ss.start();
    }
}