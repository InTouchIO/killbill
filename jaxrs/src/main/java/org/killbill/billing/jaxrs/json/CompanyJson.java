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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Nullable;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.killbill.billing.ObjectType;
import org.killbill.billing.account.api.Account;
import org.killbill.billing.account.api.MutableAccountData;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.util.audit.AccountAuditLogs;
import org.killbill.billing.util.customfield.CustomField;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiModel;

@ApiModel(value = "Company", parent = JsonBase.class)
public class CompanyJson extends JsonBase {

    private final String companyRegisteredName;
    private final String companyRegistrationNumber;
    private final String companyType;
    private final String companyIndustry;
    private final String companyVATRegistrationNumber;
    private final String companyWebsite;
    private final String companyBillableDomain;
    private final String companyMobile;
    private final String companyLandLine;
    private final String companyOther;
    private final String companyAddress1;
    private final String companyAddress2;
    private final String companySuburb;
    private final String companyCity;
    private final String companyCountry;
    private final String companyProvince;
    private final String companyNotes;
    private final String companyUploadFile;

    public CompanyJson(@Nullable final List<AuditLogJson> auditLogs,
                       final String companyRegisteredName,
                       final String companyRegistrationNumber,
                       final String companyType,
                       final String companyIndustry,
                       final String companyVATRegistrationNumber,
                       final String companyWebsite,
                       final String companyBillableDomain,
                       final String companyMobile,
                       final String companyLandLine,
                       final String companyOther,
                       final String companyAddress1,
                       final String companyAddress2,
                       final String companySuburb,
                       final String companyCity,
                       final String companyCountry,
                       final String companyProvince,
                       final String companyNotes,
                       final String companyUploadFile) {
        super(auditLogs);
        this.companyRegisteredName = companyRegisteredName;
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.companyType = companyType;
        this.companyIndustry = companyIndustry;
        this.companyVATRegistrationNumber = companyVATRegistrationNumber;
        this.companyWebsite = companyWebsite;
        this.companyBillableDomain = companyBillableDomain;
        this.companyMobile = companyMobile;
        this.companyLandLine = companyLandLine;
        this.companyOther = companyOther;
        this.companyAddress1 = companyAddress1;
        this.companyAddress2 = companyAddress2;
        this.companySuburb = companySuburb;
        this.companyCity = companyCity;
        this.companyCountry = companyCountry;
        this.companyProvince = companyProvince;
        this.companyNotes = companyNotes;
        this.companyUploadFile = companyUploadFile;
    }

    @JsonCreator
    public CompanyJson(@JsonProperty("companyRegisteredName") final String companyRegisteredName,
                       @JsonProperty("companyRegistrationNumber") final String companyRegistrationNumber,
                       @JsonProperty("companyType") final String companyType,
                       @JsonProperty("companyIndustry") final String companyIndustry,
                       @JsonProperty("companyVATRegistrationNumber") final String companyVATRegistrationNumber,
                       @JsonProperty("companyWebsite") final String companyWebsite,
                       @JsonProperty("companyBillableDomain") final String companyBillableDomain,
                       @JsonProperty("companyMobile") final String companyMobile,
                       @JsonProperty("companyLandLine") final String companyLandLine,
                       @JsonProperty("companyOther") final String companyOther,
                       @JsonProperty("companyAddress1") final String companyAddress1,
                       @JsonProperty("companyAddress2") final String companyAddress2,
                       @JsonProperty("companySuburb") final String companySuburb,
                       @JsonProperty("companyCity") final String companyCity,
                       @JsonProperty("companyCountry") final String companyCountry,
                       @JsonProperty("companyProvince") final String companyProvince,
                       @JsonProperty("companyNotes") final String companyNotes,
                       @JsonProperty("companyUploadFile") final String companyUploadFile,
                       @JsonProperty("auditLogs") @Nullable final List<AuditLogJson> auditLogs) {
        super(auditLogs);
        this.companyRegisteredName = companyRegisteredName;
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.companyType = companyType;
        this.companyIndustry = companyIndustry;
        this.companyVATRegistrationNumber = companyVATRegistrationNumber;
        this.companyWebsite = companyWebsite;
        this.companyBillableDomain = companyBillableDomain;
        this.companyMobile = companyMobile;
        this.companyLandLine = companyLandLine;
        this.companyOther = companyOther;
        this.companyAddress1 = companyAddress1;
        this.companyAddress2 = companyAddress2;
        this.companySuburb = companySuburb;
        this.companyCity = companyCity;
        this.companyCountry = companyCountry;
        this.companyProvince = companyProvince;
        this.companyNotes = companyNotes;
        this.companyUploadFile = companyUploadFile;
    }

