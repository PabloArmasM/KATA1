/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("Hola");
        Person p1;
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1964, 7 ,3);
        
        p1 = new Person("Enrique", "Ramon",f1);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirth());
        System.out.println(p1.getAge());
        System.out.println(".........");
        
    }
    
}
