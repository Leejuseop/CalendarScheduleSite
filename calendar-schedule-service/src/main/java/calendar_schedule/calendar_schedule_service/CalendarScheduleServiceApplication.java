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
	 * 
	 */


	/*
	 * 현재까지 한 내용
	 * 2024/7/27 index.html생성.
	 * 2024/7/@@ 회원가입화면 만들고 로직 이어줘야함 addForm그거처럼 GetMapping이랑 PostMapping이용해서 데이터 넘겨줘야함.
	 *  -> 자 일단 index.html뜯어고치셈. 헷갈리고 별로야 그래서 해야할게
	 * 
	 * 1. 지금 index.html을 login.html로 수정하고 새로운 index.html은 버튼 하나 냅두고 누르면 바로 login.html로 들어가게끔해 
	 * // 커밋하나 조져 index.html, login.html분리 아니면 기본회면과 로그인화면 분리 이렇게
	 * -> 완료
	 * 
	 * 2. saved.html이게 이제 저장되었다는 말과 함께 버튼 하나 만들고 기존 로그인 화면으로 돌아가는 링크 걸어놔. 
	 * // 커밋하나 조져 저장확인페이지 구현 이런느낌
	 * -> 완료
	 * 
	 * 3. 그리고 login.html에 회원 저장 잘 됬는지 확인하게 회원 목록 조회하는 페이지로 가는 버튼 하나 만들자.
	 *  + Customers.html하나 만들어 이거는 이제 비밀번호는 안보여주고 회원 아이디만 보여줄거야 그거랑 버튼하나 로그인 화면으로 돌아가기 ㅇㅋ?
	 * // 커밋하나 조져 회원 목록 페이지구현 
	 * -> 완료
	 * 
	 */

	/*
	 * 
	 * 
	 */

}
