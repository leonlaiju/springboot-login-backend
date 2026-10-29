package com.example.recipefinder.model; 
import jakarta.persistence.*; 
@Entity 
@Table(name="recipes") 
public class Recipe { 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	private String dishName; 
    private String category; 
 
    private String area; 
 
    private String image; 
 
    @Column(columnDefinition = "TEXT") 
    private String instructions; 
 
    public Recipe() { 
    } 
 
    public Recipe(Long id, String dishName, String category, 
                  String area, String image, String instructions) { 
 
        this.id = id; 
        this.dishName = dishName; 
        this.category = category; 
        this.area = area; 
        this.image = image; 
        this.instructions = instructions; 
    } 
 
    public Long getId() { 
        return id; 
    } 
 
    public void setId(Long id) { 
        this.id = id; 
    } 
 
    public String getDishName() { 
        return dishName; 
    } 
 
    public void setDishName(String dishName) { 
        this.dishName = dishName; 
    } 
 
    public String getCategory() { 
        return category; 
    } 
 
    public void setCategory(String category) { 
        this.category = category; 
    } 
 
    public String getArea() { 
        return area; 
    } 
 
    public void setArea(String area) { 
        this.area = area; 
    } 
 
    public String getImage() { 
        return image; 
    } 
 
    public void setImage(String image) { 
        this.image = image; 
    } 
 
    public String getInstructions() { 
        return instructions; 
    } 
 
    public void setInstructions(String instructions) { 
        this.instructions = instructions; 
    } 
}