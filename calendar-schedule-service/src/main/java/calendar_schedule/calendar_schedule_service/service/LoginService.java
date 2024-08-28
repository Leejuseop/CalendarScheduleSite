package calendar_schedule.calendar_schedule_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calendar_schedule.calendar_schedule_service.customer.Customer;
import calendar_schedule.calendar_schedule_service.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginService {
    private final CustomerRepository customerRepository;

    public LoginService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public boolean certifyLoginInfo(Customer customer){

        Customer findCustomer = customerRepository.findCustomerById(customer.getCustomerId());

        if(customerRepository.checkCustomerIdExist(customer) == false){
            System.out.println(customerRepository + "  loginservice");
            return false;
        }
        else if(customer.getCustomerPw() != findCustomer.getCustomerPw()){
            return false;
        }
        else{
            return true;
        }
    }
}
