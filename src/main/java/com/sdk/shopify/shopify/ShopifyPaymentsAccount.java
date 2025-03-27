// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Balance and payout information for a
* [Shopify
* Payments](https://help.shopify.com/manual/payments/shopify-payments/getting-paid-with-shopify-paymen
* ts)
* account. Balance includes all balances for the currencies supported by the shop.
* You can also query for a list of payouts, where each payout includes the corresponding currencyCode
* field.
*/
public class ShopifyPaymentsAccount extends AbstractResponse<ShopifyPaymentsAccount> implements Node {
    public ShopifyPaymentsAccount() {
    }

    public ShopifyPaymentsAccount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accountOpenerName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "activated": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "balance": {
                    List<MoneyV2> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MoneyV2(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "balanceTransactions": {
                    responseData.put(key, new ShopifyPaymentsBalanceTransactionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "bankAccounts": {
                    responseData.put(key, new ShopifyPaymentsBankAccountConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "chargeStatementDescriptors": {
                    ShopifyPaymentsChargeStatementDescriptor optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownShopifyPaymentsChargeStatementDescriptor.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "defaultCurrency": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "disputes": {
                    responseData.put(key, new ShopifyPaymentsDisputeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "onboardable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "payoutSchedule": {
                    responseData.put(key, new ShopifyPaymentsPayoutSchedule(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "payoutStatementDescriptor": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "payouts": {
                    responseData.put(key, new ShopifyPaymentsPayoutConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public ShopifyPaymentsAccount(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsAccount";
    }

    /**
    * The name of the account opener.
    */

    public String getAccountOpenerName() {
        return (String) get("accountOpenerName");
    }

    public ShopifyPaymentsAccount setAccountOpenerName(String arg) {
        optimisticData.put(getKey("accountOpenerName"), arg);
        return this;
    }

    /**
    * Whether the Shopify Payments setup is completed.
    */

    public Boolean getActivated() {
        return (Boolean) get("activated");
    }

    public ShopifyPaymentsAccount setActivated(Boolean arg) {
        optimisticData.put(getKey("activated"), arg);
        return this;
    }

    /**
    * Current balances in all currencies for the account.
    */

    public List<MoneyV2> getBalance() {
        return (List<MoneyV2>) get("balance");
    }

    public ShopifyPaymentsAccount setBalance(List<MoneyV2> arg) {
        optimisticData.put(getKey("balance"), arg);
        return this;
    }

    /**
    * A list of balance transactions associated with the shop.
    */

    public ShopifyPaymentsBalanceTransactionConnection getBalanceTransactions() {
        return (ShopifyPaymentsBalanceTransactionConnection) get("balanceTransactions");
    }

    public ShopifyPaymentsAccount setBalanceTransactions(ShopifyPaymentsBalanceTransactionConnection arg) {
        optimisticData.put(getKey("balanceTransactions"), arg);
        return this;
    }

    /**
    * All bank accounts configured for the Shopify Payments account.
    */

    public ShopifyPaymentsBankAccountConnection getBankAccounts() {
        return (ShopifyPaymentsBankAccountConnection) get("bankAccounts");
    }

    public ShopifyPaymentsAccount setBankAccounts(ShopifyPaymentsBankAccountConnection arg) {
        optimisticData.put(getKey("bankAccounts"), arg);
        return this;
    }

    /**
    * The statement descriptors used for charges.
    * These descriptors appear on a customer's credit card or bank statement when they make a purchase.
    */

    public ShopifyPaymentsChargeStatementDescriptor getChargeStatementDescriptors() {
        return (ShopifyPaymentsChargeStatementDescriptor) get("chargeStatementDescriptors");
    }

    public ShopifyPaymentsAccount setChargeStatementDescriptors(ShopifyPaymentsChargeStatementDescriptor arg) {
        optimisticData.put(getKey("chargeStatementDescriptors"), arg);
        return this;
    }

    /**
    * The Shopify Payments account country.
    */

    public String getCountry() {
        return (String) get("country");
    }

    public ShopifyPaymentsAccount setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The default payout currency for the Shopify Payments account.
    */

    public CurrencyCode getDefaultCurrency() {
        return (CurrencyCode) get("defaultCurrency");
    }

    public ShopifyPaymentsAccount setDefaultCurrency(CurrencyCode arg) {
        optimisticData.put(getKey("defaultCurrency"), arg);
        return this;
    }

    /**
    * All disputes that originated from a transaction made with the Shopify Payments account.
    */

    public ShopifyPaymentsDisputeConnection getDisputes() {
        return (ShopifyPaymentsDisputeConnection) get("disputes");
    }

    public ShopifyPaymentsAccount setDisputes(ShopifyPaymentsDisputeConnection arg) {
        optimisticData.put(getKey("disputes"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether the Shopify Payments account can be onboarded.
    */

    public Boolean getOnboardable() {
        return (Boolean) get("onboardable");
    }

    public ShopifyPaymentsAccount setOnboardable(Boolean arg) {
        optimisticData.put(getKey("onboardable"), arg);
        return this;
    }

    /**
    * The payout schedule for the account.
    */

    public ShopifyPaymentsPayoutSchedule getPayoutSchedule() {
        return (ShopifyPaymentsPayoutSchedule) get("payoutSchedule");
    }

    public ShopifyPaymentsAccount setPayoutSchedule(ShopifyPaymentsPayoutSchedule arg) {
        optimisticData.put(getKey("payoutSchedule"), arg);
        return this;
    }

    /**
    * The descriptor used for payouts.
    * The descriptor appears on a merchant's bank statement when they receive a payout.
    */

    public String getPayoutStatementDescriptor() {
        return (String) get("payoutStatementDescriptor");
    }

    public ShopifyPaymentsAccount setPayoutStatementDescriptor(String arg) {
        optimisticData.put(getKey("payoutStatementDescriptor"), arg);
        return this;
    }

    /**
    * All current and previous payouts made between the account and the bank account.
    */

    public ShopifyPaymentsPayoutConnection getPayouts() {
        return (ShopifyPaymentsPayoutConnection) get("payouts");
    }

    public ShopifyPaymentsAccount setPayouts(ShopifyPaymentsPayoutConnection arg) {
        optimisticData.put(getKey("payouts"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accountOpenerName": return false;

            case "activated": return false;

            case "balance": return true;

            case "balanceTransactions": return true;

            case "bankAccounts": return true;

            case "chargeStatementDescriptors": return false;

            case "country": return false;

            case "defaultCurrency": return false;

            case "disputes": return true;

            case "id": return false;

            case "onboardable": return false;

            case "payoutSchedule": return true;

            case "payoutStatementDescriptor": return false;

            case "payouts": return true;

            default: return false;
        }
    }
}

