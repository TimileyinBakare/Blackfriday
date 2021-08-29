
package blackfriday;

import java.time.LocalDate;
import java.time.Month;

public class Fridays extends Products{

    private LocalDate currentDate;
    private LocalDate firstFriday;
    private LocalDate secondFriday;
    private LocalDate thirdFriday;
    
    public Fridays(Cloth cloth,Phones phone,Electronic electronic,LocalDate firstFriday,LocalDate secondFriday,LocalDate thirdFriday,LocalDate currentDate){
        super(cloth,phone,electronic);
        this.firstFriday = firstFriday;
        this.currentDate = currentDate;
        this.secondFriday = secondFriday;
        this.thirdFriday = thirdFriday;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public LocalDate getFirstFriday() {
        return firstFriday;
    }
    
    public LocalDate getSecondFriday() {
        return secondFriday;
    }

    public LocalDate getThirdFriday() {
        return thirdFriday;
    }
    
    
    public void validationFirstFriday()
    {
        if(currentDate.isEqual(firstFriday))
        {
            System.out.println("Quick Sales Discount");
            getCloth().DiscountProduct1(5);
            getCloth().DiscountProduct2(5);
        }else
        {
            
            System.out.println(".");
            System.out.println("Cloth Available");
            getCloth().Product1();
            getCloth().Product2();
        }
        
        if(currentDate.isEqual(secondFriday))
        {
             System.out.println("Quick Sales Discount");
             getPhone().DiscountProduct1(10);
             getPhone().DiscountProduct2(10);
        }else
        {
            System.out.println(".");
              System.out.println("Phone Available");
              getPhone().Product1();
              getPhone().Product2();
        }
        
        if(currentDate.isEqual(thirdFriday))
        {
            System.out.println("Quick Sales Discount");   
            getElectronic().DiscountProduct1(15);
            getElectronic().DiscountProduct2(15);  
        }else
        {
            System.out.println(".");
            System.out.println("Electronic");
            getElectronic().Product1();
            getElectronic().Product2();
        }
    }
}
