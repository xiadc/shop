package cn.itcast.shop.user.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.user.vo.User;

public class UserDao extends HibernateDaoSupport{

	/**按用户名查找
	 * @param username
	 * @return
	 */
	public User findByUsername(String username){
		String hql = "from User where username = ?";
		List<User> userList = this.getHibernateTemplate().find(hql,username);
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}
		return null;
		
	}
}
