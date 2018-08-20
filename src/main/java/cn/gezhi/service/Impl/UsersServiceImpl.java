package cn.gezhi.service.Impl;

import cn.gezhi.mapper.UsersMapper;
import cn.gezhi.po.Users;
import cn.gezhi.po.UsersExample;
import cn.gezhi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    /**
     * 根据ID删除一个用户
     *
     * @param usersId 用户编号
     * @return 受影响行数
     */
    @Override
    public int deleteByPrimaryKey(Integer usersId) {
        return usersMapper.deleteByPrimaryKey(usersId);
    }

    /**
     * 新增一个用户
     *
     * @param record 用户对象
     * @return 受影响行数
     */
    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    /**
     * 有选择性的增加部门信息,没有增加的为null
     *
     * @param record 用户对象
     * @return 受影响行数
     */
    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    /**
     * 查询所有的用户
     *
     * @param example 全部列
     * @return 用户集合
     */
    @Override
    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    /**
     * 根据ID查询一个用户
     *
     * @param usersId 用户编号
     * @return 用户对象
     */
    @Override
    public Users selectByPrimaryKey(Integer usersId) {
        return usersMapper.selectByPrimaryKey(usersId);
    }

    /**
     * 有选择性的修改用户的休息,没有修改的信息保持不变
     *
     * @param record 用户对象
     * @return 受影响行数
     */
    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 修改一个用户的信息,没有修改的信息默认为null;
     *
     * @param record 用户对象
     * @return 受影响行数
     */
    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }
}
