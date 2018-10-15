package org.killbill.billing.invoice.api;

import org.killbill.billing.callcontext.InternalTenantContext;
import org.killbill.billing.util.callcontext.TenantContext;

public interface CustomInvoiceUserApi {


    /**
     * @param invoiceItem
     * @param quantity     Non negative quantity to be adjusted.
     * @param description  Optional description to to add to invoice item.
     * @param tenantContext tanent context
     * @throws InvoiceApiException
     */
    void adjustInvoiceItemsQuantityById(final InvoiceItem invoiceItem, final Integer quantity, final String description, final TenantContext tenantContext) throws InvoiceApiException;
}
