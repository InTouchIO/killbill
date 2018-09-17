/*
 * Copyright 2014-2015 Groupon, Inc
 * Copyright 2014-2015 The Billing Project, LLC
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

package org.killbill.billing.util.security.shiro.dao;

import org.joda.time.DateTime;

public class UserModelDao {

    private Long recordId;
    private String name;
    private String surname;
    private String mobileNumber;
    private String username;
    private String password;
    private String passwordSalt;
    private Boolean isActive;
    private DateTime createdDate;
    private String createdBy;
    private DateTime updatedDate;
    private String updatedBy;

    public UserModelDao() {
    }

    public UserModelDao(final Long recordId, final String username, final String password, final String passwordSalt, final Boolean isActive, final DateTime createdDate, final String createdBy, final DateTime updatedDate, final String updatedBy) {
        this.recordId = recordId;
        this.username = username;
        this.password = password;
        this.passwordSalt = passwordSalt;
        this.isActive = isActive;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
    }

    public UserModelDao(Long recordId, final String name, final String surname, final String mobileNumber, String username, String password, String passwordSalt, Boolean isActive, DateTime createdDate, String createdBy, DateTime updatedDate, String updatedBy) {
        this.recordId = recordId;
        this.name = name;
        this.surname = surname;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
        this.passwordSalt = passwordSalt;
        this.isActive = isActive;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
    }

    public UserModelDao(final String username, final String password, final String passwordSalt, final DateTime createdDate, final String createdBy) {
        this(-1L, username, password, passwordSalt, Boolean.TRUE, createdDate, createdBy, createdDate, createdBy);
    }

    public UserModelDao(final String name, final String surname, final String mobileNumber, final String username, final String password, final String passwordSalt, final DateTime createdDate, final String createdBy) {
        this(-1L,   name,   surname,   mobileNumber,  username, password, passwordSalt, Boolean.TRUE, createdDate, createdBy, createdDate, createdBy);
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(final Long recordId) {
        this.recordId = recordId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final DateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }

    public DateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(final DateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(final String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(final String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
