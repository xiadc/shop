package cn.itcast.shop.index.action;

import com.opensymphony.xwork2.ActionSupport;

/**首页转向到WEB-INF/index.jsp
 * @author xiadc
 *
 */
public class IndexAction extends ActionSupport{


	public String execute()  {
		return "index";
	}
}
