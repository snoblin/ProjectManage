package tk.snolin.entity;

import java.util.Set;

public class Ktjb {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int ktjbdm;
	private String ktjb;
	public int getKtjbdm() {
		return ktjbdm;
	}
	public void setKtjbdm(int ktjbdm) {
		this.ktjbdm = ktjbdm;
	}
	public String getKtjb() {
		return ktjb;
	}
	public void setKtjb(String ktjb) {
		this.ktjb = ktjb;
	}
	
}
