
package blackfriday;

import java.time.LocalDate;
import java.time.Month;


public class BlackFriday {

    public static void main(String[] args) {
             LocalDate myCurrentDate = LocalDate.of(2021, Month.JANUARY,22);
             LocalDate firstFridayDate = LocalDate.of(2021, Month.JANUARY,15);
             LocalDate secondFridayDate = LocalDate.of(2021, Month.JANUARY,22);
             LocalDate thirdFridayDate = LocalDate.of(2021, Month.JANUARY,29);
             
             Cloth cloth = new Cloth("Versace", "gucci", 150,200);
             Phones phone = new Phones("iPhone", "Samsung", 1000, 920);
             Electronic electronic = new Electronic("TV", "Stabilizer", 400, 300);
//             Products products = new Products(cloth,phone,electronic);
             Fridays firstfriday = new Fridays(cloth,phone,electronic,firstFridayDate,secondFridayDate,thirdFridayDate,myCurrentDate);
             
             System.out.println("Welcome to $not's Black Friday");
             firstfriday.validationFirstFriday();
             

    }
    
}
