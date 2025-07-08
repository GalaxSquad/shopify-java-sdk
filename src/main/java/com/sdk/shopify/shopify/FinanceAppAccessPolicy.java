// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Current user's access policy for a finance app.
*/
public class FinanceAppAccessPolicy extends AbstractResponse<FinanceAppAccessPolicy> {
    public FinanceAppAccessPolicy() {
    }

    public FinanceAppAccessPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "access": {
                    List<BankingFinanceAppAccess> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(BankingFinanceAppAccess.fromGraphQl(jsonAsString(element1, key)));
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

    public String getGraphQlTypeName() {
        return "FinanceAppAccessPolicy";
    }

    /**
    * Current shop staff's access within the app.
    */

    public List<BankingFinanceAppAccess> getAccess() {
        return (List<BankingFinanceAppAccess>) get("access");
    }

    public FinanceAppAccessPolicy setAccess(List<BankingFinanceAppAccess> arg) {
        optimisticData.put(getKey("access"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "access": return false;

            default: return false;
        }
    }
}

