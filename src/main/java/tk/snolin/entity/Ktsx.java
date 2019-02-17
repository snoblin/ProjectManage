package tk.snolin.entity;

import java.util.Set;

public class Ktsx {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int ktsxdm;
	private String ktsx;
	public int getKtsxdm() {
		return ktsxdm;
	}
	public void setKtsxdm(int ktsxdm) {
		this.ktsxdm = ktsxdm;
	}
	public String getKtsx() {
		return ktsx;
	}
	public void setKtsx(String ktsx) {
		this.ktsx = ktsx;
	}
	
}
