package edu.sdccd.cisc191;

import java.io.*;

/**
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 */
public class IOLab
{
private static final String RESOURCES_PATH = "src/main/resources";
    public static String readTestResults(String path) {
        StringBuilder sb = new StringBuilder();
        String relativePath = RESOURCES_PATH+ "/" + path;
  File file = new File(relativePath);
        if(!file.isFile()) {
            System.err.print(path + " isn't a file. Please try again.");
        }
        else{
            try {
                InputStream is = new FileInputStream(path);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line;
                boolean firstLine = true;
                while((line = br.readLine())!=null){
                    if(firstLine){
                        firstLine = false;
                    }
                    else{
                        sb.append(System.lineSeparator());
                    }
                    sb.append(line);
                }
            }
            catch(IOException e){
                System.err.print(e.getMessage());
            }

        }
        return sb.toString();
    }
// with eac run, a new set of data is appended to the file.
    public static void appendTestResult(String path, String newLine) {
        try {
            //makes a thing to write on file
            //makes a thing to NOT OVERWRITE file
            //writes on file.
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(newLine + "\n");
        }
        catch(IOException e){
            System.err.print(e.getMessage());
        }
    }

    public static String readDateTime(String url) {
       try{
        File file = new File(url);
        FileReader fw = new FileReader(file);
        BufferedReader bw= new BufferedReader(fw);
       url.indexOf("datetime", 0);
       }
       catch(IOException e){
           System.err.print(e.getMessage());
       }
        return "";
    }
}