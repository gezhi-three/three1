package cn.gezhi.service;

import cn.gezhi.po.Section;
import cn.gezhi.po.SectionExample;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SectionService {
    //    新增部门
    int insert(Section section);

    //    根据ID删除一个部门
    int deleteByPrimaryKey(Integer sectionId);

    //    部门列表
    List<Section> selectByExample(SectionExample example);

    //    根据ID查询一个部门
    Section selectByPrimaryKey(Integer sectionId);

    //    有选择性的修改部门的休息,没有修改的信息保持不变
    int updateByPrimaryKeySelective(Section section);

    //    修改一个部门的信息,没有修改的信息默认为null;
    int updateByPrimaryKey(Section section);
}
