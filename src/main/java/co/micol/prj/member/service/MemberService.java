package co.micol.prj.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectList();  //R
	List<MemberVO> memberSelectList(String key, String val);  //R
	
	MemberVO memberSelect(MemberVO vo); //R
	int memberInsert(MemberVO vo); //C
	int memberUpdate(MemberVO vo); //U
	int memberDelete(MemberVO vo); //D
	
	boolean isMemberIdCheck(String id); 
}
