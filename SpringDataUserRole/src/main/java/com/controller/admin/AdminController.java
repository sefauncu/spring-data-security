package com.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.User;
import com.service.RoleService;
import com.service.UserService;

@Controller
@Secured( {"ROLE_ADMIN"} )
public class AdminController {
	
	private UserService userService;
	private RoleService roleService;
	
	@Autowired
	public AdminController(UserService userService, RoleService roleService) {
		this.userService = userService;
		this.roleService = roleService;
	}
	
	   @RequestMapping(value="/admin/userList")
	    public String userList(Model model) {
	        model.addAttribute("userList", userService.findAll());
	        return "userList";
}
	   

	    @RequestMapping(value="/admin/userAdd", method = RequestMethod.POST)
	    public String notesEdit(Model model, User user) {
	    	userService.addUser(user);
	        model.addAttribute("userList", userService.findAll());
	        return "userList";
	    }

	   @RequestMapping(value="/admin/userDelete/{id}", method = RequestMethod.GET)
	    public String notesDelete(Model model, @PathVariable(required = true, name = "id") int id) {
	    	userService.deleteUser(id);
	        model.addAttribute("userList", userService.findAll());
	        return "userList";
	    }

	    @RequestMapping(value={"/admin/userEdit","/admin/userEdit/{id}"}, method = RequestMethod.GET)
	    public String notesEditForm(Model model, @PathVariable(required = false, name = "id") Integer id) {
	        if (null!=id) {
	            model.addAttribute("user", userService.findOne(id));
	        } else {
	            model.addAttribute("user", new User());
	        }
	        return "addUser";
	    }

	   
	

}
