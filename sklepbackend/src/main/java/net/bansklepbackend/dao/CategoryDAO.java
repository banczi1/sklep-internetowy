package net.bansklepbackend.dao;

import java.util.List;

import net.bansklepbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
	
	
}
