package cn.gezhi.controller;

import cn.gezhi.po.Section;
import cn.gezhi.po.SectionExample;
import cn.gezhi.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Section")
public class SectionController {
    @Autowired
    private SectionService sectionService;

    //    新增部门页面
    @RequestMapping("/addSection")
    public String addSection() {
        return "addSection";
    }
    //    新增部门具体操作
    @RequestMapping("/add")
    public String addSection(Section section) {
        Integer sectionId = section.getSectionId();
        String sectionName = section.getSectionName();
        System.out.println("sectionId: " + sectionId);
        System.out.println("sectionName: " + sectionName);
        section.setSectionId(sectionId);
        section.setSectionName(sectionName);
        Section key = sectionService.selectByPrimaryKey(sectionId);
        if (key == null) {
            sectionService.insert(section);
        }
        return "forward:/Section/selectSectionAll";
    }

    //    部门列表
    @RequestMapping("/selectSectionAll")

    public String selectSectionAll(Model model, SectionExample example) {
        List<Section> list = sectionService.selectByExample(example);
        model.addAttribute("list",list);
        return "selectSection";
    }

    //    删除部门
    @RequestMapping(value = "/deleteSection")
    public String deleteSection(HttpServletRequest request) {
        String sectionId = request.getParameter("sectionId");
        int i = 0;
        if (sectionId != null) {
            i = Integer.parseInt(sectionId);
        }
        int n = sectionService.deleteByPrimaryKey(i);
        String rs;
        if (n > 0) {
            rs="forward:/Section/selectSectionAll";
            System.out.println("删除成功");
        } else {
            rs="";
            System.out.println("删除失败");
        }
        return rs;
    }

    //    修改部门
    @RequestMapping("/updateSection")
    public String updateSection(HttpServletRequest request, Model model) {
        String sectionId = request.getParameter("sectionId");
        int i = 0;
        if (sectionId != null) {
            i = Integer.parseInt(sectionId);
        }
        System.out.println(i);
        Section section = sectionService.selectByPrimaryKey(i);
        model.addAttribute("section", section);
        return "updateSection";
    }

    @RequestMapping("/mit")
    public String mit(Section section) {
        Integer sectionId = section.getSectionId();
        String sectionName = section.getSectionName();
        sectionService.updateByPrimaryKey(section);
        return "forward:/Section/selectSectionAll";
    }
}
