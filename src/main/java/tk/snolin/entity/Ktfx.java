package tk.snolin.entity;

import java.util.Set;

public class Ktfx {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int ktfxdm;
	private String ktfx;
	public int getKtfxdm() {
		return ktfxdm;
	}
	public void setKtfxdm(int ktfxdm) {
		this.ktfxdm = ktfxdm;
	}
	public String getKtfx() {
		return ktfx;
	}
	public void setKtfx(String ktfx) {
		this.ktfx = ktfx;
	}
	
}
