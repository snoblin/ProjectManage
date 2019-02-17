package tk.snolin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import tk.snolin.entity.User;
import tk.snolin.service.Service;
/**
 * 用于处理用户登陆的Action
 * 备注：Session保存用户状态
 * @author I like Miku
 *
 */
public class LoginAction extends ActionSupport {
	private Service service;
	public void setService(Service service) {
		this.service = service;
	}
	public String execute() throws Exception {
		//使用ServletContextAction获取表单数据
		HttpServletRequest request = ServletActionContext.getRequest();
		//获取表单数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int power = service.getUserPower(username);
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setPower(power);
		if(service.loginCheck(username,password)) {
			HttpSession session = request.getSession();
			if(session.getAttribute("loginUser")==null) {
				session.setAttribute("loginUser", user);
			}else {
				session.removeAttribute("loginUser");
				session.setAttribute("loginUser", user);
			}
			return LOGIN;
		}else {
			return ERROR;
		}
	}
}
