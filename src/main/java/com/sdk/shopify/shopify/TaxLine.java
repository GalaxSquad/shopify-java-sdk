// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a single tax applied to the associated line item.
*/
public class TaxLine extends AbstractResponse<TaxLine> {
    public TaxLine() {
    }

    public TaxLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "channelLiable": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "rate": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ratePercentage": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "source": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public String getGraphQlTypeName() {
        return "TaxLine";
    }

    /**
    * Whether the channel that submitted the tax line is liable for remitting. A value of null indicates
    * unknown liability for this tax line.
    */

    public Boolean getChannelLiable() {
        return (Boolean) get("channelLiable");
    }

    public TaxLine setChannelLiable(Boolean arg) {
        optimisticData.put(getKey("channelLiable"), arg);
        return this;
    }

    /**
    * The amount of tax, in shop and presentment currencies, after discounts and before returns.
    */

    public MoneyBag getPriceSet() {
        return (MoneyBag) get("priceSet");
    }

    public TaxLine setPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("priceSet"), arg);
        return this;
    }

    /**
    * The proportion of the line item price that the tax represents as a decimal.
    */

    public Double getRate() {
        return (Double) get("rate");
    }

    public TaxLine setRate(Double arg) {
        optimisticData.put(getKey("rate"), arg);
        return this;
    }

    /**
    * The proportion of the line item price that the tax represents as a percentage.
    */

    public Double getRatePercentage() {
        return (Double) get("ratePercentage");
    }

    public TaxLine setRatePercentage(Double arg) {
        optimisticData.put(getKey("ratePercentage"), arg);
        return this;
    }

    /**
    * The source of the tax.
    */

    public String getSource() {
        return (String) get("source");
    }

    public TaxLine setSource(String arg) {
        optimisticData.put(getKey("source"), arg);
        return this;
    }

    /**
    * The name of the tax.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public TaxLine setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "channelLiable": return false;

            case "priceSet": return true;

            case "rate": return false;

            case "ratePercentage": return false;

            case "source": return false;

            case "title": return false;

            default: return false;
        }
    }
}

