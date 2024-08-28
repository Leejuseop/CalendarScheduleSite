package calendar_schedule.calendar_schedule_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalendarScheduleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarScheduleServiceApplication.class, args);
	}

	/*
	 * 추가할 기능들
	 * Member 저장시에 아이디 중복확인해야함
	 * html파일들 css들 입혀야함
	 * 회원가입화면 post보낸 상태에서 새로고침하면 전에 전송했던 회원정보가 계속해서 등록됨. PRG패턴인가 Post-redirect-Get 이 방식으로 해결해야하는데 코드스페이스 환경이 redirect가 이상해서 안됨 ;;
	 * 회원달력 타이틀에 회원 아이디를 넣고싶은데 가능한가?? 예를 들면 아이디가 juseop이면 juseop의 달력 이렇게 나오게
	 * 
	 * 
	 * 
	 */


	/*
	 * 현재까지 한 내용
	 * 2024/7/27 index.html생성.
	 * 2024/8/2 로그인페이지 구현, 회원가입 페이지
	 * 2024/8/28 로그인 로직 구현, 로그인 실패 페이지 생성
	 * 
	 * 
	 * 
	 * 
	 */

	/* 해야할거
	 * 로직은 구현 해놨으니 달력페이지 만들어야됨 근데 달력 페이지 어케 만드냐 이거 부트스트랩 써야할고같은데 알아보기 or 선명씨
	 * 로그인시 /회원아이디 이 url로 넘어가는 페이지 구현
	 * 지금 문제가 DI에서 문제가 남. 이거 해결법은 찾고 가야된다잉 잘 기억안나면 찾아보자 // Di걍 망한건 같은데 영한쌤이 보면 깃허브 찢을듯 나중에 수정되면 수정하자 의존성 잘 지켜서
	 * 로그인 아이디 겹치고 그런거 로직 수정 (나중에 해도됨)
	 * 
	 * 
	 * 
	 */

	/* 잊지말아야 할 개념
	 * post로 데이터를 보낼때에는 input태그에 id, name 속성이 쓰이는데, id는 뭐 중복이 안되고 name은 중복이 된다 이러는거 같은데 중복은 솔직히 잘 모르겠고 name='@@" 이거 들어가야됨 ㅇㅋ? 없으면 데이터 안넘어가
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/* 이해 안가는거
	 * 뭐 데이터 넘길때 그 매개변수에 Customer customer이나 Model model 넣잖아 이게 무슨 의미인지 모르겠음. 
	 * 보면 loginService에서 한번 CalendarServiceController에서 한번 CustomerRepository 객체 생성하는데, 이게 왜 객체값이 같은지 모르겠음 final 떄문인거 같긴한데... 뭐 일단 좋긴해 원래 그렇게 같아야 되는 의도긴 한데...
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
