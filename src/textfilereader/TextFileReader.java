/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfilereader;
 import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author cahin7692
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String txtFile;
        txtFile = (JOptionPane.showInputDialog("Enter the name of the file (No .txt)"));
        
        File textFile = new File(txtFile+".txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		try {
                    in = new FileReader(textFile);
                    readFile = new BufferedReader(in);
                    while ((lineOfText = readFile.readLine()) != null ) {
                            System.out.println(lineOfText);
                    }
                    readFile.close();
                    in.close();
                } catch (FileNotFoundException e) {
                    System.out.println("File does not exist or could not be found.");
                    System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
                    System.out.println("Problem reading file.");
                    System.err.println("IOException: " + e.getMessage());
        }
    }	
}
