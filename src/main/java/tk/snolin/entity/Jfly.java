package tk.snolin.entity;

import java.util.Set;

public class Jfly {
	private Set<BasicInfo> BasicInfoSet;
	public Set<BasicInfo> getBasicInfoSet() {
		return BasicInfoSet;
	}
	public void setBasicInfoSet(Set<BasicInfo> basicInfoSet) {
		BasicInfoSet = basicInfoSet;
	}
	private int jflydm;
	private String jfly;
	public int getJflydm() {
		return jflydm;
	}
	public void setJflydm(int jflydm) {
		this.jflydm = jflydm;
	}
	public String getJfly() {
		return jfly;
	}
	public void setJfly(String jfly) {
		this.jfly = jfly;
	}
	
}
