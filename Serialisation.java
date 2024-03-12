package Serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
       EmployeS e=new EmployeS();

//  FileOutputStream fout=new FileOutputStream("D:\\Serialization\\fileser.ser");
//  ObjectOutputStream out=new ObjectOutputStream(fout);
//         out.writeObject(e);
//         out.close();
//         fout.close();
//System.out.println(e.getName());
   FileInputStream fin=new FileInputStream("D:\\Serialization\\fileser.ser");
   ObjectInputStream in=new ObjectInputStream(fin);
      EmployeS dse=(EmployeS)  in.readObject();
      in.close();
      fin.close();
      System.out.println(dse.getName());
    }
}
