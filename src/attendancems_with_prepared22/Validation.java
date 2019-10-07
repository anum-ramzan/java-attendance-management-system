/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Iqbal-Asi
 */
public class Validation {
    public static String validateData(String a, String b){
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(b);
        if (m.matches()){
            return "Valid";                    
        }
        else{
            return "Invalid";
            
        }
        
    }
    public static Icon validate (String a, String b) {
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(b);
        if (m.matches()){
            Icon icon = (new ImageIcon("attendancems_with_prepared22.Project_Images/validdation-smiley.jpg"));
            String image = icon.toString();
            
            return icon;
        }
        else {
            Icon icon = (new ImageIcon("attendancems_with_prepared22.Project_Images/validdation-sad.jpg"));
            String image = icon.toString();
            
            return icon;
        }
        
    }
    
    
        
}
