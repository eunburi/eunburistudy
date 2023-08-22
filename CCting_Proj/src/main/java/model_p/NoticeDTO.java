package model_p;

import java.util.Date;

public class NoticeDTO {

	String ntitle,ncontent,nreg_date,nupfile1,nupfile2;

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNreg_date() {
		return nreg_date;
	}

	public void setNreg_date(String nreg_date) {
		this.nreg_date = nreg_date;
	}

	public String getNupfile1() {
		return nupfile1;
	}

	public void setNupfile1(String nupfile1) {
		this.nupfile1 = nupfile1;
	}

	public String getNupfile2() {
		return nupfile2;
	}

	public void setNupfile2(String nupfile2) {
		this.nupfile2 = nupfile2;
	}

	@Override
	public String toString() {
		return "NoticeDTO [ntitle=" + ntitle + ", ncontent=" + ncontent + ", nreg_date=" + nreg_date + ", nupfile1="
				+ nupfile1 + ", nupfile2=" + nupfile2 + "]";
	}

	

	
	
	
	
}
