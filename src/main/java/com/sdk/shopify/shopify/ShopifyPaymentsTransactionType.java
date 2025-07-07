// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* The possible types of transactions.
*/
public enum ShopifyPaymentsTransactionType {
    /**
    * The adjustment transaction type.
    */
    ADJUSTMENT,

    /**
    * The advance transaction type.
    */
    ADVANCE,

    /**
    * The advance funding transaction type.
    */
    ADVANCE_FUNDING,

    /**
    * The anomaly_credit transaction type.
    */
    ANOMALY_CREDIT,

    /**
    * The anomaly_credit_reversal transaction type.
    */
    ANOMALY_CREDIT_REVERSAL,

    /**
    * The anomaly_debit transaction type.
    */
    ANOMALY_DEBIT,

    /**
    * The anomaly_debit_reversal transaction type.
    */
    ANOMALY_DEBIT_REVERSAL,

    /**
    * The application_fee_refund transaction type.
    */
    APPLICATION_FEE_REFUND,

    /**
    * The balance_transfer_inbound transaction type.
    */
    BALANCE_TRANSFER_INBOUND,

    /**
    * The billing_debit transaction type.
    */
    BILLING_DEBIT,

    /**
    * The billing_debit_reversal transaction type.
    */
    BILLING_DEBIT_REVERSAL,

    /**
    * The channel_credit transaction type.
    */
    CHANNEL_CREDIT,

    /**
    * The channel_credit_reversal transaction type.
    */
    CHANNEL_CREDIT_REVERSAL,

    /**
    * The channel_promotion_credit transaction type.
    */
    CHANNEL_PROMOTION_CREDIT,

    /**
    * The channel_promotion_credit_reversal transaction type.
    */
    CHANNEL_PROMOTION_CREDIT_REVERSAL,

    /**
    * The channel_transfer_credit transaction type.
    */
    CHANNEL_TRANSFER_CREDIT,

    /**
    * The channel_transfer_credit_reversal transaction type.
    */
    CHANNEL_TRANSFER_CREDIT_REVERSAL,

    /**
    * The channel_transfer_debit transaction type.
    */
    CHANNEL_TRANSFER_DEBIT,

    /**
    * The channel_transfer_debit_reversal transaction type.
    */
    CHANNEL_TRANSFER_DEBIT_REVERSAL,

    /**
    * The charge transaction type.
    */
    CHARGE,

    /**
    * The chargeback_fee transaction type.
    */
    CHARGEBACK_FEE,

    /**
    * The chargeback_fee_refund transaction type.
    */
    CHARGEBACK_FEE_REFUND,

    /**
    * The chargeback_hold transaction type.
    */
    CHARGEBACK_HOLD,

    /**
    * The chargeback_hold_release transaction type.
    */
    CHARGEBACK_HOLD_RELEASE,

    /**
    * The chargeback_protection_credit transaction type.
    */
    CHARGEBACK_PROTECTION_CREDIT,

    /**
    * The chargeback_protection_credit_reversal transaction type.
    */
    CHARGEBACK_PROTECTION_CREDIT_REVERSAL,

    /**
    * The chargeback_protection_debit transaction type.
    */
    CHARGEBACK_PROTECTION_DEBIT,

    /**
    * The chargeback_protection_debit_reversal transaction type.
    */
    CHARGEBACK_PROTECTION_DEBIT_REVERSAL,

    /**
    * The charge_adjustment transaction type.
    */
    CHARGE_ADJUSTMENT,

    /**
    * The collections_credit transaction type.
    */
    COLLECTIONS_CREDIT,

    /**
    * The collections_credit_reversal transaction type.
    */
    COLLECTIONS_CREDIT_REVERSAL,

    /**
    * The customs_duty transaction type.
    */
    CUSTOMS_DUTY,

    /**
    * The customs_duty_adjustment transaction type.
    */
    CUSTOMS_DUTY_ADJUSTMENT,

    /**
    * The dispute_reversal transaction type.
    */
    DISPUTE_REVERSAL,

    /**
    * The dispute_withdrawal transaction type.
    */
    DISPUTE_WITHDRAWAL,

    /**
    * The import_tax transaction type.
    */
    IMPORT_TAX,

    /**
    * The import_tax_adjustment transaction type.
    */
    IMPORT_TAX_ADJUSTMENT,

    /**
    * The tax refund transaction type.
    */
    IMPORT_TAX_REFUND,

