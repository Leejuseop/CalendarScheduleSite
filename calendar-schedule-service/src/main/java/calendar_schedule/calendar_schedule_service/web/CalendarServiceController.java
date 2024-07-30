package calendar_schedule.calendar_schedule_service.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import calendar_schedule.calendar_schedule_service.customer.Customer;
import calendar_schedule.calendar_schedule_service.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CalendarServiceController {
    
    private final CustomerRepository customerRepository;   

    @GetMapping("/html/login.html")
    public String loginForm(){
        return "login.html";
    }

    @GetMapping("/html/join.html") //templates에 있는 파일부터 찾는듯??
    public String joinForm(){
        return "join.html";
    }

    @PostMapping("/html/join.html") //Getmapping으로 join.html을 들어가서 post로 폼을 전송하면 html코드의 action태그에 붙은 URL로 이동이됨. 근데 포스트 방식으로 받은 URL이니깐 이 함수가 호출.
    public String joinCustomer(Customer customer){
        customerRepository.saveCustomer(customer);
        return "saved.html";
    }

    @GetMapping("/html/saved.html")
    public String savedForm(){
        return "saved.html";
    }
}
