/*
 * Copyright 2010-2013 Ning, Inc.
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

package org.killbill.billing.jaxrs.json;

import java.math.BigDecimal;
import java.util.*;

import javax.annotation.Nullable;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.killbill.billing.ObjectType;
import org.killbill.billing.account.api.Account;
import org.killbill.billing.account.api.MutableAccountData;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.jaxrs.util.AccountAdditional;
import org.killbill.billing.util.audit.AccountAuditLogs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiModel;
import org.killbill.billing.util.customfield.CustomField;

@ApiModel(value="Account", parent = JsonBase.class)
public class AccountJson extends JsonBase {

    private final UUID accountId;
    private final String externalKey;
    private final BigDecimal accountCBA;
    private final BigDecimal accountBalance;
    private final String name;
    private final Integer firstNameLength;
    private final String email;
    private final Integer billCycleDayLocal;
    private final Currency currency;
    private final UUID parentAccountId;
    private final Boolean isPaymentDelegatedToParent;
    private final UUID paymentMethodId;
    private final DateTime referenceTime;
    private final String timeZone;
    private final String address1;
    private final String address2;
    private final String postalCode;
    private final String company;
    private final String city;
    private final String state;
    private final String country;
    private final String locale;
    private final String phone;
    private final String notes;
    private final Boolean isMigrated;

    //List of custom fields

    private String title;
    private String middleName;
    private String lastName;
    private String dob;
    private String gender;
    private String nationality;
    private String idNumber;
    private String landline;
    private String other;
    private String suburb;
    private String uploadFile;
    private String customPhones;
    private String accountMatters;



    public AccountJson(final Account account, final BigDecimal accountBalance, final BigDecimal accountCBA, @Nullable final AccountAuditLogs accountAuditLogs) {
        super(toAuditLogJson(accountAuditLogs == null ? null : accountAuditLogs.getAuditLogsForAccount()));
        this.accountCBA = accountCBA;
        this.accountBalance = accountBalance;
        this.accountId = account.getId();
        this.externalKey = account.getExternalKey();
        this.name = account.getName();
        this.firstNameLength = account.getFirstNameLength();
        this.email = account.getEmail();
        this.billCycleDayLocal = account.getBillCycleDayLocal();
        this.currency = account.getCurrency();
        this.parentAccountId = account.getParentAccountId();
        this.isPaymentDelegatedToParent = account.isPaymentDelegatedToParent();
        this.paymentMethodId = account.getPaymentMethodId();
        this.referenceTime = account.getReferenceTime();
        this.timeZone = account.getTimeZone() != null ? account.getTimeZone().toString() : null;
        this.address1 = account.getAddress1();
        this.address2 = account.getAddress2();
        this.postalCode = account.getPostalCode();
        this.company = account.getCompanyName();
        this.city = account.getCity();
        this.state = account.getStateOrProvince();
        this.country = account.getCountry();
        this.locale = account.getLocale();
        this.phone = account.getPhone();
        this.notes = account.getNotes();
        this.isMigrated = account.isMigrated();
    }


    public AccountJson( final UUID accountId,
                       final String name,
                       final Integer firstNameLength,
                        final String externalKey,
                        final String email,
                        final Integer billCycleDayLocal,
                        final Currency currency,
                        final UUID parentAccountId,
                        final Boolean isPaymentDelegatedToParent,
                       final UUID paymentMethodId,
                        final DateTime referenceTime,
                        final String timeZone,
                        final String address1,
                        final String address2,
                        final String postalCode,
                        final String company,
                        final String city,
                         final String state,
                        final String country,
                        final String locale,
                        final String phone,
                        final String notes,
                        final Boolean isMigrated,
                        final BigDecimal accountBalance,
                        final BigDecimal accountCBA,
                       final List<AuditLogJson> auditLogs) {
        super(auditLogs);
        this.accountBalance = accountBalance;
        this.externalKey = externalKey;
        this.accountId = accountId;
        this.name = name;
        this.firstNameLength = firstNameLength;
        this.email = email;
        this.billCycleDayLocal = billCycleDayLocal;
        this.currency = currency;
        this.parentAccountId = parentAccountId;
        this.isPaymentDelegatedToParent = isPaymentDelegatedToParent;
        this.paymentMethodId = paymentMethodId;
        this.referenceTime = referenceTime;
        this.timeZone = timeZone;
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.company = company;
        this.city = city;
        this.state = state;
        this.country = country;
        this.locale = locale;
        this.phone = phone;
        this.notes = notes;
        this.isMigrated = isMigrated;
        this.accountCBA = accountCBA;

    }

    @JsonCreator
    public AccountJson(@JsonProperty("accountId") final UUID accountId,
                       @JsonProperty("name") final String name,
                       @JsonProperty("firstNameLength") final Integer firstNameLength,
                       @JsonProperty("externalKey") final String externalKey,
                       @JsonProperty("email") final String email,
                       @JsonProperty("billCycleDayLocal") final Integer billCycleDayLocal,
                       @JsonProperty("currency") final Currency currency,
                       @JsonProperty("parentAccountId") final UUID parentAccountId,
                       @JsonProperty("isPaymentDelegatedToParent") final Boolean isPaymentDelegatedToParent,
                       @JsonProperty("paymentMethodId") final UUID paymentMethodId,
                       @JsonProperty("referenceTime") final DateTime referenceTime,
                       @JsonProperty("timeZone") final String timeZone,
                       @JsonProperty("address1") final String address1,
                       @JsonProperty("address2") final String address2,
                       @JsonProperty("postalCode") final String postalCode,
                       @JsonProperty("company") final String company,
                       @JsonProperty("city") final String city,
                       @JsonProperty("state") final String state,
                       @JsonProperty("country") final String country,
                       @JsonProperty("locale") final String locale,
                       @JsonProperty("phone") final String phone,
                       @JsonProperty("notes") final String notes,
                       @JsonProperty("isMigrated") final Boolean isMigrated,
                       @JsonProperty("accountBalance") final BigDecimal accountBalance,
                       @JsonProperty("accountCBA") final BigDecimal accountCBA,
                       @JsonProperty("auditLogs") @Nullable final List<AuditLogJson> auditLogs,
                       /*List of custom fields*/
                       @JsonProperty("title") @Nullable final String title,
                       @JsonProperty("middleName") @Nullable final String middleName,
                       @JsonProperty("lastName") @Nullable final String lastName,
                       @JsonProperty("dob") @Nullable final String dob,
                       @JsonProperty("gender") @Nullable final String gender,
                       @JsonProperty("nationality") @Nullable final String nationality,
                       @JsonProperty("idNumber") @Nullable final String idNumber,
                       @JsonProperty("landline") @Nullable final String landline,
                       @JsonProperty("other") @Nullable final String other,
                       @JsonProperty("suburb") @Nullable final String suburb,
                       @JsonProperty("uploadFile") @Nullable final String uploadFile,
                       @JsonProperty("customPhones") @Nullable final String customPhones,
                       @JsonProperty("accountMatters") @Nullable final String accountMatters) {
        super(auditLogs);
        this.accountBalance = accountBalance;
        this.externalKey = externalKey;
        this.accountId = accountId;
        this.name = name;
        this.firstNameLength = firstNameLength;
        this.email = email;
        this.billCycleDayLocal = billCycleDayLocal;
        this.currency = currency;
        this.parentAccountId = parentAccountId;
        this.isPaymentDelegatedToParent = isPaymentDelegatedToParent;
        this.paymentMethodId = paymentMethodId;
        this.referenceTime = referenceTime;
        this.timeZone = timeZone;
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.company = company;
        this.city = city;
        this.state = state;
        this.country = country;
        this.locale = locale;
        this.phone = phone;
        this.notes = notes;
        this.isMigrated = isMigrated;
        this.accountCBA = accountCBA;

        /*List of custom fields*/

        this.title = title;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.nationality = nationality;
        this.idNumber = idNumber;
        this.landline = landline;
        this.other = other;
        this.suburb = suburb;
        this.uploadFile = uploadFile;
        this.customPhones = customPhones;
        this.accountMatters = accountMatters;
    }

    public Account toAccount(@Nullable final UUID accountId) {
        return new Account() {

            @Override
            public UUID getId() {
                return accountId;
            }

            @Override
            public DateTimeZone getTimeZone() {
                if (Strings.emptyToNull(timeZone) == null) {
                    return null;
                } else {
                    return DateTimeZone.forID(timeZone);
                }
            }

            @Override
            public String getStateOrProvince() {
                return state;
            }

            @Override
            public String getPostalCode() {
                return postalCode;
            }

            @Override
            public String getPhone() {
                return phone;
            }

            @Override
            public String getNotes() {
                return notes;
            }

            @Override
            public Boolean isMigrated() {
                return isMigrated;
            }

            @Override
            public UUID getPaymentMethodId() {
                return paymentMethodId;
            }

            @Override
            public String getName() {
                return name;
            }

            @Override
            public String getLocale() {
                return locale;
            }

            @Override
            public Integer getFirstNameLength() {
                return firstNameLength;
            }


            @Override
            public String getExternalKey() {
                return externalKey;
            }

            @Override
            public String getEmail() {
                return email;
            }

            @Override
            public Currency getCurrency() {
                return currency;
            }

            @Override
            public String getCountry() {
                return country;
            }

            @Override
            public String getCompanyName() {
                return company;
            }

            @Override
            public String getCity() {
                return city;
            }

            @Override
            public Integer getBillCycleDayLocal() {
                return billCycleDayLocal;
            }

            @Override
            public String getAddress2() {
                return address2;
            }

            @Override
            public String getAddress1() {
                return address1;
            }

            @Override
            public UUID getParentAccountId() {
                return parentAccountId;
            }

            @Override
            public Boolean isPaymentDelegatedToParent() {
                return isPaymentDelegatedToParent;
            }

            //
            // Non implemented
            //
            @Override
            public DateTimeZone getFixedOffsetTimeZone() {
                return null;
            }

            @Override
            public DateTime getReferenceTime() {
                return referenceTime;
            }

            @Override
            public DateTime getCreatedDate() {
                return null;
            }

            @Override
            public DateTime getUpdatedDate() {
                return null;
            }

            @Override
            public MutableAccountData toMutableAccountData() {
                return null;
            }

            @Override
            public Account mergeWithDelegate(final Account delegate) {
                return null;
            }
        };
    }

    public List<CustomFieldJson> toCustomFieldJson(){
        Map<String,String> customDataMap = new HashMap<String,String>();
        customDataMap.put(AccountAdditional.title,this.getTitle());
        customDataMap.put(AccountAdditional.middleName,this.getMiddleName() );
        customDataMap.put(AccountAdditional.lastName,this.getLastName());
        customDataMap.put(AccountAdditional.dob,this.getDob());
        customDataMap.put(AccountAdditional.gender,this.getGender());
        customDataMap.put(AccountAdditional.nationality,this.getNationality());
        customDataMap.put(AccountAdditional.idNumber,this.getIdNumber());
        customDataMap.put(AccountAdditional.landline,this.getLandline());
        customDataMap.put(AccountAdditional.other,this.getOther());
        customDataMap.put(AccountAdditional.suburb,this.getSuburb());
        customDataMap.put(AccountAdditional.uploadFile,this.getUploadFile());
        customDataMap.put(AccountAdditional.customPhones,this.getCustomPhones());

        final List<CustomFieldJson> customFields = new ArrayList<CustomFieldJson>();
        for (Map.Entry<String, String> e : customDataMap.entrySet()) {
            if(notNullAndNotEmpty(e.getValue())) customFields.add(new CustomFieldJson(null,null, ObjectType.ACCOUNT,e.getKey(),e.getValue(),new ArrayList<AuditLogJson>()));
        }
        return customFields;
    }

    public AccountJson setCustomField( List<CustomField> customFields){
        Map<String,String> cfMap = new HashMap<String, String>();
        for (CustomField cf : customFields){
            cfMap.put(cf.getFieldName(),cf.getFieldValue());
        }
        this.setTitle(cfMap.get(AccountAdditional.title));
        this.setMiddleName(cfMap.get(AccountAdditional.middleName));
        this.setLastName(cfMap.get(AccountAdditional.lastName));
        this.setDob(cfMap.get(AccountAdditional.dob));
        this.setGender(cfMap.get(AccountAdditional.gender));
        this.setNationality(cfMap.get(AccountAdditional.nationality));
        this.setIdNumber(cfMap.get(AccountAdditional.idNumber));
        this.setLandline(cfMap.get(AccountAdditional.landline));
        this.setOther(cfMap.get(AccountAdditional.other));
        this.setSuburb(cfMap.get(AccountAdditional.suburb));
        this.setUploadFile(cfMap.get(AccountAdditional.uploadFile));
        this.setCustomPhones(cfMap.get(AccountAdditional.customPhones));
        this.setAccountMatters(cfMap.get(AccountAdditional.accountMatters));
        return this;
    }

    public static AccountJson setCustomField(AccountJson accountJson, List<CustomField> customFields){
        Map<String,String> cfMap = new HashMap<String, String>();
        for (CustomField cf : customFields){
            cfMap.put(cf.getFieldName(),cf.getFieldValue());
        }
        accountJson.setTitle(cfMap.get(AccountAdditional.title));
        accountJson.setMiddleName(cfMap.get(AccountAdditional.middleName));
        accountJson.setLastName(cfMap.get(AccountAdditional.lastName));
        accountJson.setDob(cfMap.get(AccountAdditional.dob));
        accountJson.setGender(cfMap.get(AccountAdditional.gender));
        accountJson.setNationality(cfMap.get(AccountAdditional.nationality));
        accountJson.setIdNumber(cfMap.get(AccountAdditional.idNumber));
        accountJson.setLandline(cfMap.get(AccountAdditional.landline));
        accountJson.setOther(cfMap.get(AccountAdditional.other));
        accountJson.setSuburb(cfMap.get(AccountAdditional.suburb));
        accountJson.setCustomPhones(cfMap.get(AccountAdditional.customPhones));
        accountJson.setAccountMatters(cfMap.get(AccountAdditional.accountMatters));
        return accountJson;
    }

    private Boolean notNullAndNotEmpty(String str){
        return str != null && !str.isEmpty();
    }


    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public String getExternalKey() {
        return externalKey;
    }

    public BigDecimal getAccountCBA() {
        return accountCBA;
    }

    public String getName() {
        return name;
    }

    public Integer getFirstNameLength() {
        return firstNameLength;
    }

    public String getEmail() {
        return email;
    }

    public Integer getBillCycleDayLocal() {
        return billCycleDayLocal;
    }

    public Currency getCurrency() {
        return currency;
    }

    public UUID getParentAccountId() {
        return parentAccountId;
    }

    @JsonProperty("isPaymentDelegatedToParent")
    public Boolean isPaymentDelegatedToParent() {
        return isPaymentDelegatedToParent;
    }

    public UUID getPaymentMethodId() {
        return paymentMethodId;
    }

    public DateTime getReferenceTime() {
        return referenceTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCompany() {
        return company;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getLocale() {
        return locale;
    }

    public String getPhone() {
        return phone;
    }

    public String getNotes() {
        return notes;
    }

    @JsonProperty("isMigrated")
    public Boolean isMigrated() {
        return isMigrated;
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

    public String getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCustomPhones() {
        return customPhones;
    }

    public void setCustomPhones(String customPhones) {
        this.customPhones = customPhones;
    }

    public String getAccountMatters() {
        return accountMatters;
    }

    public void setAccountMatters(String accountMatters) {
        this.accountMatters = accountMatters;
    }

    @Override
    public String toString() {
        return "AccountJson{" +
               "accountId='" + accountId + '\'' +
               ", externalKey='" + externalKey + '\'' +
               ", accountCBA=" + accountCBA +
               ", accountBalance=" + accountBalance +
               ", name='" + name + '\'' +
               ", firstNameLength=" + firstNameLength +
               ", email='" + email + '\'' +
               ", billCycleDayLocal=" + billCycleDayLocal +
               ", currency='" + currency + '\'' +
               ", parentAccountId=" + parentAccountId + '\'' +
               ", isPaymentDelegatedToParent=" + isPaymentDelegatedToParent + '\'' +
               ", paymentMethodId='" + paymentMethodId + '\'' +
               ", referenceTime='" + referenceTime + '\'' +
               ", timeZone='" + timeZone + '\'' +
               ", address1='" + address1 + '\'' +
               ", address2='" + address2 + '\'' +
               ", postalCode='" + postalCode + '\'' +
               ", company='" + company + '\'' +
               ", city='" + city + '\'' +
               ", state='" + state + '\'' +
               ", country='" + country + '\'' +
               ", locale='" + locale + '\'' +
               ", phone='" + phone + '\'' +
               ", notes='" + notes + '\'' +
               ", isMigrated=" + isMigrated +
               '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final AccountJson that = (AccountJson) o;

        if (accountBalance != null ? accountBalance.compareTo(that.accountBalance) != 0 : that.accountBalance != null) {
            return false;
        }
        if (accountCBA != null ? accountCBA.compareTo(that.accountCBA) != 0 : that.accountCBA != null) {
            return false;
        }
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) {
            return false;
        }
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) {
            return false;
        }
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) {
            return false;
        }
        if (billCycleDayLocal != null ? !billCycleDayLocal.equals(that.billCycleDayLocal) : that.billCycleDayLocal != null) {
            return false;
        }
        if (city != null ? !city.equals(that.city) : that.city != null) {
            return false;
        }
        if (company != null ? !company.equals(that.company) : that.company != null) {
            return false;
        }
        if (country != null ? !country.equals(that.country) : that.country != null) {
            return false;
        }
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) {
            return false;
        }
        if (parentAccountId != null ? !parentAccountId.equals(that.parentAccountId) : that.parentAccountId != null) {
            return false;
        }
        if (isPaymentDelegatedToParent != null ? !isPaymentDelegatedToParent.equals(that.isPaymentDelegatedToParent) : that.isPaymentDelegatedToParent != null) {
            return false;
        }
        if (email != null ? !email.equals(that.email) : that.email != null) {
            return false;
        }
        if (externalKey != null ? !externalKey.equals(that.externalKey) : that.externalKey != null) {
            return false;
        }
        if (firstNameLength != null ? !firstNameLength.equals(that.firstNameLength) : that.firstNameLength != null) {
            return false;
        }
        if (isMigrated != null ? !isMigrated.equals(that.isMigrated) : that.isMigrated != null) {
            return false;
        }
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (paymentMethodId != null ? !paymentMethodId.equals(that.paymentMethodId) : that.paymentMethodId != null) {
            return false;
        }
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) {
            return false;
        }
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) {
            return false;
        }
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) {
            return false;
        }
        if (state != null ? !state.equals(that.state) : that.state != null) {
            return false;
        }
        if (referenceTime != null ? referenceTime.compareTo(that.referenceTime) != 0 : that.referenceTime != null) {
            return false;
        }
        if (timeZone != null ? !timeZone.equals(that.timeZone) : that.timeZone != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = accountId != null ? accountId.hashCode() : 0;
        result = 31 * result + (externalKey != null ? externalKey.hashCode() : 0);
        result = 31 * result + (accountCBA != null ? accountCBA.hashCode() : 0);
        result = 31 * result + (accountBalance != null ? accountBalance.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (firstNameLength != null ? firstNameLength.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (billCycleDayLocal != null ? billCycleDayLocal.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (parentAccountId != null ? parentAccountId.hashCode() : 0);
        result = 31 * result + (isPaymentDelegatedToParent != null ? isPaymentDelegatedToParent.hashCode() : 0);
        result = 31 * result + (paymentMethodId != null ? paymentMethodId.hashCode() : 0);
        result = 31 * result + (referenceTime != null ? referenceTime.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (isMigrated != null ? isMigrated.hashCode() : 0);
        return result;
    }
}
