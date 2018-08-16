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
public class SectionController {
    @Autowired
    private SectionService sectionService;

    //    新增部门
    @RequestMapping("/addSection_S")
    public String addSection(HttpServletRequest request) {
        int sectionId = Integer.parseInt(request.getParameter("sectionId"));
        System.out.println(sectionId);
        String sectionName = request.getParameter("sectionName");
        System.out.println(sectionName);
        return "addjob";
    }

    //    部门列表
    @RequestMapping("/selectSectionAll_S")
    public String selectSectionAll(Model model, SectionExample example) {
        List<Section> list = sectionService.selectByExample(example);
        model.addAttribute("model", model);
        return "selectSection";
    }

    //    删除部门
    @RequestMapping(value = "/delete_department")
    public String delete_department(HttpServletRequest request) {
        int sectionId = Integer.parseInt(request.getParameter("sectionId"));
        int n = sectionService.deleteByPrimaryKey(sectionId);
        if (n > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        return "";
    }

    //    查询部门
    @RequestMapping("/update_department")
    public String update_department(HttpServletRequest request, Model model) {
        int i = Integer.parseInt(request.getParameter("sectionId"));
        System.out.println(i);
        Section section = sectionService.selectByPrimaryKey(i);
        model.addAttribute("section", section);
        return "updatedepartment";

    }
}
