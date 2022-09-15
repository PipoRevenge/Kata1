/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata1.kata1;

import java.util.Date;

/**
 *
 * @author aleja
 */
public class Person {
    private final String name;
    private final Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime()- birthdate.getTime())/(365.25*24*60*60*1000));
    }
    
}
