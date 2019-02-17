package tk.snolin.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import tk.snolin.entity.BasicInfo;
import tk.snolin.entity.TrueBasicInfo;
import tk.snolin.service.Service;
/**
 * 用于查询跳转普通用户进行修改、删除页面的Action
 * 备注：可以查到未提交的项目
 * @author I like Miku
 *
 */
public class UpdateOrDeleteAction extends ActionSupport{
	private Service service;
	public void setService(Service service) {
		this.service = service;
	}
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String date = request.getParameter("date");
		List<BasicInfo> basicinfos =  service.selectByDate(date);
		List<TrueBasicInfo> truebasicinfos = new ArrayList<TrueBasicInfo>();
		for (BasicInfo basicInfo : basicinfos) {
			TrueBasicInfo info = new TrueBasicInfo();
			info.setProjectno(basicInfo.getProjectno());
			info.setProjectname(basicInfo.getProjectname());
			info.setFzr(basicInfo.getFzr().getFzrxm());
			info.setKtjb(basicInfo.getKtjb().getKtjb());
			info.setKtsx(basicInfo.getKtsx().getKtsx());
			info.setKtlb(basicInfo.getKtlb().getKtlb()); 
			info.setKtfx(basicInfo.getKtfx().getKtfx()); 
			info.setXkfl(basicInfo.getXkfl().getXkfl()); 
			info.setJtfs(basicInfo.getJtfs().getJtfs());
			info.setSbdw(basicInfo.getSbdw().getSbdw());
			info.setJfly(basicInfo.getJfly().getJfly());
			info.setBftj(basicInfo.getBftj().getBftj());
			if(basicInfo.getPzsj()==null||basicInfo.getPzsj().equals("")){
				info.setPzsj("");
			}else{
				info.setPzsj(basicInfo.getPzsj().toString());
			}
			if(basicInfo.getWcsj()==null||basicInfo.getWcsj().equals("")){
				info.setWcsj("");
			}else{
				info.setWcsj(basicInfo.getWcsj().toString());
			}	
			info.setZjf(basicInfo.getZjf() + "");
			info.setMember1(basicInfo.getMember1());
			info.setMember2(basicInfo.getMember2());
			info.setMember3(basicInfo.getMember3());
			info.setMember4(basicInfo.getMember4());
			info.setMember5(basicInfo.getMember5());
			if(basicInfo.getSftj()==0) {
				info.setSftj("是");
			}else {
				info.setSftj("否");
			}
			if(basicInfo.getSflx()==0) {
				info.setSflx("是");
			}else {
				info.setSflx("否");
			}
			truebasicinfos.add(info);
		}
		HttpSession session = request.getSession();
		if(session.getAttribute("infoList2")==null) {
			session.setAttribute("infoList2", truebasicinfos);
		}else {
			session.removeAttribute("infoList2");
			session.setAttribute("infoList2", truebasicinfos);
		}
		return SUCCESS;
	}
}
