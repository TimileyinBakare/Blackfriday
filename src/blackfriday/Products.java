    
package blackfriday;

/**
 *
 * @author Dell Latitude E7270
 */
public class Products {
    public Cloth cloth;
    public Phones phone;
    public Electronic electronic;
    

    Products(Cloth cloth,Phones phone,Electronic electronic) {
        this.cloth = cloth;
        this.phone = phone;
        this.electronic = electronic;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public Phones getPhone() {
        return phone;
    }

    public Electronic getElectronic() {
        return electronic;
    }
    
    

    
    
}
