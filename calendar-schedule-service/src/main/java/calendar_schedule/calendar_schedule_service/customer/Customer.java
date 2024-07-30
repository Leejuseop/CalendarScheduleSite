package calendar_schedule.calendar_schedule_service.customer;

import lombok.Data;

@Data
public class Customer {
    private String customerId;
    private int customerPw;

    public Customer(String customerId, int customerPw){
        this.customerId = customerId;
        this.customerPw = customerPw;
    }

    public Customer(){
        
    }
}
