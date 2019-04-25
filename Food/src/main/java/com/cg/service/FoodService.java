package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;

import com.cg.bean.Recipe;
import com.cg.bean.User;
import com.cg.dao.IFoodDao;

public class FoodService implements IFoodService {
	@Autowired
	IFoodDao dao;

	public FoodService(IFoodDao dao) {
		super();
		this.dao = dao;
	}

	public IFoodDao getDao() {
		return dao;
	}

	public void setDao(IFoodDao dao) {
		this.dao = dao;
	}

	@Override
	public String addRecipe(Recipe recipe, BindingResult result) {
		// TODO Auto-generated method stub
		if (result.hasErrors()) {
			return "Error";
		}
		dao.addRecipe(recipe);
		return "S U C C E S S";
	}

	@Override
	public String deleteRecipe(Recipe recipe) {
		// TODO Auto-generated method stub

		return dao.deleteRecipe(recipe);
	}

	@Override
	public Recipe updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return dao.updateRecipe(recipe);
	}

	@Override
	public Recipe getRecipeById(int id) {
		// TODO Auto-generated method stub
		return dao.getRecipeById(id);
	}

	@Override
	public List<Recipe> getAllRecipe() {
		// TODO Auto-generated method stub
		return dao.getAllRecipe();
	}

	@Override
	public String addUser(User user, BindingResult result) {
		// TODO Auto-generated method stub
		if (result.hasErrors()) {
			return "Error";
		}
		dao.addUser(user);
		return "S U C C E S S";
	}

	@Override
	public String deleteUser(User user) {
		// TODO Auto-generated method stub
		return dao.deleteUser(user);
	}

	@Override
	public boolean loginUser(User user) {
		// TODO Auto-generated method stub
		return dao.loginUser(user);
	}

	@Override
	public List<String> getRecipebyName(String name) {
		// TODO Auto-generated method stub
		return dao.getRecipebyName(name);
	}

	@Override
	public List<Recipe> getDropDownRecipe() {
		// TODO Auto-generated method stub
		return dao.getDropDownRecipe();
	}

	@Override
	public User updateUser(User user, Recipe recipe) {
		// TODO Auto-generated method stub
		return dao.updateUser(user, recipe);
	}

}
