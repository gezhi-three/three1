package cn.gezhi.controller;

import cn.gezhi.po.Users;
import cn.gezhi.po.UsersExample;
import cn.gezhi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("Users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    //    新增用户页面
    @RequestMapping("/addUsers")
    public String addUsers() {
        return "addUsers";
    }

    //    新增用户具体操作
    @RequestMapping("/add")
    public String addUsers(Users users) {
        Users key = usersService.selectByPrimaryKey(users.getUsersId());
        if (key == null) {
            usersService.insert(users);
        }
        return "forward:/Users/selectUsersAll";
    }

    //    用户列表
    @RequestMapping("/selectUsersAll")
    public String selectUsersAll(Model model, UsersExample example) {
        List<Users> list = usersService.selectByExample(example);
        model.addAttribute("list", list);
        return "selectUsers";
    }

    //    删除用户
    @RequestMapping(value = "/deleteUsers")
    public String deleteUsers(HttpServletRequest request) {
        String usersId = request.getParameter("usersId");
        int i = 0;
        if (usersId != null) {
            i = Integer.parseInt(usersId);
        }
        int n = usersService.deleteByPrimaryKey(i);
        String rs;
        if (n > 0) {
            rs = "forward:/Users/selectUsersAll";
            System.out.println("删除成功");
        } else {
            rs = "";
            System.out.println("删除失败");
        }
        return rs;
    }
    //    修改部门
    @RequestMapping("/updateUsers")
    public String updateUsers(HttpServletRequest request, Model model) {
        String usersId = request.getParameter("usersId");
        int i = 0;
        if (usersId != null) {
            i = Integer.parseInt(usersId);
        }
        System.out.println(i);
        Users users = usersService.selectByPrimaryKey(i);
        model.addAttribute("users", users);
        return "updateUsers";
    }
    @RequestMapping("/mit")
    public String mit(Users users) {
        usersService.updateByPrimaryKeySelective(users);
        return "forward:/Users/selectUsersAll";
    }
}
