/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackfriday;


class Electronic {
    private String product1;
    private String product2;
    private int price1;
    private int price2;

    public Electronic(String product1, String product2, int price1, int price2) {
        this.product1 = product1;
        this.product2 = product2;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getProduct1() {
        return product1;
    }

    public String getProduct2() {
        return product2;
    }

    public int getPrice1() {
        return price1;
    }

    public int getPrice2() {
        return price2;
    }

   

    public void DiscountProduct1(float discount)
    {
        float discountPrice = price1 -(price1 *(discount/100));
        System.out.println("The Discount for " + product1 + " with initial Price of $" + price1 + " is $" + discountPrice);
    }
    public void DiscountProduct2(float discount)
    {
        float discountPrice = price2 -(price2 *(discount/100));
        System.out.println("The Discount for " + product2 + " with initial Price of $" + price2 + " is $" + discountPrice);
    }
    
    public void Product1()
    {
        System.out.println("Products available today " + product1 + " for  $" + price1);
    }
    
    public void Product2()
    {
        System.out.println("Products available today " + product2 + " for  $" + price2);
    }

}
