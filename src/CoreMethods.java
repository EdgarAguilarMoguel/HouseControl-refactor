
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class CoreMethods {
  
    public int searchObject(Object otherObject, ArrayList<?> objects){
        int index = 0;  
        return index = ((objects.contains(otherObject)) ? objects.indexOf(otherObject) : -1 );
    }
   
   
}
