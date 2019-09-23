/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProductCategory;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ProductCategoryList {
    
    private ArrayList<ProductCategory> categorytList;

    public ProductCategoryList(ArrayList<ProductCategory> categorytList) {
        categorytList = new ArrayList<ProductCategory>();
    }
    
    

    public ArrayList<ProductCategory> getCategorytList() {
        return categorytList;
    }

    public void setCategorytList(ArrayList<ProductCategory> categorytList) {
        this.categorytList = categorytList;
    }
    
    public ProductCategory createCategory(String categoryName){
        
        ProductCategory category = new ProductCategory();
        
        category.setCategoryName(categoryName);
        categorytList.add(category);
        return category;
        
    }
    
    public void removeCategory(String categoryId){
        
        ProductCategory category = null;
        for(ProductCategory cat:categorytList){
            if(cat != null && cat.getProductCategoryId() == categoryId){
                category = cat;
            }
        
        }
        if(category !=null){
            categorytList.remove(category);
        }
    
    }
    
}
