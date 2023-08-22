package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.NoticeService;
import model_p.NoticeDAO;

public class NList2 implements NoticeService{
public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle", "공지사항");
		System.out.println("NList2.execute() 실행");
		
		request.setAttribute("mainData", new NoticeDAO().list());
		
	}
	
	
}


