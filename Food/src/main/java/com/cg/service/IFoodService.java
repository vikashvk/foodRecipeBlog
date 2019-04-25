package com.cg.service;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.cg.bean.Recipe;
import com.cg.bean.User;

public interface IFoodService {

	public String addRecipe(Recipe recipe, BindingResult result);

	public String deleteRecipe(Recipe recipe);

	public Recipe updateRecipe(Recipe recipe);

	public Recipe getRecipeById(int id);

	public List<Recipe> getAllRecipe();

	public String addUser(User user, BindingResult result);

	public String deleteUser(User user);

	public List<String> getRecipebyName(String name);

	// U S E R

	public boolean loginUser(User user);

	public List<Recipe> getDropDownRecipe();

	public User updateUser(User user, Recipe recipe);
}
