package text_08.util.Service;

import java.sql.Connection;


import text_08.util.Dao.MemberDao;
import text_08.util.dto.Member;

public class MemberService {
	private MemberDao memberDao;

	public MemberService(Connection conn) {
		memberDao = new MemberDao(conn);
	}

	public boolean isLoginIdDup(String loginId) {
		return memberDao.isLoginIdDup(loginId);
	}

	public int join(String loginId, String loginPw, String name) {
		return memberDao.join(loginId,loginPw,name);
		
	}

	public Member getMemberByLogin(String loginId) {
		return memberDao.getMemberByLogin(loginId);
	}

	

}
