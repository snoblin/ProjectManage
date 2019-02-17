package tk.snolin.entity;

import java.util.Set;

public class Xkfl {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int xkfldm;
	private String xkfl;
	public int getXkfldm() {
		return xkfldm;
	}
	public void setXkfldm(int xkfldm) {
		this.xkfldm = xkfldm;
	}
	public String getXkfl() {
		return xkfl;
	}
	public void setXkfl(String xkfl) {
		this.xkfl = xkfl;
	}
	
}
