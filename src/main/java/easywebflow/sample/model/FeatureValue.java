package easywebflow.sample.model;
// Generated 2012-01-01 22:49:53 by Hibernate Tools 3.4.0.CR1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * FeatureValue generated by hbm2java
 */
@Entity
@Table(name="FEATURE_VALUES"
    ,catalog="INZ_SKLEP"
)
public class FeatureValue  implements java.io.Serializable {


     private FeatureValueId id;
     private CategoryFeature categoryFeature;
     private Product product;
     private String value;

    public FeatureValue() {
    }

    public FeatureValue(FeatureValueId id, CategoryFeature categoryFeature, Product product, String value) {
       this.id = id;
       this.categoryFeature = categoryFeature;
       this.product = product;
       this.value = value;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="prodIdProduct", column=@Column(name="PROD_idPRODUCT", nullable=false) ), 
        @AttributeOverride(name="catfeatIdCategory", column=@Column(name="CATFEAT_idCategory", nullable=false) ), 
        @AttributeOverride(name="catfeatIdCategoryFeature", column=@Column(name="CATFEAT_idCategoryFeature", nullable=false) ) } )
    public FeatureValueId getId() {
        return this.id;
    }
    
    public void setId(FeatureValueId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="CATFEAT_idCategory", referencedColumnName="CAT_idCategory", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="CATFEAT_idCategoryFeature", referencedColumnName="FEAT_idCategoryFeature", nullable=false, insertable=false, updatable=false) } )
    public CategoryFeature getCategoryFeature() {
        return this.categoryFeature;
    }
    
    public void setCategoryFeature(CategoryFeature categoryFeature) {
        this.categoryFeature = categoryFeature;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PROD_idPRODUCT", nullable=false, insertable=false, updatable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="value", nullable=false, length=45)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}

