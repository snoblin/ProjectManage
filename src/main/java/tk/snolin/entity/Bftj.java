package tk.snolin.entity;

import java.util.Set;

public class Bftj {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int bftjdm;
	private String bftj;
	public int getBftjdm() {
		return bftjdm;
	}
	public void setBftjdm(int bftjdm) {
		this.bftjdm = bftjdm;
	}
	public String getBftj() {
		return bftj;
	}
	public void setBftj(String bftj) {
		this.bftj = bftj;
	}
	
}
