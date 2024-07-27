package calendar_schedule.calendar_schedule_service.member;

import lombok.Data;

@Data
public class Member {
    private String memberId;
    private int memberPw;

    public Member(String memberId, int memberPw){
        this.memberId = memberId;
        this.memberPw = memberPw;
    }
}
