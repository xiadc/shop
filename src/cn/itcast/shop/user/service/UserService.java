package cn.itcast.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;

@Transactional
public class UserService {
	//注入userDao
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**按username查询用户
	 * @param username
	 * @return
	 */
	public User findByUsername(String username){
		return userDao.findByUsername(username);
	}
	
}
