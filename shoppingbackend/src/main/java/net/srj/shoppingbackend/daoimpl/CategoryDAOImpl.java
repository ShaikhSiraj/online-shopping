package net.srj.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sr.shoppingbackend.dao.CategoryDAO;
import net.srj.shoppingbackend.dto.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO
{
	private static List<Category> categories =new ArrayList<>();
	
	static 
	{
		Category category=new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This Is Some Description for Television!!");
		category.setImageurl("CAT_1.png");
		
		categories.add(category);
		
		//second category
		
		category=new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This Is Some Description for Mobile!!");
		category.setImageurl("CAT_2.png");
		
		categories.add(category);
		
		//adding third category
		
		category=new Category();
		
		category.setId(3);
		category.setName("laptop");
		category.setDescription("This Is Some Description for laptop!!");
		category.setImageurl("CAT_3.png");
		
		categories.add(category);
		
		
	}
	
	
	@Override
	public List<Category> list() 
	{
		
		return categories;
	}


	@Override
	public Category get(int id)
	{
		// enhanced for loop
		
		for(Category category:categories)
		{
			if(category.getId()==id) return category;
		}
		return null;
	}

}