    /**
    * The marketplace_fee_credit transaction type.
    */
    MARKETPLACE_FEE_CREDIT,

    /**
    * The marketplace_fee_credit_reversal transaction type.
    */
    MARKETPLACE_FEE_CREDIT_REVERSAL,

    /**
    * The markets_pro_credit transaction type.
    */
    MARKETS_PRO_CREDIT,

    /**
    * The merchant_goodwill_credit transaction type.
    */
    MERCHANT_GOODWILL_CREDIT,

    /**
    * The merchant_goodwill_credit_reversal transaction type.
    */
    MERCHANT_GOODWILL_CREDIT_REVERSAL,

    /**
    * The merchant_to_merchant_credit transaction type.
    */
    MERCHANT_TO_MERCHANT_CREDIT,

    /**
    * The merchant_to_merchant_credit_reversal transaction type.
    */
    MERCHANT_TO_MERCHANT_CREDIT_REVERSAL,

    /**
    * The merchant_to_merchant_debit transaction type.
    */
    MERCHANT_TO_MERCHANT_DEBIT,

    /**
    * The merchant_to_merchant_debit_reversal transaction type.
    */
    MERCHANT_TO_MERCHANT_DEBIT_REVERSAL,

    /**
    * The promotion_credit transaction type.
    */
    PROMOTION_CREDIT,

    /**
    * The promotion_credit_reversal transaction type.
    */
    PROMOTION_CREDIT_REVERSAL,

    /**
    * The refund transaction type.
    */
    REFUND,

    /**
    * The refund_adjustment transaction type.
    */
    REFUND_ADJUSTMENT,

    /**
    * The refund_failure transaction type.
    */
    REFUND_FAILURE,

    /**
    * The reserved_funds transaction type.
    */
    RESERVED_FUNDS,

    /**
    * The reserved_funds_reversal transaction type.
    */
    RESERVED_FUNDS_REVERSAL,

    /**
    * The reserved_funds_withdrawal transaction type.
    */
    RESERVED_FUNDS_WITHDRAWAL,

    /**
    * The risk_reversal transaction type.
    */
    RISK_REVERSAL,

    /**
    * The risk_withdrawal transaction type.
    */
    RISK_WITHDRAWAL,

    /**
    * The seller_protection_credit transaction type.
    */
    SELLER_PROTECTION_CREDIT,

    /**
    * The seller_protection_credit_reversal transaction type.
    */
    SELLER_PROTECTION_CREDIT_REVERSAL,

    /**
    * The shipping_label transaction type.
    */
    SHIPPING_LABEL,

    /**
    * The shipping_label_adjustment transaction type.
    */
    SHIPPING_LABEL_ADJUSTMENT,

    /**
    * The shipping_label_adjustment_base transaction type.
    */
    SHIPPING_LABEL_ADJUSTMENT_BASE,

    /**
    * The shipping_label_adjustment_surcharge transaction type.
    */
    SHIPPING_LABEL_ADJUSTMENT_SURCHARGE,

    /**
    * The shipping_other_carrier_charge_adjustment transaction type.
    */
    SHIPPING_OTHER_CARRIER_CHARGE_ADJUSTMENT,

    /**
    * The shipping_return_to_origin_adjustment transaction type.
    */
    SHIPPING_RETURN_TO_ORIGIN_ADJUSTMENT,

    /**
    * The shopify_collective_credit transaction type.
    */
    SHOPIFY_COLLECTIVE_CREDIT,

    /**
    * The shopify_collective_credit_reversal transaction type.
    */
    SHOPIFY_COLLECTIVE_CREDIT_REVERSAL,

    /**
    * The shopify_collective_debit transaction type.
    */
    SHOPIFY_COLLECTIVE_DEBIT,

    /**
    * The shopify_collective_debit_reversal transaction type.
    */
    SHOPIFY_COLLECTIVE_DEBIT_REVERSAL,

    /**
    * The shopify_source_credit transaction type.
    */
    SHOPIFY_SOURCE_CREDIT,

    /**
    * The shopify_source_credit_reversal transaction type.
    */
    SHOPIFY_SOURCE_CREDIT_REVERSAL,

    /**
    * The shopify_source_debit transaction type.
    */
    SHOPIFY_SOURCE_DEBIT,

    /**
    * The shopify_source_debit_reversal transaction type.
    */
    SHOPIFY_SOURCE_DEBIT_REVERSAL,

    /**
    * The shop_cash_billing_debit transaction type.
    */
    SHOP_CASH_BILLING_DEBIT,

