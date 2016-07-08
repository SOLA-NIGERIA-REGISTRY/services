package org.sola.services.ejb.administrative.repository.entities;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "lease_condition_template", schema = "administrative")
public class LeaseConditionTemplate extends LeaseConditionTemplateBasic {
    @Column(name="template_text")
    private String templateText;
    
    public LeaseConditionTemplate(){
        
    }

    public String getTemplateText() {
        return templateText;
    }

    public void setTemplateText(String templateText) {
        this.templateText = templateText;
    }
}
