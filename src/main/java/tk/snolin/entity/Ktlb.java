package tk.snolin.entity;

import java.util.Set;

public class Ktlb {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int ktlbdm;
	private String ktlb;
	public int getKtlbdm() {
		return ktlbdm;
	}
	public void setKtlbdm(int ktlbdm) {
		this.ktlbdm = ktlbdm;
	}
	public String getKtlb() {
		return ktlb;
	}
	public void setKtlb(String ktlb) {
		this.ktlb = ktlb;
	}
	
}
