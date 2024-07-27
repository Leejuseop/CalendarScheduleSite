package calendar_schedule.calendar_schedule_service.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import calendar_schedule.calendar_schedule_service.member.Member;

import org.springframework.stereotype.Repository; 

@Repository
public class MemberRepository {
    private final Map<String, Member> store = new HashMap<>();

    public void saveMember(Member member){
        store.put(member.getMemberId(), member);
    }

    public Member findMemberById(String memberId){
        return store.get(memberId);
    }

    public List<Member> findMemberAll(){
        return new ArrayList<>(store.values());
    }
}
