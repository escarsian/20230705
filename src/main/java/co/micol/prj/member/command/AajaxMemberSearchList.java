package co.micol.prj.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class AajaxMemberSearchList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService memberService = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();  //json 객체로 돌려주기 위해.
		
		String key = request.getParameter("key");
		String val = request.getParameter("val");
//		System.out.println(key);
//		System.out.println(val);
		members = memberService.memberSelectList(key, val);
		
		String str = "Ajax:";
		try {
			str += mapper.writeValueAsString(members);  //json 타입의 문자열로 만듦.
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return str;
	}

}
