package com.xworkz.db.dto;

public class FestivalDTO {
	
	private int fid;
	private String fname;
	private String fdate;
	private String fstate;
	
	public FestivalDTO() {
		
	}
	
	public FestivalDTO(int fid, String fname, String fdate, String fstate) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fdate = fdate;
		this.fstate = fstate;
	}

	@Override
	public String toString() {
		return "FestivalDTO [fid=" + fid + ", fname=" + fname + ", fdate=" + fdate + ", fstate=" + fstate + "]";
	}
	public int getFid() {
		return fid;
	}

	public String getFname() {
		return fname;
	}

	public String getFdate() {
		return fdate;
	}

	public String getFstate() {
		return fstate;
	}

	
	
	
	

	
}
