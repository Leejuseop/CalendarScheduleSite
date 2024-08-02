package calendar_schedule.calendar_schedule_service.customer;

import lombok.Data;

@Data
public class Customer {
    private String customerId;
    private int customerPw;
    private Long customerSequence;

    public Customer(String customerId, int customerPw, Long customerSequence){
        this.customerId = customerId;
        this.customerPw = customerPw;
        this.customerSequence = customerSequence;
    }

    public Customer(){
        
    }
}
