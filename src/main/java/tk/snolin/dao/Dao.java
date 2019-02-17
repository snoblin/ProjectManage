package tk.snolin.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate4.HibernateTemplate;

import tk.snolin.entity.BasicInfo;
import tk.snolin.entity.Bftj;
import tk.snolin.entity.Fzr;
import tk.snolin.entity.Jfly;
import tk.snolin.entity.Jtfs;
import tk.snolin.entity.Ktfx;
import tk.snolin.entity.Ktjb;
import tk.snolin.entity.Ktlb;
import tk.snolin.entity.Ktsx;
import tk.snolin.entity.Sbdw;
import tk.snolin.entity.User;
import tk.snolin.entity.Xkfl;

public class Dao {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public List<User> getAllUser() {
		List<User> userList= (List<User>) hibernateTemplate.find("from User");
		return userList;
	}
	public List<BasicInfo> getAllInfo() {
		List<BasicInfo> infoList= (List<BasicInfo>)hibernateTemplate.find("from BasicInfo");
		return infoList;
	}
	public int getPower(String username) {
		List<User> user = (List<User>) hibernateTemplate.find("from User where username = ?",username);
		return user.get(0).getPower();
	}
	public Ktfx getKtfx(String ktfx) {
		List<Ktfx> ktfxs = (List<Ktfx>) hibernateTemplate.find("from Ktfx where ktfx = ?",ktfx);
		if(ktfxs.isEmpty())
			return null;
		return ktfxs.get(0);
	}
	public Ktlb getKtlb(String ktlb) {
		List<Ktlb> ktlbs = (List<Ktlb>) hibernateTemplate.find("from Ktlb where ktlb = ?",ktlb);
		if(ktlbs.isEmpty())
			return null;
		return ktlbs.get(0);
	}
	public Ktsx getKtsx(String ktsx) {
		List<Ktsx> ktsxs = (List<Ktsx>) hibernateTemplate.find("from Ktsx where ktsx = ?",ktsx);
		if(ktsxs.isEmpty())
			return null;
		return ktsxs.get(0);
	}
	public Ktjb getKtjb(String ktjb) {
		List<Ktjb> ktjbs = (List<Ktjb>) hibernateTemplate.find("from Ktjb where ktjb = ?",ktjb);
		if(ktjbs.isEmpty())
			return null;
		return ktjbs.get(0);
	}
	public Xkfl getXkfl(String xkfl) {
		List<Xkfl> xkfls = (List<Xkfl>) hibernateTemplate.find("from Xkfl where xkfl = ?",xkfl);
		if(xkfls.isEmpty())
			return null;
		return xkfls.get(0);
	}
	public Sbdw getSbdw(String sbdw) {
		List<Sbdw> sbdws = (List<Sbdw>) hibernateTemplate.find("from Sbdw where sbdw = ?",sbdw);
		if(sbdws.isEmpty())
			return null;
		return sbdws.get(0);
	}
	public Fzr getFzr(String fzr) {
		List<Fzr> fzrs = (List<Fzr>) hibernateTemplate.find("from Fzr where fzrxm = ?",fzr);
		if(fzrs.isEmpty())
			return null;
		return fzrs.get(0);
	}
	public Jfly getJfly(String jfly) {
		List<Jfly> jflys = (List<Jfly>) hibernateTemplate.find("from Jfly where jfly = ?",jfly);
		if(jflys.isEmpty())
			return null;
		return jflys.get(0);
	}
	public Jtfs getJtfs(String jtfs) {
		List<Jtfs> jtfss = (List<Jtfs>) hibernateTemplate.find("from Jtfs where jtfs = ?",jtfs);
		if(jtfss.isEmpty())
			return null;
		return jtfss.get(0);
	}
	public Bftj getBftj(String bftj) {
		List<Bftj> bftjs = (List<Bftj>) hibernateTemplate.find("from Bftj where bftj = ?",bftj);
		if(bftjs.isEmpty())
			return null;
		return bftjs.get(0);
	}
	public void insert(Object obj) {
		hibernateTemplate.save(obj);
	}
	public Integer getMaxDm(String str) {
		List<Integer> obs = (List<Integer>) hibernateTemplate.find("select Max(" + 
					str.toLowerCase() + "dm" + ") from " + str);
		if(obs.isEmpty())
			return null;
		return obs.get(0);
	}
	public Integer getMaxGh() {
		List<Integer> fzrghs= (List<Integer>) hibernateTemplate.find("select Max(fzrgh) from Fzr");
		if(fzrghs.isEmpty())
			return null;
		return fzrghs.get(0);
	}
	public List<BasicInfo> selectByDate(Date date) {
		List<BasicInfo> BasicInfos= (List<BasicInfo>) hibernateTemplate.find("from BasicInfo where pzsj=?",date);
		if(BasicInfos.isEmpty())
			System.out.println("......................................");
		return BasicInfos;
	}
	public void update(BasicInfo obj) {
		BasicInfo basicInfo = hibernateTemplate.get(BasicInfo.class, obj.getProjectno());
		basicInfo.setBftj(obj.getBftj());
		basicInfo.setFzr(obj.getFzr());
		basicInfo.setJfly(obj.getJfly());
		basicInfo.setJtfs(obj.getJtfs());
		basicInfo.setKtfx(obj.getKtfx());
		basicInfo.setKtjb(obj.getKtjb());
		basicInfo.setKtlb(obj.getKtlb());
		basicInfo.setKtsx(obj.getKtsx());
		basicInfo.setMember1(obj.getMember1());
		basicInfo.setMember2(obj.getMember2());
		basicInfo.setMember3(obj.getMember3());
		basicInfo.setMember4(obj.getMember4());
		basicInfo.setMember5(obj.getMember5());
		basicInfo.setProjectname(obj.getProjectname());
		basicInfo.setProjectno(obj.getProjectno());
		basicInfo.setPzsj(obj.getPzsj());
		basicInfo.setSbdw(obj.getSbdw());
		basicInfo.setSflx(obj.getSflx());
		basicInfo.setSftj(obj.getSftj());
		basicInfo.setWcsj(obj.getWcsj());
		basicInfo.setXkfl(obj.getXkfl());
		basicInfo.setZjf(obj.getZjf());
	}
	public void delete(Object obj) {
		hibernateTemplate.delete(obj);
	}
	public List<BasicInfo> getAllInfoOrderBy(String jizhun, String fangshi) {
		List<BasicInfo> infos = (List<BasicInfo>) hibernateTemplate.find("from BasicInfo ORDER BY " + "" 
				+ jizhun +" " +fangshi);
		return infos;
	}
}
