package lab;

import java.util.Date;

public class order {
    private Date dateRecevied ;
    private boolean isPrepaid;
    private String number;
    private int price ; //money  
    

    public void dispatch(){

    }
    public void close(){
        //...

    }
}
class customer {
    String name, address;

    public String getCreditRange (){
        return "";
    }
}
class OrderLine extends order{
    int quantity ;
}

class CorporateCustomer extends customer{
    String contactName, creditRating,creditLimit;

    public int billForMonth(){
        return 7;
    }

    public void remind(){
        //....
    }
}
class PersonalCustomer extends customer {
    String CardNumber; 
}


