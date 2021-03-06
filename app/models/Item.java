package models;

import play.*;
import play.db.jpa.*;
import javax.persistence.*;

import java.util.*;

@Entity
public class Item extends Model{
	protected final String title;
	protected final String creator;
	public Item(String title, String creator){
		if(title == null || title.isEmpty() || creator == null || creator.isEmpty()){
			throw new RuntimeException();
		}
		this.title = title;
		this.creator = creator;
	}
	
	public String getTitle(){
		return title;
	}

	public String getCreator()
	{
		return creator;
	}
}
