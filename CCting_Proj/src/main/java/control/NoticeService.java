package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface NoticeService {
	
	//선언문만 들어와야함!
	void execute(HttpServletRequest request, HttpServletResponse response);
}
