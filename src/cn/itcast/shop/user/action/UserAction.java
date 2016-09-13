package cn.itcast.shop.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialArray;

import org.apache.struts2.ServletActionContext;

import cn.itcast.shop.user.service.UserService;
import cn.itcast.shop.user.vo.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**User模块
 * @author xiadc
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	//模型驱动要使用的对象
	private User user = new User();
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	

	/**注册转页
	 * @return
	 */
	public String regist(){
		return "regist";
	}
	
	/**按用户名查找
	 * @return
	 * @throws IOException
	 */
	public String findByUsername() throws IOException{
		User existUser = userService.findByUsername(user.getUsername());
		HttpServletResponse resp = ServletActionContext.getResponse();
		resp.setContentType("text/html;charset=utf-8");
		boolean bool = true;
		if(existUser==null){
			//用户名不存在
			bool = false;
		}				
		resp.getWriter().print(bool);
		return NONE;
	}

	
}
