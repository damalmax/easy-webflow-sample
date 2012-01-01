package easywebflow.sample.model;
// Generated 2012-01-01 22:49:53 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FeatureValueId generated by hbm2java
 */
@Embeddable
public class FeatureValueId  implements java.io.Serializable {


     private int prodIdProduct;
     private int catfeatIdCategory;
     private int catfeatIdCategoryFeature;

    public FeatureValueId() {
    }

    public FeatureValueId(int prodIdProduct, int catfeatIdCategory, int catfeatIdCategoryFeature) {
       this.prodIdProduct = prodIdProduct;
       this.catfeatIdCategory = catfeatIdCategory;
       this.catfeatIdCategoryFeature = catfeatIdCategoryFeature;
    }
   


    @Column(name="PROD_idPRODUCT", nullable=false)
    public int getProdIdProduct() {
        return this.prodIdProduct;
    }
    
    public void setProdIdProduct(int prodIdProduct) {
        this.prodIdProduct = prodIdProduct;
    }


    @Column(name="CATFEAT_idCategory", nullable=false)
    public int getCatfeatIdCategory() {
        return this.catfeatIdCategory;
    }
    
    public void setCatfeatIdCategory(int catfeatIdCategory) {
        this.catfeatIdCategory = catfeatIdCategory;
    }


    @Column(name="CATFEAT_idCategoryFeature", nullable=false)
    public int getCatfeatIdCategoryFeature() {
        return this.catfeatIdCategoryFeature;
    }
    
    public void setCatfeatIdCategoryFeature(int catfeatIdCategoryFeature) {
        this.catfeatIdCategoryFeature = catfeatIdCategoryFeature;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FeatureValueId) ) return false;
		 FeatureValueId castOther = ( FeatureValueId ) other; 
         
		 return (this.getProdIdProduct()==castOther.getProdIdProduct())
 && (this.getCatfeatIdCategory()==castOther.getCatfeatIdCategory())
 && (this.getCatfeatIdCategoryFeature()==castOther.getCatfeatIdCategoryFeature());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getProdIdProduct();
         result = 37 * result + this.getCatfeatIdCategory();
         result = 37 * result + this.getCatfeatIdCategoryFeature();
         return result;
   }   


}

