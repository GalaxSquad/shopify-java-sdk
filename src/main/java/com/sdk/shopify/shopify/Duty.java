// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The duty details for a line item.
*/
public class Duty extends AbstractResponse<Duty> implements Node {
    public Duty() {
    }

    public Duty(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCodeOfOrigin": {
                    CountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "harmonizedSystemCode": {
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

                case "price": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "taxLines": {
                    List<TaxLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public Duty(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Duty";
    }

    /**
    * The ISO 3166-1 alpha-2 country code of the country of origin used in calculating the duty.
    */

    public CountryCode getCountryCodeOfOrigin() {
        return (CountryCode) get("countryCodeOfOrigin");
    }

    public Duty setCountryCodeOfOrigin(CountryCode arg) {
        optimisticData.put(getKey("countryCodeOfOrigin"), arg);
        return this;
    }

    /**
    * The harmonized system code of the item used in calculating the duty.
    */

    public String getHarmonizedSystemCode() {
        return (String) get("harmonizedSystemCode");
    }

    public Duty setHarmonizedSystemCode(String arg) {
        optimisticData.put(getKey("harmonizedSystemCode"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The amount of the duty.
    */

    public MoneyBag getPrice() {
        return (MoneyBag) get("price");
    }

    public Duty setPrice(MoneyBag arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * A list of taxes charged on the duty.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public Duty setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCodeOfOrigin": return false;

            case "harmonizedSystemCode": return false;

            case "id": return false;

            case "price": return true;

            case "taxLines": return true;

            default: return false;
        }
    }
}

