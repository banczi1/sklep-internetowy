package net.bansklepbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.bansklepbackend.dao.CategoryDAO;
import net.bansklepbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		//dodawanie 1ej kategorii
		category.setId(1);
		category.setName("Lakiery");
		category.setDescription("");
		category.setImageURL("");
		
		categories.add(category);
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		for(Category category : categories)
		{
			if(category.getId()== id) return category;
		}
		return null;
	}

}
