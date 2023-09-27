/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listexample1;
import java.util.*;

/**
 *
 * @author jelly_joneske
 */
public class ListExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <String> myList =new ArrayList<String>();
        myList.add("Hotel Menu");
                myList.add("1.breakfast");
                        myList.add("2.lunch");
                                myList.add("3.supper");
                               int i=0;
                                do{
                                    System.out.println(myList.get(i));
                                    i++;
                               
                                
    }
                                while(i <myList.size());
    }
    
}
