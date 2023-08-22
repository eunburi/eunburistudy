package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.NoticeService;
import model_p.NoticeDAO;

public class NList implements NoticeService{

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("mainTitle", "공지사항");
		System.out.println("NList.execute() 실행");
		
		request.setAttribute("mainData", new NoticeDAO().list());
		
	}
	
	
}
