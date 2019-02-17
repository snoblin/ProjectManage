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
 * 用于处理管理员删除项目的Action
 * @author I like Miku
 *
 */
public class ShengheDeleteAction extends ActionSupport {
	private Service service;
	public void setService(Service service) {
		this.service = service;
	}
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String ktfx= request.getParameter("text1");
		Ktfx ob1 = (Ktfx)service.getObject("ktfx", ktfx);
		String ktlb = request.getParameter("text2");
		Ktlb ob2 = (Ktlb) service.getObject("ktlb", ktlb);
		String ktsx = request.getParameter("text3");
		Ktsx ob3 = (Ktsx)service.getObject("ktsx", ktsx);
		String ktjb = request.getParameter("text4");
		Ktjb ob4 = (Ktjb) service.getObject("ktjb", ktjb);
		String xkfl = request.getParameter("text5");
		Xkfl ob5 =ob5 = (Xkfl) service.getObject("xkfl", xkfl);
		String sbdw = request.getParameter("text6");
		Sbdw ob6 = (Sbdw) service.getObject("sbdw", sbdw);
		String projectname = request.getParameter("text7");
		String fzr = request.getParameter("text8");
		Fzr ob7 =(Fzr) service.getObject("fzr", fzr);
		String jfly = request.getParameter("text9");
		Jfly ob8 = (Jfly) service.getObject("jfly", jfly);
		String projectno = request.getParameter("text10");
		String jtfs = request.getParameter("text11");
		Jtfs ob9 = (Jtfs) service.getObject("jtfs", jtfs);
		String bftj = request.getParameter("text12");
		Bftj ob10 = (Bftj) service.getObject("bftj", bftj);
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
		String sflx = request.getParameter("text22");
		int sflx1 = 0;
		if(sflx.equals("是")) {
			sflx1 = 0;
		}else if(sflx.equals("否")){
			sflx1 = 1;
		}
		int sftj1 = 0;
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
		service.delete(basicInfo);
		return SUCCESS;
	}
}
