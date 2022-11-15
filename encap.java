public class encap{
    private String brand, type;
    private double price, rate, year;


// Getter 
String getbrand(){
    return brand;
}
String gettype(){
    return type;
}

double getprice(){
    return price;
}

double getrate(){
    return rate;
}

double getyear(){
    return year;
}

// Setter
public void setbrand(String newbrand) {
    this.brand = newbrand;
}
public void settype(String newtype) {
    this.type = newtype;
}
public void setprice(double newprice) {
    this.price = newprice;
}
public void setrate(double newrate) {
    this.rate = newrate;
}
public void setyear(double newyear) {
    this.year = newyear;
}

}


