package tk.snolin.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

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
import tk.snolin.entity.Xkfl;
import tk.snolin.service.Service;
/**
 * 用于处理管理员修改、审核项目的Action
 * 备注：管理员不能修改“是否提交”属性
 * @author I like Miku
 *
 */
public class ShengheUpdateAction extends ActionSupport {
	private Service service;
	public void setService(Service service) {
		this.service = service;
	}
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String ktfx= request.getParameter("text1");
		Ktfx ob1 = new Ktfx();
		if(service.isExist("ktfx", ktfx)){
			ob1 = (Ktfx)service.getObject("ktfx", ktfx);
		}else{
			int dm =service.getMaxDm("Ktfx") + 1;
			ob1.setKtfxdm(dm);
			ob1.setKtfx(ktfx);
			service.save(ob1);
		}
		String ktlb = request.getParameter("text2");
		Ktlb ob2 = new Ktlb();
		if(service.isExist("ktlb", ktlb)){
			ob2 = (Ktlb) service.getObject("ktlb", ktlb);
		}else{
			int dm = service.getMaxDm("Ktlb") + 100;
			ob2.setKtlbdm(dm);
			ob2.setKtlb(ktlb);
			service.save(ob2);
		}
		String ktsx = request.getParameter("text3");
		Ktsx ob3 = new Ktsx();
		if(service.isExist("ktsx", ktsx)){
			ob3 = (Ktsx)service.getObject("ktsx", ktsx);
		}else{
			int dm = service.getMaxDm("Ktsx") + 1;
			ob3.setKtsxdm(dm);
			ob3.setKtsx(ktsx);
			service.save(ob3);
		}
		String ktjb = request.getParameter("text4");
		Ktjb ob4 = new Ktjb();
		if(service.isExist("ktjb", ktjb)){
			ob4 = (Ktjb) service.getObject("ktjb", ktjb);
		}else{
			int dm = service.getMaxDm("Ktjb") + 1;
			ob4.setKtjbdm(dm);
			ob4.setKtjb(ktjb);
			service.save(ob4);
		}
		String xkfl = request.getParameter("text5");
		Xkfl ob5 = new Xkfl();
		if(service.isExist("xkfl", xkfl)){
			ob5 = (Xkfl) service.getObject("xkfl", xkfl);
		}else{
			int dm = service.getMaxDm("Xkfl") + 10;
			ob5.setXkfldm(dm);
			ob5.setXkfl(xkfl);
			service.save(ob5);
		}
		String sbdw = request.getParameter("text6");
		Sbdw ob6 = new Sbdw();
		if(service.isExist("sbdw", sbdw)){
			ob6 = (Sbdw) service.getObject("sbdw", sbdw);
		}else{
			int dm = service.getMaxDm("Sbdw") + 1;
			ob6.setSbdwdm(dm);
			ob6.setSbdw(sbdw);
			service.save(ob6);
		}
		String projectname = request.getParameter("text7");
		String fzr = request.getParameter("text8");
		Fzr ob7 = new Fzr();
		if(service.isExist("fzr", fzr)){
			ob7 = (Fzr) service.getObject("fzr", fzr);
		}else{
			int dm = service.getMaxGh() + 1;
			ob7.setFzrgh(dm);
			ob7.setFzrxm(fzr);
			service.save(ob7);
		}
		String jfly = request.getParameter("text9");
		Jfly ob8 = new Jfly();
		if(service.isExist("jfly", jfly)){
			ob8 = (Jfly) service.getObject("jfly", jfly);
		}else{
			int dm = service.getMaxDm("Jfly") + 1;
			ob8.setJflydm(dm);
			ob8.setJfly(jfly);
			service.save(ob8);
		}
		String projectno = request.getParameter("text10");
		String jtfs = request.getParameter("text11");
		Jtfs ob9 = new Jtfs();
		if(service.isExist("jtfs", jtfs)){
			ob9 = (Jtfs) service.getObject("jtfs", jtfs);
		}else{
			int dm = service.getMaxDm("Jtfs") + 1;
			ob9.setJtfsdm(dm);
			ob9.setJtfs(jtfs);
			service.save(ob9);
		}
		String bftj = request.getParameter("text12");
		Bftj ob10 = new Bftj();
		if(service.isExist("bftj", bftj)){
			ob10 = (Bftj) service.getObject("bftj", bftj);
		}else{
			int dm = service.getMaxDm("Bftj") + 1;
			ob10.setBftjdm(dm);
			ob10.setBftj(bftj);
			service.save(ob10);
		}
		String pzsj = request.getParameter("text13");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(pzsj);
		String wcsj = request.getParameter("text14");
		Date date2 = sdf.parse(wcsj);
		String zjf = request.getParameter("text15");
		String member1 = request.getParameter("text16");
		String member2 = request.getParameter("text17");
		String member3 = request.getParameter("text18");
		String member4 = request.getParameter("text19");
		String member5 = request.getParameter("text20");
		//是否提交默认是“0”
		int sftj1 = 0;
		String sflx = request.getParameter("text22");
		int sflx1 = 0;
		if(sflx.equals("是")) {
			sflx1 = 0;
		}else if(sflx.equals("否")){
			sflx1 = 1;
		}
		
		BasicInfo basicInfo = new BasicInfo();
		basicInfo.setBftj(ob10);
		basicInfo.setFzr(ob7);
		basicInfo.setJfly(ob8);
		basicInfo.setJtfs(ob9);
		basicInfo.setKtfx(ob1);
		basicInfo.setKtjb(ob4);
		basicInfo.setKtlb(ob2);
		basicInfo.setKtsx(ob3);
		basicInfo.setMember1(member1);
		basicInfo.setMember2(member2);
		basicInfo.setMember3(member3);
		basicInfo.setMember4(member4);
		basicInfo.setMember5(member5);
		basicInfo.setProjectname(projectname);
		basicInfo.setProjectno(projectno);
		basicInfo.setPzsj(date1);
		basicInfo.setSbdw(ob6);
		basicInfo.setSflx(sflx1);
		basicInfo.setSftj(sftj1);
		basicInfo.setWcsj(date2);
		basicInfo.setXkfl(ob5);
		basicInfo.setZjf(Integer.parseInt(zjf));
		service.update(basicInfo);
		return SUCCESS;
	}
}
