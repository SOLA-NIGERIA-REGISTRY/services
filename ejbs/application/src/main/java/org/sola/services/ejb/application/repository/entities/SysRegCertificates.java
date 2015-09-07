/**
 * ******************************************************************************************
 * Copyright (C) 2014 - Food and Agriculture Organization of the United Nations
 * (FAO). All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,this
 * list of conditions and the following disclaimer. 2. Redistributions in binary
 * form must reproduce the above copyright notice,this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided
 * with the distribution. 3. Neither the name of FAO nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT,STRICT LIABILITY,OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.ejb.application.repository.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.sola.services.common.repository.AccessFunctions;
import org.sola.services.common.repository.Localized;
import org.sola.services.common.repository.entities.AbstractReadOnlyEntity;

/**
 * Entity representing the application systematic_registration_certificates
 * view.
 *
 * @author soladev
 */
@Table(name = "systematic_registration_certificates", schema = "application")
public class SysRegCertificates extends AbstractReadOnlyEntity {

    public static final String QUERY_PARAMETER_NR = "nr";

    // Where clause
//    public static final String QUERY_WHERE_BYNR = "nr = #{" + QUERY_PARAMETER_NR  + "} "
//            + "AND compare_strings(#{search_string}, name_lastpart)";
    public static final String QUERY_SELECT = "  distinct(id), name_firstpart, name_lastpart, ba_unit_id, size, owners, \n" +
"       state, surveyor, rank, imagerydate, imageryresolution, imagerysource, \n" +
"       lga, zone, location, plan, sheetnr, commencingdate, purpose, \n" +
"       term, rent";

    public static final String QUERY_WHERE_BYNR = " nr = #{" + QUERY_PARAMETER_NR + "} "
            + "AND compare_strings(#{search_string}, name_lastpart)";
    /**
     * WHERE clause to return current CO's based on search string compared to
     * last part
     */
//    public static final String QUERY_WHERE_SEARCHBYPARTS = "compare_strings(#{search_string}, name_lastpart)";

    public static final String QUERY_WHERE_SEARCHBYPARTS = " compare_strings(#{search_string}, name_lastpart)";
    
    public static final String QUERY_WHERE_CO = " compare_strings(#{search_string}, id)";

//    @Column(name = "nr")
//    private String nr;
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name_firstpart")
    private String nameFirstpart;
    @Column(name = "name_lastpart")
    private String nameLastpart;
    @Column(name = "ba_unit_id")
    private String baUnitId;
    @Column(name = "size")
    private BigDecimal size;
    @Column(name = "owners")
    private String owners;
    @Column(name = "state")
    private String state;
    @Column(name = "surveyor")
    private String surveyor;
    @Column(name = "rank")
    private String rank;
    @Column(name = "imagerydate")
    private String imagerydate;
    @Column(name = "imageryresolution")
    private String imageryresolution;
    @Column(name = "imagerysource")
    private String imagerysource;
    @Column(name = "lga")
    private String lga;
    @Column(name = "zone")
    private String zone;
    @Column(name = "location")
    private String location;
    @Column(name = "plan")
    private String plan;
    @Column(name = "sheetnr")
    private String sheetnr;
//    @Column(name = "commencingdate")
//    private String commencingdate;
    @Column(name = "purpose")
    private String purpose;
    @Column(name = "term")
    private String term;
    @Column(name = "rent")
    private String rent;

//    public String getNr() {
//        return nr;
//    }
//
//    public void setNr(String nr) {
//        this.nr = nr;
//    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameFirstpart() {
        return nameFirstpart;
    }

    public void setNameFirstpart(String nameFirstpart) {
        this.nameFirstpart = nameFirstpart;
    }

    public String getNameLastpart() {
        return nameLastpart;
    }

    public void setNameLastpart(String nameLastpart) {
        this.nameLastpart = nameLastpart;
    }

    public String getBaUnitId() {
        return baUnitId;
    }

    public void setBaUnitId(String baUnitId) {
        this.baUnitId = baUnitId;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(String surveyor) {
        this.surveyor = surveyor;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getImagerydate() {
        return imagerydate;
    }

    public void setImagerydate(String imagerydate) {
        this.imagerydate = imagerydate;
    }

    public String getImageryresolution() {
        return imageryresolution;
    }

    public void setImageryresolution(String imageryresolution) {
        this.imageryresolution = imageryresolution;
    }

    public String getImagerysource() {
        return imagerysource;
    }

    public void setImagerysource(String imagerysource) {
        this.imagerysource = imagerysource;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getSheetnr() {
        return sheetnr;
    }

    public void setSheetnr(String sheetnr) {
        this.sheetnr = sheetnr;
    }

//    public String getCommencingdate() {
//        return commencingdate;
//    }
//
//    public void setCommencingdate(String commencingdate) {
//        this.commencingdate = commencingdate;
//    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    
    
    
    

}
