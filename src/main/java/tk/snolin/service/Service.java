package tk.snolin.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tk.snolin.dao.Dao;
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

@Transactional
public class Service {
	private Dao dao;
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	public Boolean loginCheck(String username,String password) {
		List<User> userList = dao.getAllUser();
		//遍历list
		for (User user : userList) {
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	public List<BasicInfo> getAllInfo() {
		List<BasicInfo> infoList = dao.getAllInfo();
		return infoList;
	}
	public int getUserPower(String username) {
		return dao.getPower(username);
	}
	public boolean isExist(String str1,String str) {
		switch(str1) {
			case "ktfx":
				return !(dao.getKtfx(str)==null||dao.getKtfx(str).equals(""));
			case "ktlb":
				return !(dao.getKtlb(str)==null||dao.getKtlb(str).equals(""));
			case "ktsx":
				return !(dao.getKtsx(str)==null||dao.getKtsx(str).equals(""));
			case "ktjb":
				return !(dao.getKtjb(str)==null||dao.getKtjb(str).equals(""));
			case "xkfl":
				return !(dao.getXkfl(str)==null||dao.getXkfl(str).equals(""));
			case "sbdw":
				return !(dao.getSbdw(str)==null||dao.getSbdw(str).equals(""));
			case "fzr":
				return !(dao.getFzr(str)==null||dao.getFzr(str).equals(""));
			case "jfly":
				return !(dao.getJfly(str)==null||dao.getJfly(str).equals(""));
			case "jtfs":
				return !(dao.getJtfs(str)==null||dao.getJtfs(str).equals(""));
			case "bftj":
				return !(dao.getBftj(str)==null||dao.getBftj(str).equals(""));
			default:
				return false;
		}
	}
	public Object getObject(String str1,String str) {
		switch(str1) {
			case "ktfx":
				return dao.getKtfx(str);
			case "ktlb":
				return dao.getKtlb(str);
			case "ktsx":
				return dao.getKtsx(str);
			case "ktjb":
				return dao.getKtjb(str);
			case "xkfl":
				return dao.getXkfl(str);
			case "sbdw":
				return dao.getSbdw(str);
			case "fzr":
				return dao.getFzr(str);
			case "jfly":
				return dao.getJfly(str);
			case "jtfs":
				return dao.getJtfs(str);
			case "bftj":
				return dao.getBftj(str);
			default:
				return false;
		}
	}
	public void insert(Object obj,Object obj1,Object obj2,Object obj3,Object obj4,Object obj5,Object obj6,
			Object obj7,Object obj8,Object obj9,Object obj10) {
		dao.insert(obj1);
		dao.insert(obj2);
		dao.insert(obj3);
		dao.insert(obj4);
		dao.insert(obj5);
		dao.insert(obj6);
		dao.insert(obj7);
		dao.insert(obj8);
		dao.insert(obj9);
		dao.insert(obj10);
		dao.insert(obj);
	}
	public Integer getMaxDm(String beanName) {
		return dao.getMaxDm(beanName);
	}
	public Integer getMaxGh() {
		return dao.getMaxGh();
	}
	public List<BasicInfo> selectByDate(String date) throws ParseException {
		Date da  = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		List<BasicInfo> basicinfos = dao.selectByDate(da);
		return basicinfos;
	}
	public void update(BasicInfo obj) {
		dao.update(obj);
	}
	public void save(Object obj) {
		dao.insert(obj);
	}
	public void delete(Object obj) {
		dao.delete(obj);
	}
	public List<BasicInfo> getAllInfoOrderBy(String jizhun, String fangshi) {
		List<BasicInfo> infos = dao.getAllInfoOrderBy(jizhun,fangshi);
		return infos;
	}
}
