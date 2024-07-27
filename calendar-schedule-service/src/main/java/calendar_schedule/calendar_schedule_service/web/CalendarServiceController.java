package calendar_schedule.calendar_schedule_service.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarServiceController {
    
    @GetMapping("/html/join.html") //templates에 있는 파일부터 찾는듯??
    public String joinForm(){
        return "join.html";
    }
}
