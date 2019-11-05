package hello.model;

import org.springframework.data.annotation.Id;

public class Receipt {
    @Id
    public String id;
    public String date;
    public String shopName;
    public String location;
    public String item;

}