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

package org.killbill.billing.util.security.api;

import java.util.List;

import org.killbill.billing.security.RequiresPermissions;
import org.killbill.billing.security.SecurityApiException;
import org.killbill.billing.util.callcontext.CallContext;
import org.killbill.billing.util.security.shiro.dao.UserModelDao;

import static org.killbill.billing.security.Permission.USER_CAN_CREATE;

public interface CustomSecurityApi {

    /**
     * Add a user with roles in the Shiro store (JDBCRealm)
     *
     * @param username       the username
     * @param clearPassword  the password (in clear)
     * @param roles          the list of (existing) roles
     * @param context        context (does not include tenant nor account info)
     * @throws SecurityApiException
     */
    @RequiresPermissions(USER_CAN_CREATE)
    public void addUserRoles(String name, String surname, String mobileNumber, String username, String clearPassword, List<String> roles, CallContext context) throws SecurityApiException;


    /**
     * @param username
     */
    public UserModelDao getByUsername(String username) throws SecurityApiException;

    /**
     * 
     * @param username
     * @param imapUsername
     * @param imapPassword
     * @param imapHost
     * @param createdBy
     * @throws SecurityApiException
     */
    public void updateEmailConfig( String username, String imapUsername, String imapPassword, String imapHost, String createdBy) throws SecurityApiException;

}