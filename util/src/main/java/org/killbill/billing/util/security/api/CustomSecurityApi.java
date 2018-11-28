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
     * @param username      the username
     * @param clearPassword the password (in clear)
     * @param roles         the list of (existing) roles
     * @param context       context (does not include tenant nor account info)
     * @throws SecurityApiException
     */
    @RequiresPermissions(USER_CAN_CREATE)
    public void addUserRoles(String name, String surname, String mobileNumber, String username, String clearPassword, List<String> roles, CallContext context) throws SecurityApiException;


    /**
     * @param username
     */
    public UserModelDao getByUsername(String username) throws SecurityApiException;

    /**
     * @param username
     * @param name
     * @param surname
     * @param mobileNumber
     * @param imapUsername
     * @param imapPassword
     * @param imapHost
     * @param createdBy
     * @throws SecurityApiException
     */
    public void updateEmailConfig(String username, String name, String surname, String mobileNumber, String imapUsername, String imapPassword, String imapHost, String createdBy) throws SecurityApiException;

}