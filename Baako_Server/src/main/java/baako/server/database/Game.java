package baako.server.database;

import java.util.Set;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import baako.server.dto.GameDTO;

@PersistenceCapable(detachable="true")
public class Game {

	@PrimaryKey
	private String name;
	
	
	private float price;
	private String description;
	private int PEGI;
	
	


	@Persistent(table= "GAME_CATEGORIES")
	@Join(column="GAME_ID")
	@Element(column="CATEGORY_ID")
	private Set<Category> categories;
	
	@Persistent(table= "GAME_DESIGNERS")
	@Join(column="GAME_ID")
	@Element(column="DESIGNER_ID")
	private Set<Designer> designers;
	
	/**
	 * 
	 */
	public Game(String name, float price, String description, int PEGI) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.PEGI = PEGI;
		this.categories = null;
		this.designers = null;
	}
	
	
	public Game(GameDTO game) {
		this.name = game.getName();
		this.price = game.getPrice();
		this.description = game.getDescription();
		this.PEGI = game.getPEGI();
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPEGI(int pEGI) {
		PEGI = pEGI;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the pEGI
	 */
	public int getPEGI() {
		return PEGI;
	}
	/**
	 * @return the categories
	 */
	public Set<Category> getCategories() {
		return categories;
	}
	/**
	 * @return the designers
	 */
	public Set<Designer> getDesigners() {
		return designers;
	}
	
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}


	/**
	 * @param designers the designers to set
	 */
	public void setDesigners(Set<Designer> designers) {
		this.designers = designers;
	}
	
	public void addDesigner(Designer designer){
		this.designers.add(designer);
	}
	
	public void addCategories(Category category){
		this.categories.add(category);
	}
	
	@Override
	public boolean equals(Object obj) {
		Game eq;
		if(obj instanceof Game)eq = (Game)obj; 
		else return false;
		if(!eq.getName().equals(name)) return false;
		else return true;
	}
	
	
}
