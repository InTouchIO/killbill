package org.killbill.custom.account.api;

import org.killbill.billing.account.api.Account;
import org.killbill.billing.util.callcontext.TenantContext;
import org.killbill.billing.util.entity.Pagination;

public interface CustomerAccountUserApi {


    public Pagination<Account> getNonBlockedAccounts(Long offset, Long limit, TenantContext context);
}
