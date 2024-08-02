package calendar_schedule.calendar_schedule_service.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import calendar_schedule.calendar_schedule_service.customer.Customer; 

@Repository
public class CustomerRepository {
    private static final Map<Long, Customer> store = new HashMap<>();
    private Long customerSequence = 0L;

    public CustomerRepository(){

    }

    public void saveCustomer(Customer customer){
        customer.setCustomerSequence(++customerSequence);
        store.put(customer.getCustomerSequence(), customer);
    }

    public Customer findCustomerById(Long customerSequence){
        return store.get(customerSequence);
    }

    public List<Customer> findCustomerAll(){
        return new ArrayList<>(store.values());
    }
}
