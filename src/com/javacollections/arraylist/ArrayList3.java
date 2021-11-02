package com.javacollections.arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class ArrayList3 {

    public static void main(String [] args)
    {
        List<String> al=new ArrayList<String>();

        
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        try
        {
            //Serialization
            FileOutputStream fos=new FileOutputStream("file");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList  list=(ArrayList)ois.readObject();
            System.out.println(list);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
