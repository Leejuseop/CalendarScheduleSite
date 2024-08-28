package calendar_schedule.calendar_schedule_service.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import calendar_schedule.calendar_schedule_service.customer.Customer;
import calendar_schedule.calendar_schedule_service.repository.CustomerRepository;
import calendar_schedule.calendar_schedule_service.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CalendarServiceController {
    
    // private final CustomerRepository customerRepository; // 야 근데 이건 객체 생성은 안하고 변수 선언만 해놓고 어떻게 사용할수가 있는거임??
    private final CustomerRepository customerRepository = new CustomerRepository();
    private final LoginService loginService = new LoginService(customerRepository);

    @GetMapping("/html/login.html")
    public String loginForm(){
        return "login";
    }

    @GetMapping("/html/join.html") //templates에 있는 파일부터 찾는듯??
    public String joinForm(){
        return "join";
    }

    @PostMapping("/html/join.html") //Getmapping으로 join.html을 들어가서 post로 폼을 전송하면 html코드의 action태그에 붙은 URL로 이동이됨. 근데 포스트 방식으로 받은 URL이니깐 이 함수가 호출.
    public String joinCustomer(Customer customer){
        customerRepository.saveCustomer(customer);
        return "saved";
    }

    @GetMapping("/html/saved.html")
    public String savedForm(){
        return "saved";
    }

    @GetMapping("/html/customers.html")
    public String customersForm(Model model){
        List<Customer> customers = customerRepository.findCustomerAll();
        model.addAttribute("customers", customers);

        return "customers";
    }

    @PostMapping("/html/calender.html")
    public String calenderForm(Customer customer){
        if(loginService.certifyLoginInfo(customer) == true){
            return "calender";
        }
        else{
            return "wrongInfo";
        }
    }

    
}
