package org.sola.services.ejb.administrative.repository.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractVersionedEntity;

@Table(name = "lease_condition_template", schema = "administrative")
@DefaultSorter(sortString="template_name")
public class LeaseConditionTemplateBasic extends AbstractVersionedEntity {
    @Id
    @Column
    private String id;
    @Column(name="template_name")
    private String templateName;
    @Column(name="rrr_type")
    private String rrrType;
    
    public LeaseConditionTemplateBasic(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getRrrType() {
        return rrrType;
    }

    public void setRrrType(String rrrType) {
        this.rrrType = rrrType;
    }
}
