package cn.gezhi.controller;

import cn.gezhi.po.Position;
import cn.gezhi.po.PositionExample;
import cn.gezhi.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("Position")
public class PositionController {
    @Autowired
    private PositionService positionService;
    //    新增职位页面
    @RequestMapping("addPosition")
    public String addPosition(){
        return "addPosition";
    }
//    新增部门具体操作
    @RequestMapping("add")
    public String addPosition(Position position){
        Position key=positionService.selectByPrimaryKey(position.getPositionId());
        if (key==null){
            positionService.insert(position);
        }
        return "forward:/Position/selectPositionAll";
    }
    //    部门列表
    @RequestMapping("/selectPositionAll")
    public  String selectPositionAll(Model model, PositionExample example){
        List<Position> list=positionService.selectByExample(example);
        model.addAttribute("list",list);
        return "selectPosition";
    }
    //    删除部门
    @RequestMapping(value = "/deletePosition")
    public String deletePosition(HttpServletRequest request) {
        String positionId = request.getParameter("positionId");
        int i = 0;
        if (positionId != null) {
            i = Integer.parseInt(positionId);
        }
        int n = positionService.deleteByPrimaryKey(i);
        String rs;
        if (n > 0) {
            rs = "forward:/Position/selectPositionAll";
            System.out.println("删除成功");
        } else {
            rs = "";
            System.out.println("删除失败");
        }
        return rs;
    }
    //    修改部门
    @RequestMapping("/updatePosition")
    public String updatePosition(HttpServletRequest request, Model model) {
        String positionId = request.getParameter("positionId");
        int i = 0;
        if (positionId != null) {
            i = Integer.parseInt(positionId);
        }
        System.out.println(i);
        Position position = positionService.selectByPrimaryKey(i);
        model.addAttribute("position", position);
        return "updatePosition";
    }
    @RequestMapping("/mit")
    public String mit(Position position) {
        positionService.updateByPrimaryKeySelective(position);
        return "forward:/Position/selectPositionAll";
    }
}





