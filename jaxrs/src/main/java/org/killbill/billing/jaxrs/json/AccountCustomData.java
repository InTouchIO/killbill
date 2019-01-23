/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.jaxrs.json;

public class AccountCustomData {

    private String title;
    private String middleName;
    private String lastName;
    private String dob;
    private String gender;
    private String nationality;
    private String iDNumber;
    private String landline;
    private String other;
    private String suburb;
    private String entityType;
    private String vatNumber;

    public AccountCustomData(final String title,
                             final String middleName,
                             final String lastName,
                             final String dob,
                             final String gender,
                             final String nationality,
                             final String iDNumber,
                             final String landline,
                             final String other,
                             final String suburb,
                             final String entityType,
                             final String vatNumber) {
        this.title = title;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.nationality = nationality;
        this.iDNumber = iDNumber;
        this.landline = landline;
        this.other = other;
        this.suburb = suburb;
        this.entityType = entityType;
        this.vatNumber = vatNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(final String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(final String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(final String landline) {
        this.landline = landline;
    }

    public String getOther() {
        return other;
    }

    public void setOther(final String other) {
        this.other = other;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(final String suburb) {
        this.suburb = suburb;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Override
    public String toString() {
        return "AccountCustomData{" +
                "title='" + title + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", iDNumber='" + iDNumber + '\'' +
                ", landline='" + landline + '\'' +
                ", other='" + other + '\'' +
                ", suburb='" + suburb + '\'' +
                ", entityType='" + entityType + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                '}';
    }
}
