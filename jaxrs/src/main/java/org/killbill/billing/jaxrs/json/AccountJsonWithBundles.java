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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;
import io.swagger.annotations.ApiModel;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.killbill.billing.ObjectType;
import org.killbill.billing.account.api.Account;
import org.killbill.billing.account.api.MutableAccountData;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.util.audit.AccountAuditLogs;
import org.killbill.billing.util.customfield.CustomField;

import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.util.*;

@ApiModel(value="Account", parent = JsonBase.class)
public class AccountJsonWithBundles extends AccountJson {


    //List of bundle to be send with account

    private Collection<BundleJson> bundles;

    public AccountJsonWithBundles(AccountJson accountJson, Collection<BundleJson> bundles) {
        super(accountJson.getAccountId(),
                accountJson.getName(),
                accountJson.getFirstNameLength(),
                accountJson.getExternalKey(),
                accountJson.getEmail(),
                accountJson.getBillCycleDayLocal(),
                accountJson.getCurrency(),
                accountJson.getParentAccountId(),
                accountJson.isPaymentDelegatedToParent(),
                accountJson.getPaymentMethodId(),
                accountJson.getReferenceTime(),
                accountJson.getTimeZone(),
                accountJson.getAddress1(),
                accountJson.getAddress2(),
                accountJson.getPostalCode(),
                accountJson.getCompany(),
                accountJson.getCity(),
                accountJson.getState(),
                accountJson.getCountry(),
                accountJson.getLocale(),
                accountJson.getPhone(),
                accountJson.getNotes(),
                accountJson.isMigrated(),
                accountJson.getAccountBalance(),
                accountJson.getAccountCBA(),
                accountJson.getAuditLogs(),
                accountJson.getTitle(),
                accountJson.getMiddleName(),
                accountJson.getLastName(),
                accountJson.getDob(),
                accountJson.getGender(),
                accountJson.getNationality(),
                accountJson.getIdNumber(),
                accountJson.getLandline(),
                accountJson.getOther(),
                accountJson.getSuburb(),
                accountJson.getUploadFile());
        this.bundles = bundles;
    }

    public Collection<BundleJson> getBundles() {
        return bundles;
    }

    public void setBundles(Collection<BundleJson> bundles) {
        this.bundles = bundles;
    }
}
