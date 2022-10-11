package kata1.kata1;

import java.time.LocalDate;
import java.time.Month;


public class Kata1 {
    
    public static void main(String[] args){
        LocalDate.now();
        LocalDate nacimiento = LocalDate.of(1949, Month.MARCH, 24);
        //date = GregorianCalendar.getInstance();
        //date.set(1949,9,24);
        Person person = new Person("Blas", nacimiento);
        System.out.println(person.getName()+ " tiene "+ person.getAge()+ " años");
        
    }
}