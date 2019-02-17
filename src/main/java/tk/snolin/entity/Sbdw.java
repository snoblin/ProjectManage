package tk.snolin.entity;

import java.util.Set;

public class Sbdw {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int sbdwdm;
	private String sbdw;
	public int getSbdwdm() {
		return sbdwdm;
	}
	public void setSbdwdm(int sbdwdm) {
		this.sbdwdm = sbdwdm;
	}
	public String getSbdw() {
		return sbdw;
	}
	public void setSbdw(String sbdw) {
		this.sbdw = sbdw;
	}
	
}
