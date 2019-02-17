package tk.snolin.entity;

import java.util.Set;

public class Jtfs {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int jtfsdm;
	private String jtfs;
	public int getJtfsdm() {
		return jtfsdm;
	}
	public void setJtfsdm(int jtfsdm) {
		this.jtfsdm = jtfsdm;
	}
	public String getJtfs() {
		return jtfs;
	}
	public void setJtfs(String jtfs) {
		this.jtfs = jtfs;
	}
	
}
