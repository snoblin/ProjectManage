package tk.snolin.entity;

import java.util.Set;

public class Fzr {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int fzrgh;
	private String fzrxm;
	public int getFzrgh() {
		return fzrgh;
	}
	public void setFzrgh(int fzrgh) {
		this.fzrgh = fzrgh;
	}
	public String getFzrxm() {
		return fzrxm;
	}
	public void setFzrxm(String fzrxm) {
		this.fzrxm = fzrxm;
	}
	
}
