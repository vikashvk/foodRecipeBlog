package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.cg.bean.Recipe;
import com.cg.bean.User;

@Transactional
public class FoodDao implements IFoodDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		em.persist(recipe);

	}

	@Override
	public String deleteRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		Recipe b = em.find(Recipe.class, recipe.getrId());
		em.remove(b);
		return "D E L E T E";
	}

	@Override
	public Recipe updateRecipe(Recipe recipe) {
		Recipe r = em.find(Recipe.class, recipe.getrId());
		r.setCuisine(recipe.getCuisine());
		r.setRecipeName(recipe.getRecipeName());
		r.setPrepareTime(recipe.getPrepareTime());
		r.setVeg(recipe.isVeg());

		em.persist(r);
		return r;
	}

	@Override
	public Recipe getRecipeById(int id) {
		Recipe r = em.find(Recipe.class, id);
		if (r != null) {
			return r;
		} else
			return null;
		// return null;
	}

	@Override
	public List<Recipe> getAllRecipe() {
		List<Recipe> recipeList = em.createQuery("SELECT r FROM Recipe r").getResultList();

		if (recipeList == null) {
			return null;
		} else

			return recipeList;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		em.persist(user);

	}

	@Override
	public String deleteUser(User user) {
		// TODO Auto-generated method stub
		User u = em.find(User.class, user.getUsername());
		em.remove(u);
		return "D E L E T E D";
	}

	@Override
	public boolean loginUser(User user) {
		// TODO Auto-generated method stub
		User ux = em.find(User.class, user.getUsername());
		if (ux == null)
			return false;
		if (ux.getUsername().equals(user.getUsername()) && ux.getPassword().equals(user.getPassword())) {
			return true;
		}

		else
			return false;

	}

	@Override
	public List<String> getRecipebyName(String name) {
		// TODO Auto-generated method stub
		String query = "select b.recipeName from Recipe r where r.recipeName = " + name;
		List<String> recipeName = em.createQuery(query).getResultList();
		return recipeName;
	}

	@Override
	public List<Recipe> getDropDownRecipe() {
		List<Recipe> recipeList = em.createQuery("SELECT r.recipeName FROM Recipe r").getResultList();

		if (recipeList == null) {
			return null;
		} else

			return recipeList;
	}

	@Override
	public User updateUser(User user, Recipe recipe) {
		User u = em.find(User.class, user.getUsername());
		em.persist(u);
		return u;
	}

}
