package cn.gezhi.service.Impl;

import cn.gezhi.mapper.SectionMapper;
import cn.gezhi.po.Section;
import cn.gezhi.po.SectionExample;
import cn.gezhi.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    private SectionMapper sectionMapper;
    /**
     * 新增一个部门
     *
     * @param section 部门对象
     * @return 受影响行数
     */
    @Override
    public int insert(Section section) {
        return sectionMapper.insert(section);
    }
    /**
     * 根据ID删除一个部门
     *
     * @param sectionId 部门编号
     * @return 受影响行数
     */
    @Override
    public int deleteByPrimaryKey(Integer sectionId) {
        return sectionMapper.deleteByPrimaryKey(sectionId);
    }
    /**
     * 查询所有的部门
     *
     * @param example 全部列
     * @return 部门集合
     */
    @Override
    public List<Section> selectByExample(SectionExample example) {
        return sectionMapper.selectByExample(example);
    }
    /**
     * 根据ID查询一个部门
     *
     * @param sectionId 部门编号
     * @return 部门对象
     */
    @Override
    public Section selectByPrimaryKey(Integer sectionId) {
        return sectionMapper.selectByPrimaryKey(sectionId);
    }
    /**
     * 有选择性的修改部门的休息,没有修改的信息保持不变
     *
     * @param section 部门对象
     * @return 受影响行数
     */
    @Override
    public int updateByPrimaryKeySelective(Section section) {
        return sectionMapper.updateByPrimaryKeySelective(section);
    }
    /**
     * 修改一个部门的信息,没有修改的信息默认为null;
     *
     * @param section 部门对象
     * @return 受影响行数
     */
    @Override
    public int updateByPrimaryKey(Section section) {
        return sectionMapper.updateByPrimaryKey(section);
    }
}
