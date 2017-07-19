/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import utility.*;
/**
 *
 * @author abhishekkumar
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) throws Exception{
        
        File fin = new File("/Users/abhishekkumar/NetBeansProjects/maths/src/files/input/tc1");
        FileInputStream fis = new FileInputStream(fin);
 
	//Construct BufferedReader from InputStreamReader
	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
 
	String line = null;
        int a =0;int b =0;int res=0;
	while ((line = br.readLine()) != null) {
                a = Integer.parseInt(line);
                b=Integer.parseInt(br.readLine());
                res = new sum().sub(a, b);
	}
 
	br.close();
       
    }
    
}
