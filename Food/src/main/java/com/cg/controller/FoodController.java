package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.Admin;
import com.cg.bean.Recipe;

import com.cg.bean.User;
import com.cg.service.FoodService;

@Controller
public class FoodController {
	@Autowired
	FoodService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(path = "/Adminlogin", method = RequestMethod.GET)
	public String getStared(@ModelAttribute("admin") Admin admin) {
		return "admin_login";
	}

	@RequestMapping(path = "/Userlogin", method = RequestMethod.GET)
	public String getStared(@ModelAttribute("user") User user) {
		return "user_login";
	}

	@RequestMapping(path = "/homepage", method = RequestMethod.GET)
	public String goToHomePage() {
		return "admin_func";
	}

	@RequestMapping(path = "/operations", method = RequestMethod.POST)
	public ModelAndView auth(@ModelAttribute("admin") Admin admin) {

		ModelAndView mv = new ModelAndView();
		if (admin.getUsername().equals("admin") && admin.getPassword().equals("admin")) {
			mv.setViewName("admin_func");
		} else {
			mv.setViewName("admin_login");
			mv.addObject("flogini", "Wrong Username or Password");
			System.out.println("Wrong username and password");
		}

		return mv;

	}

	@RequestMapping(path = "/addRecipe", method = RequestMethod.GET)
	public ModelAndView auth(@ModelAttribute("fr") Recipe recipe) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addRecipe");
		return mv;

	}

	@RequestMapping(path = "getRecipeData", method = RequestMethod.POST)
	public ModelAndView addTrainee(@ModelAttribute("fr") Recipe recipe, BindingResult result) {

		ModelAndView mv = new ModelAndView();
		String res = service.addRecipe(recipe, result);

		mv.addObject("res", res);
		mv.setViewName("addRecipe");
		return mv;
	}

	@RequestMapping(path = "/deleteRecipe", method = RequestMethod.GET)
	public ModelAndView deleteRecipeById(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");

		return mv;

	}

	@RequestMapping(path = "deleteRecipe", method = RequestMethod.POST)
	public ModelAndView deleteRecipeId(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		String res = service.deleteRecipe(recipe);

		mv.addObject("res", res);
		mv.setViewName("delete");
		return mv;
	}

	@RequestMapping(path = "/modifyRecipe", method = RequestMethod.GET)
	public ModelAndView updateRecipe(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("modifyRecipe");

		return mv;

	}

	@RequestMapping(path = "modifyRecipe", method = RequestMethod.POST)
	public ModelAndView UpdateRecipeById(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		Recipe r = service.updateRecipe(recipe);

		mv.addObject("res", r);
		mv.setViewName("modifyRecipe");
		return mv;
	}

	@RequestMapping(path = "/getRecipeById", method = RequestMethod.GET)
	public ModelAndView getRecipeId(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("getRecipeById");

		return mv;

	}

	@RequestMapping(path = "getRecipeById", method = RequestMethod.POST)
	public ModelAndView getRecipeById(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		Recipe r = service.getRecipeById(recipe.getrId());
		if (r == null) {
			mv.addObject("res1", "INVALID RECIPE ID");
			mv.setViewName("getRecipeById");
		} else {
			mv.addObject("res", r);
			mv.setViewName("getRecipeById");
		}
		return mv;
	}

	@RequestMapping(path = "/getAllRecipies", method = RequestMethod.GET)
	public ModelAndView getAll() {

		ModelAndView mv = new ModelAndView();

		List<Recipe> list = new ArrayList<Recipe>();
		list = service.getAllRecipe();
		mv.addObject("rlist", list);

		mv.setViewName("getAllRecipies");
		return mv;

	}

// U S E R

	@RequestMapping(path = "/manageUsers", method = RequestMethod.GET)
	public ModelAndView manageUser(@ModelAttribute("user") User user) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("admin_user_func");
		return mv;

	}

	@RequestMapping(path = "/addUser", method = RequestMethod.GET)
	public ModelAndView addUser(@ModelAttribute("uk") User user) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("addUser");

		return mv;

	}

	@RequestMapping(path = "getuserData", method = RequestMethod.POST)
	public ModelAndView addTrainee(@ModelAttribute("uk") User user, BindingResult result) {

		ModelAndView mv = new ModelAndView();
		String res = service.addUser(user, result);

		mv.addObject("res", res);
		mv.setViewName("addUser");
		return mv;
	}

	@RequestMapping(path = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView deleteUserById(@ModelAttribute("uk") User user) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleteUsers");

		return mv;

	}

	@RequestMapping(path = "deleteUser", method = RequestMethod.POST)
	public ModelAndView deleteUserId(@ModelAttribute("uk") User user) {

		ModelAndView mv = new ModelAndView();
		String res = service.deleteUser(user);

		mv.addObject("res", res);
		mv.setViewName("deleteUsers");
		return mv;
	}

	@RequestMapping(path = "/serch", method = RequestMethod.GET)
	public ModelAndView searchRecipeByNAme(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("demo");

		return mv;

	}

// Search book by name

	@RequestMapping(path = "serch", method = RequestMethod.POST)
	public ModelAndView searchRecipe(@ModelAttribute("fr") Recipe recipe) {

		ModelAndView mv = new ModelAndView();
		List<String> res = service.getRecipebyName(recipe.getRecipeName());

		mv.addObject("res", res);
		mv.setViewName("demo");
		return mv;
	}

// U S E R

	@RequestMapping(path = "/userLogin", method = RequestMethod.GET)
	public ModelAndView userLoginPage(@ModelAttribute("user") User user) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("user_login");

		return mv;

	}

	@RequestMapping(path = "userLogin", method = RequestMethod.POST)
	public ModelAndView userLogin(@ModelAttribute("user") User user) {

		ModelAndView mv = new ModelAndView();
		boolean flag = service.loginUser(user);
		if (flag != true) {

			mv.addObject("Flogin", "Invalid User");
			mv.setViewName("user_login");

		}

		else {

			mv.setViewName("user_func");
		}
		return mv;
	}

	@RequestMapping(path = "/getRecipies", method = RequestMethod.GET)
	public ModelAndView gwtbookname(@ModelAttribute("uk") Recipe recipe, ModelMap map) {

		ModelAndView mv = new ModelAndView();
		List<Recipe> list = new ArrayList<Recipe>();
		list = service.getDropDownRecipe();
		mv.addObject("rlist", list);
		mv.setViewName("allRecipies");
		User u = new User();
		Recipe r = new Recipe();

		map.addAttribute("u", u);
		map.addAttribute("r", r);

		return mv;

	}

	@RequestMapping(path = "getRecipies", method = RequestMethod.POST)
	public ModelAndView getrecipebyName(@ModelAttribute("r") Recipe recipe, BindingResult result,
			@ModelAttribute("u") User user, BindingResult rest) {

		ModelAndView mv = new ModelAndView();
		List<Recipe> list = new ArrayList<Recipe>();
		list = service.getDropDownRecipe();
		mv.addObject("rlist", list);

		User u = service.updateUser(user, recipe);

		mv.addObject("User", u);

		mv.setViewName("allRecipies");
		return mv;
	}

}