    /**
    * The shop_cash_billing_debit_reversal transaction type.
    */
    SHOP_CASH_BILLING_DEBIT_REVERSAL,

    /**
    * The shop_cash_campaign_billing_credit transaction type.
    */
    SHOP_CASH_CAMPAIGN_BILLING_CREDIT,

    /**
    * The shop_cash_campaign_billing_credit_reversal transaction type.
    */
    SHOP_CASH_CAMPAIGN_BILLING_CREDIT_REVERSAL,

    /**
    * The shop_cash_campaign_billing_debit transaction type.
    */
    SHOP_CASH_CAMPAIGN_BILLING_DEBIT,

    /**
    * The shop_cash_campaign_billing_debit_reversal transaction type.
    */
    SHOP_CASH_CAMPAIGN_BILLING_DEBIT_REVERSAL,

    /**
    * The shop_cash_credit transaction type.
    */
    SHOP_CASH_CREDIT,

    /**
    * The shop_cash_credit_reversal transaction type.
    */
    SHOP_CASH_CREDIT_REVERSAL,

    /**
    * The shop_cash_refund_debit transaction type.
    */
    SHOP_CASH_REFUND_DEBIT,

    /**
    * The shop_cash_refund_debit_reversal transaction type.
    */
    SHOP_CASH_REFUND_DEBIT_REVERSAL,

    /**
    * The stripe_fee transaction type.
    */
    STRIPE_FEE,

    /**
    * The tax_adjustment_credit transaction type.
    */
    TAX_ADJUSTMENT_CREDIT,

    /**
    * The tax_adjustment_credit_reversal transaction type.
    */
    TAX_ADJUSTMENT_CREDIT_REVERSAL,

    /**
    * The tax_adjustment_debit transaction type.
    */
    TAX_ADJUSTMENT_DEBIT,

    /**
    * The tax_adjustment_debit_reversal transaction type.
    */
    TAX_ADJUSTMENT_DEBIT_REVERSAL,

    /**
    * The transfer transaction type.
    */
    TRANSFER,

    /**
    * The transfer_cancel transaction type.
    */
    TRANSFER_CANCEL,

    /**
    * The transfer_failure transaction type.
    */
    TRANSFER_FAILURE,

    /**
    * The transfer_refund transaction type.
    */
    TRANSFER_REFUND,

    /**
    * The vat_refund_credit transaction type.
    */
    VAT_REFUND_CREDIT,

    /**
    * The vat_refund_credit_reversal transaction type.
    */
    VAT_REFUND_CREDIT_REVERSAL,

    UNKNOWN_VALUE;

