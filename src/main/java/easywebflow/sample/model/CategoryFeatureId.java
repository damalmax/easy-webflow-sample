package easywebflow.sample.model;
// Generated 2012-01-01 22:49:53 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CategoryFeatureId generated by hbm2java
 */
@Embeddable
public class CategoryFeatureId  implements java.io.Serializable {


     private int catIdCategory;
     private int featIdCategoryFeature;

    public CategoryFeatureId() {
    }

    public CategoryFeatureId(int catIdCategory, int featIdCategoryFeature) {
       this.catIdCategory = catIdCategory;
       this.featIdCategoryFeature = featIdCategoryFeature;
    }
   


    @Column(name="CAT_idCategory", nullable=false)
    public int getCatIdCategory() {
        return this.catIdCategory;
    }
    
    public void setCatIdCategory(int catIdCategory) {
        this.catIdCategory = catIdCategory;
    }


    @Column(name="FEAT_idCategoryFeature", nullable=false)
    public int getFeatIdCategoryFeature() {
        return this.featIdCategoryFeature;
    }
    
    public void setFeatIdCategoryFeature(int featIdCategoryFeature) {
        this.featIdCategoryFeature = featIdCategoryFeature;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CategoryFeatureId) ) return false;
		 CategoryFeatureId castOther = ( CategoryFeatureId ) other; 
         
		 return (this.getCatIdCategory()==castOther.getCatIdCategory())
 && (this.getFeatIdCategoryFeature()==castOther.getFeatIdCategoryFeature());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCatIdCategory();
         result = 37 * result + this.getFeatIdCategoryFeature();
         return result;
   }   


}

