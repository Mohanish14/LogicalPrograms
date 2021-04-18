    /* Save this in a file called Main.java to compile and test it */
package com.deepcloneingexample;
    /* Do not add a package declaration */
    import java.util.*;
    import java.io.*;
     
    /* You may add any imports here, if you wish, but only from the
       standard library */
     
    public class Main {
        public static int processData(ArrayList<String> array) {
     
    String str[];
    int low=100,low1,count=0;        
    for(String s : array){
    str= s.split(",");
    low1=Integer.parseInt(str[2].trim());
    if(low>low1){
    count++;
    low=low1;
        }
    }
    int sal=0,tot=0;
    int avg=0;
    for(String s : array){
    str=s.split(",");
    int dept=Integer.parseInt(str[2].trim());
    sal=Integer.parseInt(str[3].trim());
    if(low==dept) {
    tot=tot+sal;
    }
    }
     
    avg=tot/count;
     
            return avg;
        }
     
        public static void main (String[] args) {
            ArrayList<String> inputData = new ArrayList<String>();
            
            
            try {
            	
            	File f1= new File("C:\\input.txt");
            boolean 	fev=f1.createNewFile();
            	File f2=new File("C:\\output.txt");
            	
                boolean 	fev2=f2.createNewFile();
                Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
                while(in.hasNextLine()) {
                    String line = in.nextLine().trim();
                    if (!line.isEmpty()) // Ignore blank lines
                        inputData.add(line);
                }
                int retVal = processData(inputData);
                PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
                output.println("" + retVal);
                output.close();
            } catch (IOException e) {
                System.out.println("IO error in input.txt or output.txt");
            }
        }
    }