package com.go2plus.core.userCenter.dao;

import java.util.HashMap;
import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Repository;

import com.go2plus.common.mvc.DAO;
import com.go2plus.core.userCenter.vo.User;

@Repository
public interface UserDao extends DAO {
  
  /**
   * 插入用户
   * @param user
   * @return
   */
  int insertUser(User user);
  
 
  User findUser(User user);
  /**
   * 修改用户手机
   * 
   * @param user
   */
  void updateUserMobile(User user);

  /**
   * 根据id删除一条数据 state=-1
   * 
   * @param user
   */
  void deleteUser(int userId);
  /**
   * 
   * 更新用户密码
   * 
   * @param user
   */
  void updateUserPassword(User user);
  
  /**
   * 登录更新用户信息
   * @param user
   */
  int updateUser(User user);

  /**
   * 根据id查找厂家认证状态
   * 
   * @param userId
   * @return String
   */
  String findSupplierCertifiedTypeById(int userId);

  /**
   * 查找用户完整信息
   * 
   * @param userId
   * @return
   */
  // 一对一关系
  User findFullUserInfo(int userId);

  /**
   * 根据产品id与lable_id更改产品标签
   * 
   * @param pid
   *          产品id
   * @param lableId
   *          标签id
   * @return null
   */
  void updateLable(HashMap<String, Object> map);

  /**
   * 根据id查找厂家最近一周发布新款数量
   * 
   * @param userId
   * @return integer
   */
  int findWeekPublishById(int userId);

  
  /**
   * 根据request传过来的URL查找对应用户id
   * 
   * @param shopUrl
   * @return userId
   */
  public int queryUserIdByUrl(String shopUrl);
  
  /**
   * 查询用户
   * @param userName
   * @return
   */
  public User findUserNameByUserName(@Param("userName") String userName);
  
  
  /**
   * 查询电话是否存在
   * @param mobile
   * @return
   */
  public User findMobileByMobile(@Param("mobile") String mobile);
  
  
  /**
   * 查找邮箱地址是否存在
   * @param email
   * @return
   */
  public String findEmailByEmail(@Param("email") String email);
  
  
  /**
   * 验证厂家用户名
   * @param table
   * @param title
   * @return
   */
  public String findTitleByTitle(@Param("table") String table,@Param("title") String title);
  
  /**
   * 根据userId查询邮箱
   * @param userId
   * @return
   */
  public String findEmailByUserId(@Param("userId") int userId);
  
  
}
