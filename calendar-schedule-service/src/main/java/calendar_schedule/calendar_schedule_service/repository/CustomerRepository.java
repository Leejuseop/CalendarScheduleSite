package calendar_schedule.calendar_schedule_service.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import calendar_schedule.calendar_schedule_service.customer.Customer; 

@Repository
public class CustomerRepository {
    private static final Map<String, Customer> store = new HashMap<>();

    public CustomerRepository(){

    }

    public void saveCustomer(Customer customer){
        store.put(customer.getCustomerId(), customer);
    }

    public Customer findCustomerById(String customerId){
        return store.get(customerId);
    }

    public List<Customer> findCustomerAll(){
        return new ArrayList<>(store.values());
    }
}