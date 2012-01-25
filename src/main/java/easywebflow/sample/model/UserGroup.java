package easywebflow.sample.model;
// Generated 2012-01-25 23:17:58 by Hibernate Tools 3.4.0.CR1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserGroup generated by hbm2java
 */
@Entity
@Table(name="USER_GROUPS"
    ,catalog="INZ_SKLEP"
)
public class UserGroup  implements java.io.Serializable {


     private UserGroupId id;
     private User user;

    public UserGroup() {
    }

    public UserGroup(UserGroupId id, User user) {
       this.id = id;
       this.user = user;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="usersIdUser", column=@Column(name="USERS_idUSER", nullable=false) ), 
        @AttributeOverride(name="groupsIdGroup", column=@Column(name="GROUPS_idGROUP", nullable=false) ) } )
    public UserGroupId getId() {
        return this.id;
    }
    
    public void setId(UserGroupId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USERS_idUSER", nullable=false, insertable=false, updatable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


