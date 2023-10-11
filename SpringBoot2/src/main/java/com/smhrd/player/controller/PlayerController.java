package com.smhrd.player.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.player.service.PlayerService;

// Spring 기본 순서
// 요청 : Controller -> Service -> Mapper Interface -> Mapper.xml
// 결과 : Mapper.xml -> Mapper Interface -> Service -> Controller

// Controller : 요청을 받고, 응답을 하는 작업에 집중
// Service : DB에서 가지고 온 데이터를 가공하는 작업에 집중(비지니스 로직)
// @RestController (데이터를 응답할 컨트롤러) = @ResoponseBody + @Controller
// @ResponseBody : view조회를 무시하고, Http message body에 직접 해당 내용을 입력하여 화면에 return값 출력
//				   즉, viewResolver를 무시하고 화면에 출력하겠다는 의미
// @RequestParam : HttpServletRequest의 request.getParameter의 기능과 동일



@RestController  
// 리액트 서버로 데이터만 응답
@CrossOrigin("http://43.200.171.213:3000")
// 웹 페이지의 제한된 자원을 외부 도메인에서 접근할수 있도록 허용해주는 매커니즘
// 서로 다른 도메인에서 리소스를 공유하는 방식
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	
	// select * from player;
	@RequestMapping("/PlayerList.do")
	public JSONArray PlayerList() {
		
		System.out.println("Spring : PlayerList.do");
		// 리액트 서버로 json데이터 응답

		 return playerService.PlayerList();
	}
	
	@RequestMapping("PlayerDetail.do")
	public JSONObject PlayerDetail(@RequestParam String name) {
		
		System.out.println("이름 : " + name);
		
		// DB에서 나상호의 정보만 가지고 와서 리액트로 전송
		// JsonObject -> put메소드 활용 : put("key", value)
		
		return null;
	}
	
	
}
