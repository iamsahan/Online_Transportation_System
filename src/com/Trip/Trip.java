package com.Trip;

public class Trip {

	private int tiD;
	private String pick;
	private String drop;
	private String vtype;
	private String umail;
	
	
	public Trip(int tiD, String pick, String drop, String vtype, String umail) {
		this.tiD = tiD;
		this.pick = pick;
		this.drop = drop;
		this.vtype = vtype;
		this.umail = umail;
	}
	
	public Trip(String pick, String drop, String vtype, String umail) {
		this.pick = pick;
		this.drop = drop;
		this.vtype = vtype;
		this.umail = umail;
	}


	public int getTiD() {
		return tiD;
	}

	public String getPick() {
		return pick;
	}


	public String getDrop() {
		return drop;
	}


	public String getVtype() {
		return vtype;
	}


	public String getUmail() {
		return umail;
	}

	
	
}
