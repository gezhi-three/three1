package cn.gezhi.mapper;

import cn.gezhi.po.Section;
import cn.gezhi.po.SectionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SectionMapper {
    /**
     *
     *
     */
    int countByExample(SectionExample example);

    /**
     *
     *
     */
    int deleteByExample(SectionExample example);

    /**
     * 根据ID删除一个部门
     *
     * @param sectionId 部门编号
     * @return 受影响行数
     */
    int deleteByPrimaryKey(Integer sectionId);

    /**
     * 新增一个部门
     *
     * @param record 部门对象
     * @return 受影响行数
     */
    int insert(Section record);

    /**
     *有选择性的增加部门信息,没有增加的为null
     * @param record 部门对象
     * @return 受影响行数
     */
    int insertSelective(Section record);

    /**
     * 查询所有的部门
     *
     * @param example 全部列
     * @return 部门集合
     */
    List<Section> selectByExample(SectionExample example);

    /**
     * 根据ID查询一个部门
     *
     * @param sectionId 部门编号
     * @return 部门对象
     */
    Section selectByPrimaryKey(Integer sectionId);

    /**
     *
     *
     */
    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

    /**
     *
     *
     */
    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);

    /**
     * 有选择性的修改部门的休息,没有修改的信息保持不变
     *
     * @param record 部门对象
     * @return 受影响行数
     */
    int updateByPrimaryKeySelective(Section record);

    /**
     * 修改一个部门的信息,没有修改的信息默认为null;
     *
     * @param record 部门对象
     * @return 受影响行数
     */
    int updateByPrimaryKey(Section record);
}