package co.micol.prj.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.micol.prj.member.service.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberSelectList();  //R
	List<MemberVO> memberSelectList(@Param("key") String key, @Param("val") String val);  //R
	
	
	MemberVO memberSelect(MemberVO vo); //R
	int memberInsert(MemberVO vo); //C
	int memberUpdate(MemberVO vo); //U
	int memberDelete(MemberVO vo); //D
	
	boolean isMemberIdCheck(String id);
}