    public static ShopifyPaymentsTransactionType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADJUSTMENT": {
                return ADJUSTMENT;
            }

            case "ADVANCE": {
                return ADVANCE;
            }

            case "ADVANCE_FUNDING": {
                return ADVANCE_FUNDING;
            }

            case "ANOMALY_CREDIT": {
                return ANOMALY_CREDIT;
            }

            case "ANOMALY_CREDIT_REVERSAL": {
                return ANOMALY_CREDIT_REVERSAL;
            }

            case "ANOMALY_DEBIT": {
                return ANOMALY_DEBIT;
            }

            case "ANOMALY_DEBIT_REVERSAL": {
                return ANOMALY_DEBIT_REVERSAL;
            }

            case "APPLICATION_FEE_REFUND": {
                return APPLICATION_FEE_REFUND;
            }

            case "BALANCE_TRANSFER_INBOUND": {
                return BALANCE_TRANSFER_INBOUND;
            }

            case "BILLING_DEBIT": {
                return BILLING_DEBIT;
            }

            case "BILLING_DEBIT_REVERSAL": {
                return BILLING_DEBIT_REVERSAL;
            }

            case "CHANNEL_CREDIT": {
                return CHANNEL_CREDIT;
            }

            case "CHANNEL_CREDIT_REVERSAL": {
                return CHANNEL_CREDIT_REVERSAL;
            }

            case "CHANNEL_PROMOTION_CREDIT": {
                return CHANNEL_PROMOTION_CREDIT;
            }

            case "CHANNEL_PROMOTION_CREDIT_REVERSAL": {
                return CHANNEL_PROMOTION_CREDIT_REVERSAL;
            }

            case "CHANNEL_TRANSFER_CREDIT": {
                return CHANNEL_TRANSFER_CREDIT;
            }

            case "CHANNEL_TRANSFER_CREDIT_REVERSAL": {
                return CHANNEL_TRANSFER_CREDIT_REVERSAL;
            }

            case "CHANNEL_TRANSFER_DEBIT": {
                return CHANNEL_TRANSFER_DEBIT;
            }

            case "CHANNEL_TRANSFER_DEBIT_REVERSAL": {
                return CHANNEL_TRANSFER_DEBIT_REVERSAL;
            }

            case "CHARGE": {
                return CHARGE;
            }

            case "CHARGEBACK_FEE": {
                return CHARGEBACK_FEE;
            }

            case "CHARGEBACK_FEE_REFUND": {
                return CHARGEBACK_FEE_REFUND;
            }

            case "CHARGEBACK_HOLD": {
                return CHARGEBACK_HOLD;
            }

            case "CHARGEBACK_HOLD_RELEASE": {
                return CHARGEBACK_HOLD_RELEASE;
            }

            case "CHARGEBACK_PROTECTION_CREDIT": {
                return CHARGEBACK_PROTECTION_CREDIT;
            }

            case "CHARGEBACK_PROTECTION_CREDIT_REVERSAL": {
                return CHARGEBACK_PROTECTION_CREDIT_REVERSAL;
            }

            case "CHARGEBACK_PROTECTION_DEBIT": {
                return CHARGEBACK_PROTECTION_DEBIT;
            }

            case "CHARGEBACK_PROTECTION_DEBIT_REVERSAL": {
                return CHARGEBACK_PROTECTION_DEBIT_REVERSAL;
            }

            case "CHARGE_ADJUSTMENT": {
                return CHARGE_ADJUSTMENT;
            }

            case "COLLECTIONS_CREDIT": {
                return COLLECTIONS_CREDIT;
            }

            case "COLLECTIONS_CREDIT_REVERSAL": {
                return COLLECTIONS_CREDIT_REVERSAL;
            }

            case "CUSTOMS_DUTY": {
                return CUSTOMS_DUTY;
            }

            case "CUSTOMS_DUTY_ADJUSTMENT": {
                return CUSTOMS_DUTY_ADJUSTMENT;
            }

            case "DISPUTE_REVERSAL": {
                return DISPUTE_REVERSAL;
            }

            case "DISPUTE_WITHDRAWAL": {
                return DISPUTE_WITHDRAWAL;
            }

            case "IMPORT_TAX": {
                return IMPORT_TAX;
            }

            case "IMPORT_TAX_ADJUSTMENT": {
                return IMPORT_TAX_ADJUSTMENT;
            }

            case "IMPORT_TAX_REFUND": {
                return IMPORT_TAX_REFUND;
            }

            case "MARKETPLACE_FEE_CREDIT": {
                return MARKETPLACE_FEE_CREDIT;
            }

            case "MARKETPLACE_FEE_CREDIT_REVERSAL": {
                return MARKETPLACE_FEE_CREDIT_REVERSAL;
            }

            case "MARKETS_PRO_CREDIT": {
                return MARKETS_PRO_CREDIT;
            }

            case "MERCHANT_GOODWILL_CREDIT": {
                return MERCHANT_GOODWILL_CREDIT;
            }

            case "MERCHANT_GOODWILL_CREDIT_REVERSAL": {
                return MERCHANT_GOODWILL_CREDIT_REVERSAL;
            }

            case "MERCHANT_TO_MERCHANT_CREDIT": {
                return MERCHANT_TO_MERCHANT_CREDIT;
            }

            case "MERCHANT_TO_MERCHANT_CREDIT_REVERSAL": {
                return MERCHANT_TO_MERCHANT_CREDIT_REVERSAL;
            }

            case "MERCHANT_TO_MERCHANT_DEBIT": {
                return MERCHANT_TO_MERCHANT_DEBIT;
            }

            case "MERCHANT_TO_MERCHANT_DEBIT_REVERSAL": {
                return MERCHANT_TO_MERCHANT_DEBIT_REVERSAL;
            }

            case "PROMOTION_CREDIT": {
                return PROMOTION_CREDIT;
            }

            case "PROMOTION_CREDIT_REVERSAL": {
                return PROMOTION_CREDIT_REVERSAL;
            }

            case "REFUND": {
                return REFUND;
            }

            case "REFUND_ADJUSTMENT": {
                return REFUND_ADJUSTMENT;
            }

            case "REFUND_FAILURE": {
                return REFUND_FAILURE;
            }

            case "RESERVED_FUNDS": {
                return RESERVED_FUNDS;
            }

            case "RESERVED_FUNDS_REVERSAL": {
                return RESERVED_FUNDS_REVERSAL;
            }

            case "RESERVED_FUNDS_WITHDRAWAL": {
                return RESERVED_FUNDS_WITHDRAWAL;
            }

            case "RISK_REVERSAL": {
                return RISK_REVERSAL;
            }

            case "RISK_WITHDRAWAL": {
                return RISK_WITHDRAWAL;
            }

            case "SELLER_PROTECTION_CREDIT": {
                return SELLER_PROTECTION_CREDIT;
            }

            case "SELLER_PROTECTION_CREDIT_REVERSAL": {
                return SELLER_PROTECTION_CREDIT_REVERSAL;
            }

            case "SHIPPING_LABEL": {
                return SHIPPING_LABEL;
            }

            case "SHIPPING_LABEL_ADJUSTMENT": {
                return SHIPPING_LABEL_ADJUSTMENT;
            }

            case "SHIPPING_LABEL_ADJUSTMENT_BASE": {
                return SHIPPING_LABEL_ADJUSTMENT_BASE;
            }

            case "SHIPPING_LABEL_ADJUSTMENT_SURCHARGE": {
                return SHIPPING_LABEL_ADJUSTMENT_SURCHARGE;
            }

            case "SHIPPING_OTHER_CARRIER_CHARGE_ADJUSTMENT": {
                return SHIPPING_OTHER_CARRIER_CHARGE_ADJUSTMENT;
            }

            case "SHIPPING_RETURN_TO_ORIGIN_ADJUSTMENT": {
                return SHIPPING_RETURN_TO_ORIGIN_ADJUSTMENT;
            }

            case "SHOPIFY_COLLECTIVE_CREDIT": {
                return SHOPIFY_COLLECTIVE_CREDIT;
            }

            case "SHOPIFY_COLLECTIVE_CREDIT_REVERSAL": {
                return SHOPIFY_COLLECTIVE_CREDIT_REVERSAL;
            }

            case "SHOPIFY_COLLECTIVE_DEBIT": {
                return SHOPIFY_COLLECTIVE_DEBIT;
            }

            case "SHOPIFY_COLLECTIVE_DEBIT_REVERSAL": {
                return SHOPIFY_COLLECTIVE_DEBIT_REVERSAL;
            }

            case "SHOPIFY_SOURCE_CREDIT": {
                return SHOPIFY_SOURCE_CREDIT;
            }

            case "SHOPIFY_SOURCE_CREDIT_REVERSAL": {
                return SHOPIFY_SOURCE_CREDIT_REVERSAL;
            }

            case "SHOPIFY_SOURCE_DEBIT": {
                return SHOPIFY_SOURCE_DEBIT;
            }

            case "SHOPIFY_SOURCE_DEBIT_REVERSAL": {
                return SHOPIFY_SOURCE_DEBIT_REVERSAL;
            }

            case "SHOP_CASH_BILLING_DEBIT": {
                return SHOP_CASH_BILLING_DEBIT;
            }

            case "SHOP_CASH_BILLING_DEBIT_REVERSAL": {
                return SHOP_CASH_BILLING_DEBIT_REVERSAL;
            }

            case "SHOP_CASH_CAMPAIGN_BILLING_CREDIT": {
                return SHOP_CASH_CAMPAIGN_BILLING_CREDIT;
            }

            case "SHOP_CASH_CAMPAIGN_BILLING_CREDIT_REVERSAL": {
                return SHOP_CASH_CAMPAIGN_BILLING_CREDIT_REVERSAL;
            }

            case "SHOP_CASH_CAMPAIGN_BILLING_DEBIT": {
                return SHOP_CASH_CAMPAIGN_BILLING_DEBIT;
            }

            case "SHOP_CASH_CAMPAIGN_BILLING_DEBIT_REVERSAL": {
                return SHOP_CASH_CAMPAIGN_BILLING_DEBIT_REVERSAL;
            }

            case "SHOP_CASH_CREDIT": {
                return SHOP_CASH_CREDIT;
            }

            case "SHOP_CASH_CREDIT_REVERSAL": {
                return SHOP_CASH_CREDIT_REVERSAL;
            }

            case "SHOP_CASH_REFUND_DEBIT": {
                return SHOP_CASH_REFUND_DEBIT;
            }

            case "SHOP_CASH_REFUND_DEBIT_REVERSAL": {
                return SHOP_CASH_REFUND_DEBIT_REVERSAL;
            }

            case "STRIPE_FEE": {
                return STRIPE_FEE;
            }

            case "TAX_ADJUSTMENT_CREDIT": {
                return TAX_ADJUSTMENT_CREDIT;
            }

            case "TAX_ADJUSTMENT_CREDIT_REVERSAL": {
                return TAX_ADJUSTMENT_CREDIT_REVERSAL;
            }

            case "TAX_ADJUSTMENT_DEBIT": {
                return TAX_ADJUSTMENT_DEBIT;
            }

            case "TAX_ADJUSTMENT_DEBIT_REVERSAL": {
                return TAX_ADJUSTMENT_DEBIT_REVERSAL;
            }

            case "TRANSFER": {
                return TRANSFER;
            }

            case "TRANSFER_CANCEL": {
                return TRANSFER_CANCEL;
            }

            case "TRANSFER_FAILURE": {
                return TRANSFER_FAILURE;
            }

            case "TRANSFER_REFUND": {
                return TRANSFER_REFUND;
            }

            case "VAT_REFUND_CREDIT": {
                return VAT_REFUND_CREDIT;
            }

            case "VAT_REFUND_CREDIT_REVERSAL": {
                return VAT_REFUND_CREDIT_REVERSAL;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADJUSTMENT: {
                return "ADJUSTMENT";
            }

            case ADVANCE: {
                return "ADVANCE";
            }

            case ADVANCE_FUNDING: {
                return "ADVANCE_FUNDING";
            }

            case ANOMALY_CREDIT: {
                return "ANOMALY_CREDIT";
            }

            case ANOMALY_CREDIT_REVERSAL: {
                return "ANOMALY_CREDIT_REVERSAL";
            }

            case ANOMALY_DEBIT: {
                return "ANOMALY_DEBIT";
            }

            case ANOMALY_DEBIT_REVERSAL: {
                return "ANOMALY_DEBIT_REVERSAL";
            }

            case APPLICATION_FEE_REFUND: {
                return "APPLICATION_FEE_REFUND";
            }

            case BALANCE_TRANSFER_INBOUND: {
                return "BALANCE_TRANSFER_INBOUND";
            }

            case BILLING_DEBIT: {
                return "BILLING_DEBIT";
            }

            case BILLING_DEBIT_REVERSAL: {
                return "BILLING_DEBIT_REVERSAL";
            }

            case CHANNEL_CREDIT: {
                return "CHANNEL_CREDIT";
            }

            case CHANNEL_CREDIT_REVERSAL: {
                return "CHANNEL_CREDIT_REVERSAL";
            }

            case CHANNEL_PROMOTION_CREDIT: {
                return "CHANNEL_PROMOTION_CREDIT";
            }

            case CHANNEL_PROMOTION_CREDIT_REVERSAL: {
                return "CHANNEL_PROMOTION_CREDIT_REVERSAL";
            }

            case CHANNEL_TRANSFER_CREDIT: {
                return "CHANNEL_TRANSFER_CREDIT";
            }

            case CHANNEL_TRANSFER_CREDIT_REVERSAL: {
                return "CHANNEL_TRANSFER_CREDIT_REVERSAL";
            }

            case CHANNEL_TRANSFER_DEBIT: {
                return "CHANNEL_TRANSFER_DEBIT";
            }

            case CHANNEL_TRANSFER_DEBIT_REVERSAL: {
                return "CHANNEL_TRANSFER_DEBIT_REVERSAL";
            }

            case CHARGE: {
                return "CHARGE";
            }

            case CHARGEBACK_FEE: {
                return "CHARGEBACK_FEE";
            }

            case CHARGEBACK_FEE_REFUND: {
                return "CHARGEBACK_FEE_REFUND";
            }

            case CHARGEBACK_HOLD: {
                return "CHARGEBACK_HOLD";
            }

            case CHARGEBACK_HOLD_RELEASE: {
                return "CHARGEBACK_HOLD_RELEASE";
            }

            case CHARGEBACK_PROTECTION_CREDIT: {
                return "CHARGEBACK_PROTECTION_CREDIT";
            }

            case CHARGEBACK_PROTECTION_CREDIT_REVERSAL: {
                return "CHARGEBACK_PROTECTION_CREDIT_REVERSAL";
            }

            case CHARGEBACK_PROTECTION_DEBIT: {
                return "CHARGEBACK_PROTECTION_DEBIT";
            }

            case CHARGEBACK_PROTECTION_DEBIT_REVERSAL: {
                return "CHARGEBACK_PROTECTION_DEBIT_REVERSAL";
            }

            case CHARGE_ADJUSTMENT: {
                return "CHARGE_ADJUSTMENT";
            }

            case COLLECTIONS_CREDIT: {
                return "COLLECTIONS_CREDIT";
            }

            case COLLECTIONS_CREDIT_REVERSAL: {
                return "COLLECTIONS_CREDIT_REVERSAL";
            }

            case CUSTOMS_DUTY: {
                return "CUSTOMS_DUTY";
            }

            case CUSTOMS_DUTY_ADJUSTMENT: {
                return "CUSTOMS_DUTY_ADJUSTMENT";
            }

            case DISPUTE_REVERSAL: {
                return "DISPUTE_REVERSAL";
            }

            case DISPUTE_WITHDRAWAL: {
                return "DISPUTE_WITHDRAWAL";
            }

            case IMPORT_TAX: {
                return "IMPORT_TAX";
            }

            case IMPORT_TAX_ADJUSTMENT: {
                return "IMPORT_TAX_ADJUSTMENT";
            }

            case IMPORT_TAX_REFUND: {
                return "IMPORT_TAX_REFUND";
            }

            case MARKETPLACE_FEE_CREDIT: {
                return "MARKETPLACE_FEE_CREDIT";
            }

            case MARKETPLACE_FEE_CREDIT_REVERSAL: {
                return "MARKETPLACE_FEE_CREDIT_REVERSAL";
            }

            case MARKETS_PRO_CREDIT: {
                return "MARKETS_PRO_CREDIT";
            }

            case MERCHANT_GOODWILL_CREDIT: {
                return "MERCHANT_GOODWILL_CREDIT";
            }

            case MERCHANT_GOODWILL_CREDIT_REVERSAL: {
                return "MERCHANT_GOODWILL_CREDIT_REVERSAL";
            }

            case MERCHANT_TO_MERCHANT_CREDIT: {
                return "MERCHANT_TO_MERCHANT_CREDIT";
            }

            case MERCHANT_TO_MERCHANT_CREDIT_REVERSAL: {
                return "MERCHANT_TO_MERCHANT_CREDIT_REVERSAL";
            }

            case MERCHANT_TO_MERCHANT_DEBIT: {
                return "MERCHANT_TO_MERCHANT_DEBIT";
            }

            case MERCHANT_TO_MERCHANT_DEBIT_REVERSAL: {
                return "MERCHANT_TO_MERCHANT_DEBIT_REVERSAL";
            }

            case PROMOTION_CREDIT: {
                return "PROMOTION_CREDIT";
            }

            case PROMOTION_CREDIT_REVERSAL: {
                return "PROMOTION_CREDIT_REVERSAL";
            }

            case REFUND: {
                return "REFUND";
            }

            case REFUND_ADJUSTMENT: {
                return "REFUND_ADJUSTMENT";
            }

            case REFUND_FAILURE: {
                return "REFUND_FAILURE";
            }

            case RESERVED_FUNDS: {
                return "RESERVED_FUNDS";
            }

            case RESERVED_FUNDS_REVERSAL: {
                return "RESERVED_FUNDS_REVERSAL";
            }

            case RESERVED_FUNDS_WITHDRAWAL: {
                return "RESERVED_FUNDS_WITHDRAWAL";
            }

            case RISK_REVERSAL: {
                return "RISK_REVERSAL";
            }

            case RISK_WITHDRAWAL: {
                return "RISK_WITHDRAWAL";
            }

            case SELLER_PROTECTION_CREDIT: {
                return "SELLER_PROTECTION_CREDIT";
            }

            case SELLER_PROTECTION_CREDIT_REVERSAL: {
                return "SELLER_PROTECTION_CREDIT_REVERSAL";
            }

            case SHIPPING_LABEL: {
                return "SHIPPING_LABEL";
            }

            case SHIPPING_LABEL_ADJUSTMENT: {
                return "SHIPPING_LABEL_ADJUSTMENT";
            }

            case SHIPPING_LABEL_ADJUSTMENT_BASE: {
                return "SHIPPING_LABEL_ADJUSTMENT_BASE";
            }

            case SHIPPING_LABEL_ADJUSTMENT_SURCHARGE: {
                return "SHIPPING_LABEL_ADJUSTMENT_SURCHARGE";
            }

            case SHIPPING_OTHER_CARRIER_CHARGE_ADJUSTMENT: {
                return "SHIPPING_OTHER_CARRIER_CHARGE_ADJUSTMENT";
            }

            case SHIPPING_RETURN_TO_ORIGIN_ADJUSTMENT: {
                return "SHIPPING_RETURN_TO_ORIGIN_ADJUSTMENT";
            }

            case SHOPIFY_COLLECTIVE_CREDIT: {
                return "SHOPIFY_COLLECTIVE_CREDIT";
            }

            case SHOPIFY_COLLECTIVE_CREDIT_REVERSAL: {
                return "SHOPIFY_COLLECTIVE_CREDIT_REVERSAL";
            }

            case SHOPIFY_COLLECTIVE_DEBIT: {
                return "SHOPIFY_COLLECTIVE_DEBIT";
            }

            case SHOPIFY_COLLECTIVE_DEBIT_REVERSAL: {
                return "SHOPIFY_COLLECTIVE_DEBIT_REVERSAL";
            }

            case SHOPIFY_SOURCE_CREDIT: {
                return "SHOPIFY_SOURCE_CREDIT";
            }

            case SHOPIFY_SOURCE_CREDIT_REVERSAL: {
                return "SHOPIFY_SOURCE_CREDIT_REVERSAL";
            }

            case SHOPIFY_SOURCE_DEBIT: {
                return "SHOPIFY_SOURCE_DEBIT";
            }

            case SHOPIFY_SOURCE_DEBIT_REVERSAL: {
                return "SHOPIFY_SOURCE_DEBIT_REVERSAL";
            }

            case SHOP_CASH_BILLING_DEBIT: {
                return "SHOP_CASH_BILLING_DEBIT";
            }

            case SHOP_CASH_BILLING_DEBIT_REVERSAL: {
                return "SHOP_CASH_BILLING_DEBIT_REVERSAL";
            }

            case SHOP_CASH_CAMPAIGN_BILLING_CREDIT: {
                return "SHOP_CASH_CAMPAIGN_BILLING_CREDIT";
            }

            case SHOP_CASH_CAMPAIGN_BILLING_CREDIT_REVERSAL: {
                return "SHOP_CASH_CAMPAIGN_BILLING_CREDIT_REVERSAL";
            }

            case SHOP_CASH_CAMPAIGN_BILLING_DEBIT: {
                return "SHOP_CASH_CAMPAIGN_BILLING_DEBIT";
            }

            case SHOP_CASH_CAMPAIGN_BILLING_DEBIT_REVERSAL: {
                return "SHOP_CASH_CAMPAIGN_BILLING_DEBIT_REVERSAL";
            }

            case SHOP_CASH_CREDIT: {
                return "SHOP_CASH_CREDIT";
            }

            case SHOP_CASH_CREDIT_REVERSAL: {
                return "SHOP_CASH_CREDIT_REVERSAL";
            }

            case SHOP_CASH_REFUND_DEBIT: {
                return "SHOP_CASH_REFUND_DEBIT";
            }

            case SHOP_CASH_REFUND_DEBIT_REVERSAL: {
                return "SHOP_CASH_REFUND_DEBIT_REVERSAL";
            }

            case STRIPE_FEE: {
                return "STRIPE_FEE";
            }

            case TAX_ADJUSTMENT_CREDIT: {
                return "TAX_ADJUSTMENT_CREDIT";
            }

            case TAX_ADJUSTMENT_CREDIT_REVERSAL: {
                return "TAX_ADJUSTMENT_CREDIT_REVERSAL";
            }

            case TAX_ADJUSTMENT_DEBIT: {
                return "TAX_ADJUSTMENT_DEBIT";
            }

            case TAX_ADJUSTMENT_DEBIT_REVERSAL: {
                return "TAX_ADJUSTMENT_DEBIT_REVERSAL";
            }

            case TRANSFER: {
                return "TRANSFER";
            }

            case TRANSFER_CANCEL: {
                return "TRANSFER_CANCEL";
            }

            case TRANSFER_FAILURE: {
                return "TRANSFER_FAILURE";
            }

            case TRANSFER_REFUND: {
                return "TRANSFER_REFUND";
            }

            case VAT_REFUND_CREDIT: {
                return "VAT_REFUND_CREDIT";
            }

            case VAT_REFUND_CREDIT_REVERSAL: {
                return "VAT_REFUND_CREDIT_REVERSAL";
            }

            default: {
                return "";
            }
        }
    }
}

