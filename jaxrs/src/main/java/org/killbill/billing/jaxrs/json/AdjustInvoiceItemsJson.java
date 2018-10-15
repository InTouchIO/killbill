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
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.killbill.billing.ObjectType;
import org.killbill.billing.account.api.Account;
import org.killbill.billing.account.api.MutableAccountData;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.util.audit.AccountAuditLogs;
import org.killbill.billing.util.customfield.CustomField;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.*;

@ApiModel(value="AdjustInvoiceItemsJson", parent = JsonBase.class)
public class AdjustInvoiceItemsJson extends JsonBase {

    @ApiModelProperty(required = true)
    private final UUID accountId;
    @ApiModelProperty(required = true)
    private final UUID invoiceItemId;
    @ApiModelProperty(required = true)
    private final Integer quantity;
    private final String description;

    @JsonCreator
    public AdjustInvoiceItemsJson(@JsonProperty("accountId")  UUID accountId,
                                  @JsonProperty("invoiceItemId")  UUID invoiceItemId,
                                  @JsonProperty("quantity")  Integer quantity,
                                  @JsonProperty("description")  String description) {
        this.accountId = accountId;
        this.invoiceItemId = invoiceItemId;
        this.quantity = quantity;
        this.description = description;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public UUID getInvoiceItemId() {
        return invoiceItemId;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
