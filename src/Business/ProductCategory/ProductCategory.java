/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProductCategory;

/**
 *
 * @author Dell
 */
public class ProductCategory {
    private String productCategoryId ;
    private String categoryName;
    private static int counter = 1;

    public ProductCategory() {
        this.productCategoryId = "c00" + counter;
        ++counter;
    }
    
    

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
}
