package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.SessionAttributes;

import co.micol.prj.common.Command;

public class MemberLogout implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그아웃 처리.
		HttpSession session = request.getSession();
		session.invalidate();
		request.setAttribute("message", "정상적으로 로그아웃 되었다.");
		return "member/errorMessage";
	}

}
