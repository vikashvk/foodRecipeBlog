package com.cg.dao;

import java.util.List;

import com.cg.bean.Recipe;
import com.cg.bean.User;

public interface IFoodDao {

	public void addRecipe(Recipe recipe);

	public String deleteRecipe(Recipe recipe);

	public Recipe updateRecipe(Recipe recipe);

	public Recipe getRecipeById(int id);

	public List<Recipe> getAllRecipe();

	public void addUser(User user);

	public String deleteUser(User user);

	public List<String> getRecipebyName(String name);
	// U S E R

	public boolean loginUser(User user);

	public List<Recipe> getDropDownRecipe();

	public User updateUser(User user, Recipe recipe);
}
