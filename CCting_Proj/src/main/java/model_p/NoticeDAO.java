package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.jsp.tagext.PageData;
import javax.sql.DataSource;

public class NoticeDAO {
	
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public NoticeDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:/comp/env/ccting");
			con = ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<NoticeDTO> list(){
		
		sql = "select * from notice order by nreg_date desc"; 
		ArrayList<NoticeDTO> res = new ArrayList<>();
		
		try {
				ptmt = con.prepareStatement(sql);
				rs = ptmt.executeQuery();
			
			while(rs.next()) {
				NoticeDTO dto = new NoticeDTO();
				dto.setNcontent(rs.getString("ncontent"));
				dto.setNreg_date(rs.getString("nreg_date"));
				dto.setNtitle(rs.getString("ntitle"));
				dto.setNupfile1(rs.getString("nupfile1"));
				dto.setNupfile2(rs.getString("nupfile2"));
				
				res.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return res;
	}	
	
	
	public void close() {
		if(rs != null) try {rs.close(); } catch(Exception e) {}
		if(ptmt != null) try {ptmt.close(); } catch(Exception e) {}
		if(con != null) try {con.close(); } catch(Exception e) {}
	}
	
}
