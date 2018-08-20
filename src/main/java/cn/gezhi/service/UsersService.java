package cn.gezhi.service;

import cn.gezhi.po.Users;
import cn.gezhi.po.UsersExample;

import java.util.List;

public interface UsersService {
    //      根据ID删除一个用户
    int deleteByPrimaryKey(Integer usersId);

    //      新增一个用户
    int insert(Users record);

    //     有选择性的增加部门信息,没有增加的为null
    int insertSelective(Users record);

    //      查询所有的用户
    List<Users> selectByExample(UsersExample example);

    //      根据ID查询一个用户
    Users selectByPrimaryKey(Integer usersId);

    //      有选择性的修改用户的休息,没有修改的信息保持不变
    int updateByPrimaryKeySelective(Users record);

    //      修改一个用户的信息,没有修改的信息默认为null;
    int updateByPrimaryKey(Users record);
}
