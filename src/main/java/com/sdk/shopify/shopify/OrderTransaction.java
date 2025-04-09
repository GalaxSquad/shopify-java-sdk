// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A payment transaction in the context of an order.
*/
public class OrderTransaction extends AbstractResponse<OrderTransaction> implements Node, StoreCreditAccountTransactionOrigin {
    public OrderTransaction() {
    }

    public OrderTransaction(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accountNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "amountRoundingSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "authorizationCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "authorizationExpiresAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "errorCode": {
                    OrderTransactionErrorCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = OrderTransactionErrorCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fees": {
                    List<TransactionFee> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TransactionFee(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "formattedGateway": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gateway": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "kind": {
                    responseData.put(key, OrderTransactionKind.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "manualPaymentGateway": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "manuallyCapturable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "maximumRefundableV2": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "multiCapturable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "parentTransaction": {
                    OrderTransaction optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderTransaction(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentDetails": {
                    PaymentDetails optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownPaymentDetails.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentIcon": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "processedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "receiptJson": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "settlementCurrency": {
                    CurrencyCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "settlementCurrencyRate": {
                    BigDecimal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BigDecimal(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopifyPaymentsSet": {
                    ShopifyPaymentsTransactionSet optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsTransactionSet(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, OrderTransactionStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "test": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "totalUnsettledSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "user": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public OrderTransaction(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "OrderTransaction";
    }

    /**
    * The masked account number associated with the payment method.
    */

    public String getAccountNumber() {
        return (String) get("accountNumber");
    }

    public OrderTransaction setAccountNumber(String arg) {
        optimisticData.put(getKey("accountNumber"), arg);
        return this;
    }

    /**
    * The rounding adjustment applied on the cash amount in shop and presentment currencies.
    */

    public MoneyBag getAmountRoundingSet() {
        return (MoneyBag) get("amountRoundingSet");
    }

    public OrderTransaction setAmountRoundingSet(MoneyBag arg) {
        optimisticData.put(getKey("amountRoundingSet"), arg);
        return this;
    }

    /**
    * The amount and currency of the transaction in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public OrderTransaction setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * Authorization code associated with the transaction.
    */

    public String getAuthorizationCode() {
        return (String) get("authorizationCode");
    }

    public OrderTransaction setAuthorizationCode(String arg) {
        optimisticData.put(getKey("authorizationCode"), arg);
        return this;
    }

    /**
    * The time when the authorization expires. This field is available only to stores on a Shopify Plus
    * plan.
    */

    public String getAuthorizationExpiresAt() {
        return (String) get("authorizationExpiresAt");
    }

    public OrderTransaction setAuthorizationExpiresAt(String arg) {
        optimisticData.put(getKey("authorizationExpiresAt"), arg);
        return this;
    }

    /**
    * Date and time when the transaction was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public OrderTransaction setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A standardized error code, independent of the payment provider.
    */

    public OrderTransactionErrorCode getErrorCode() {
        return (OrderTransactionErrorCode) get("errorCode");
    }

    public OrderTransaction setErrorCode(OrderTransactionErrorCode arg) {
        optimisticData.put(getKey("errorCode"), arg);
        return this;
    }

    /**
    * The transaction fees charged on the order transaction. Only present for Shopify Payments
    * transactions.
    */

    public List<TransactionFee> getFees() {
        return (List<TransactionFee>) get("fees");
    }

    public OrderTransaction setFees(List<TransactionFee> arg) {
        optimisticData.put(getKey("fees"), arg);
        return this;
    }

    /**
    * The human-readable payment gateway name used to process the transaction.
    */

    public String getFormattedGateway() {
        return (String) get("formattedGateway");
    }

    public OrderTransaction setFormattedGateway(String arg) {
        optimisticData.put(getKey("formattedGateway"), arg);
        return this;
    }

    /**
    * The payment gateway used to process the transaction.
    */

    public String getGateway() {
        return (String) get("gateway");
    }

    public OrderTransaction setGateway(String arg) {
        optimisticData.put(getKey("gateway"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The kind of transaction.
    */

    public OrderTransactionKind getKind() {
        return (OrderTransactionKind) get("kind");
    }

    public OrderTransaction setKind(OrderTransactionKind arg) {
        optimisticData.put(getKey("kind"), arg);
        return this;
    }

    /**
    * Whether the transaction is processed by manual payment gateway.
    */

    public Boolean getManualPaymentGateway() {
        return (Boolean) get("manualPaymentGateway");
    }

    public OrderTransaction setManualPaymentGateway(Boolean arg) {
        optimisticData.put(getKey("manualPaymentGateway"), arg);
        return this;
    }

    /**
    * Whether the transaction can be manually captured.
    */

    public Boolean getManuallyCapturable() {
        return (Boolean) get("manuallyCapturable");
    }

    public OrderTransaction setManuallyCapturable(Boolean arg) {
        optimisticData.put(getKey("manuallyCapturable"), arg);
        return this;
    }

    /**
    * Specifies the available amount with currency to refund on the gateway.
    * This value is only available for transactions of type `SuggestedRefund`.
    */

    public MoneyV2 getMaximumRefundableV2() {
        return (MoneyV2) get("maximumRefundableV2");
    }

    public OrderTransaction setMaximumRefundableV2(MoneyV2 arg) {
        optimisticData.put(getKey("maximumRefundableV2"), arg);
        return this;
    }

    /**
    * Whether the transaction can be captured multiple times.
    */

    public Boolean getMultiCapturable() {
        return (Boolean) get("multiCapturable");
    }

    public OrderTransaction setMultiCapturable(Boolean arg) {
        optimisticData.put(getKey("multiCapturable"), arg);
        return this;
    }

    /**
    * The associated order.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public OrderTransaction setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The associated parent transaction, for example the authorization of a capture.
    */

    public OrderTransaction getParentTransaction() {
        return (OrderTransaction) get("parentTransaction");
    }

    public OrderTransaction setParentTransaction(OrderTransaction arg) {
        optimisticData.put(getKey("parentTransaction"), arg);
        return this;
    }

    /**
    * The payment details for the transaction.
    */

    public PaymentDetails getPaymentDetails() {
        return (PaymentDetails) get("paymentDetails");
    }

    public OrderTransaction setPaymentDetails(PaymentDetails arg) {
        optimisticData.put(getKey("paymentDetails"), arg);
        return this;
    }

    /**
    * The payment icon to display for the transaction.
    */

    public Image getPaymentIcon() {
        return (Image) get("paymentIcon");
    }

    public OrderTransaction setPaymentIcon(Image arg) {
        optimisticData.put(getKey("paymentIcon"), arg);
        return this;
    }

    /**
    * The payment ID associated with the transaction.
    */

    public String getPaymentId() {
        return (String) get("paymentId");
    }

    public OrderTransaction setPaymentId(String arg) {
        optimisticData.put(getKey("paymentId"), arg);
        return this;
    }

    /**
    * Date and time when the transaction was processed.
    */

    public String getProcessedAt() {
        return (String) get("processedAt");
    }

    public OrderTransaction setProcessedAt(String arg) {
        optimisticData.put(getKey("processedAt"), arg);
        return this;
    }

    /**
    * The transaction receipt that the payment gateway attaches to the transaction.
    * The value of this field depends on which payment gateway processed the transaction.
    */

    public String getReceiptJson() {
        return (String) get("receiptJson");
    }

    public OrderTransaction setReceiptJson(String arg) {
        optimisticData.put(getKey("receiptJson"), arg);
        return this;
    }

    /**
    * The settlement currency.
    */

    public CurrencyCode getSettlementCurrency() {
        return (CurrencyCode) get("settlementCurrency");
    }

    public OrderTransaction setSettlementCurrency(CurrencyCode arg) {
        optimisticData.put(getKey("settlementCurrency"), arg);
        return this;
    }

    /**
    * The rate used when converting the transaction amount to settlement currency.
    */

    public BigDecimal getSettlementCurrencyRate() {
        return (BigDecimal) get("settlementCurrencyRate");
    }

    public OrderTransaction setSettlementCurrencyRate(BigDecimal arg) {
        optimisticData.put(getKey("settlementCurrencyRate"), arg);
        return this;
    }

    /**
    * Contains all Shopify Payments information related to an order transaction. This field is available
    * only to stores on a Shopify Plus plan.
    */

    public ShopifyPaymentsTransactionSet getShopifyPaymentsSet() {
        return (ShopifyPaymentsTransactionSet) get("shopifyPaymentsSet");
    }

    public OrderTransaction setShopifyPaymentsSet(ShopifyPaymentsTransactionSet arg) {
        optimisticData.put(getKey("shopifyPaymentsSet"), arg);
        return this;
    }

    /**
    * The status of this transaction.
    */

    public OrderTransactionStatus getStatus() {
        return (OrderTransactionStatus) get("status");
    }

    public OrderTransaction setStatus(OrderTransactionStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Whether the transaction is a test transaction.
    */

    public Boolean getTest() {
        return (Boolean) get("test");
    }

    public OrderTransaction setTest(Boolean arg) {
        optimisticData.put(getKey("test"), arg);
        return this;
    }

    /**
    * Specifies the available amount with currency to capture on the gateway in shop and presentment
    * currencies.
    * Only available when an amount is capturable or manually mark as paid.
    */

    public MoneyBag getTotalUnsettledSet() {
        return (MoneyBag) get("totalUnsettledSet");
    }

    public OrderTransaction setTotalUnsettledSet(MoneyBag arg) {
        optimisticData.put(getKey("totalUnsettledSet"), arg);
        return this;
    }

    /**
    * Staff member who was logged into the Shopify POS device when the transaction was processed.
    */

    public StaffMember getUser() {
        return (StaffMember) get("user");
    }

    public OrderTransaction setUser(StaffMember arg) {
        optimisticData.put(getKey("user"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accountNumber": return false;

            case "amountRoundingSet": return true;

            case "amountSet": return true;

            case "authorizationCode": return false;

            case "authorizationExpiresAt": return false;

            case "createdAt": return false;

            case "errorCode": return false;

            case "fees": return true;

            case "formattedGateway": return false;

            case "gateway": return false;

            case "id": return false;

            case "kind": return false;

            case "manualPaymentGateway": return false;

            case "manuallyCapturable": return false;

            case "maximumRefundableV2": return true;

            case "multiCapturable": return false;

            case "order": return true;

            case "parentTransaction": return true;

            case "paymentDetails": return false;

            case "paymentIcon": return true;

            case "paymentId": return false;

            case "processedAt": return false;

            case "receiptJson": return false;

            case "settlementCurrency": return false;

            case "settlementCurrencyRate": return false;

            case "shopifyPaymentsSet": return true;

            case "status": return false;

            case "test": return false;

            case "totalUnsettledSet": return true;

            case "user": return true;

            default: return false;
        }
    }
}