    public List<CustomFieldJson> toCustomFieldList() {
        Map<String, String> customDataMap = new HashMap<String, String>();
        customDataMap.put("companyRegisteredName", this.getCompanyRegisteredName());
        customDataMap.put("companyRegistrationNumber", this.getCompanyRegistrationNumber());
        customDataMap.put("companyType", this.getCompanyType());
        customDataMap.put("companyIndustry", this.getCompanyIndustry());
        customDataMap.put("companyVATRegistrationNumber", this.getCompanyVATRegistrationNumber());
        customDataMap.put("companyWebsite", this.getCompanyWebsite());
        customDataMap.put("companyBillableDomain", this.getCompanyBillableDomain());
        customDataMap.put("companyMobile", this.getCompanyMobile());
        customDataMap.put("companyLandLine", this.getCompanyLandLine());
        customDataMap.put("companyOther", this.getCompanyOther());
        customDataMap.put("companyAddress1", this.getCompanyAddress1());
        customDataMap.put("companyAddress2", this.getCompanyAddress2());
        customDataMap.put("companySuburb", this.getCompanySuburb());
        customDataMap.put("companyCity", this.getCompanyCity());
        customDataMap.put("companyCountry", this.getCompanyCountry());
        customDataMap.put("companyProvince", this.getCompanyProvince());
        customDataMap.put("companyNotes", this.getCompanyNotes());
        customDataMap.put("companyUploadFile", this.getCompanyUploadFile());
        final List<CustomFieldJson> customFields = new ArrayList<CustomFieldJson>();
        for (Map.Entry<String, String> e : customDataMap.entrySet()) {
            if(notNullAndNotEmpty(e.getValue())) customFields.add(new CustomFieldJson(null, null, ObjectType.ACCOUNT, e.getKey(), e.getValue(), this.getAuditLogs()));
        }
        return customFields;
    }

    private Boolean notNullAndNotEmpty(String str){
        return str != null && !str.isEmpty();
    }

    public static CompanyJson toCompanyJson(List<CustomField> customFields) {
        Map<String, String> cfMap = new HashMap<String, String>();
        for (CustomField cf : customFields) {
            cfMap.put(cf.getFieldName(), cf.getFieldValue());
        }

        CompanyJson companyJson = new CompanyJson(new ArrayList<AuditLogJson>(),
                                                  cfMap.get("companyRegisteredName"),
                                                  cfMap.get("companyRegistrationNumber"),
                                                  cfMap.get("companyType"),
                                                  cfMap.get("companyIndustry"),
                                                  cfMap.get("companyVATRegistrationNumber"),
                                                  cfMap.get("companyWebsite"),
                                                  cfMap.get("companyBillableDomain"),
                                                  cfMap.get("companyMobile"),
                                                  cfMap.get("companyLandLine"),
                                                  cfMap.get("companyOther"),
                                                  cfMap.get("companyAddress1"),
                                                  cfMap.get("companyAddress2"),
                                                  cfMap.get("companySuburb"),
                                                  cfMap.get("companyCity"),
                                                  cfMap.get("companyCountry"),
                                                  cfMap.get("companyProvince"),
                                                  cfMap.get("companyNotes"),
                                                  cfMap.get("companyUploadFile")
        );
        return companyJson;
    }

    public String getCompanyRegisteredName() {
        return companyRegisteredName;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public String getCompanyType() {
        return companyType;
    }

    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public String getCompanyVATRegistrationNumber() {
        return companyVATRegistrationNumber;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public String getCompanyBillableDomain() {
        return companyBillableDomain;
    }

    public String getCompanyMobile() {
        return companyMobile;
    }

    public String getCompanyLandLine() {
        return companyLandLine;
    }

    public String getCompanyOther() {
        return companyOther;
    }

    public String getCompanyAddress1() {
        return companyAddress1;
    }

    public String getCompanyAddress2() {
        return companyAddress2;
    }

    public String getCompanySuburb() {
        return companySuburb;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public String getCompanyProvince() {
        return companyProvince;
    }

    public String getCompanyNotes() {
        return companyNotes;
    }

    public String getCompanyUploadFile() {
        return companyUploadFile;
    }

    @Override
    public String toString() {
        return "CompanyJson{" +
               "companyRegisteredName='" + companyRegisteredName + '\'' +
               ", companyRegistrationNumber='" + companyRegistrationNumber + '\'' +
               ", companyType='" + companyType + '\'' +
               ", companyIndustry='" + companyIndustry + '\'' +
               ", companyVATRegistrationNumber='" + companyVATRegistrationNumber + '\'' +
               ", companyWebsite='" + companyWebsite + '\'' +
               ", companyBillableDomain='" + companyBillableDomain + '\'' +
               ", companyMobile='" + companyMobile + '\'' +
               ", companyLandLine='" + companyLandLine + '\'' +
               ", companyOther='" + companyOther + '\'' +
               ", companyAddress1='" + companyAddress1 + '\'' +
               ", companyAddress2='" + companyAddress2 + '\'' +
               ", companySuburb='" + companySuburb + '\'' +
               ", companyCity='" + companyCity + '\'' +
               ", companyCountry='" + companyCountry + '\'' +
               '}';
    }
}
