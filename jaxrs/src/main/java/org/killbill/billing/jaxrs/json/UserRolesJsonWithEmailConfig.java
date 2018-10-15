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

package org.killbill.billing.jaxrs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value="UserRolesWithEmailConfig")
public class UserRolesJsonWithEmailConfig extends UserRolesJson{

    @ApiModelProperty(required = true)
    private final String imapUsername;
    @ApiModelProperty(required = true)
    private final String imapPassword;
    @ApiModelProperty(required = true)
    private final String imapHost;

    @JsonCreator
    public UserRolesJsonWithEmailConfig(@JsonProperty("name") final String name,
                                        @JsonProperty("surname") final String surname,
                                        @JsonProperty("mobileNumber") final String mobileNumber,
                                        @JsonProperty("username") final String username,
                                        @JsonProperty("password") final String password,
                                        @JsonProperty("roles") final List<String> roles,
                                        @JsonProperty("imapUsername") String imapUsername,
                                        @JsonProperty("imapPassword") String imapPassword,
                                        @JsonProperty("imapHost") String imapHost) {
        super(name, surname, mobileNumber, username, password, roles);
        this.imapUsername = imapUsername;
        this.imapPassword = imapPassword;
        this.imapHost = imapHost;

    }

    public String getImapUsername() {
        return imapUsername;
    }

    public String getImapPassword() {
        return imapPassword;
    }

    public String getImapHost() {
        return imapHost;
    }
}
