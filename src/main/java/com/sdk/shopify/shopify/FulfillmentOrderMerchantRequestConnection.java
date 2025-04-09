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
* An auto-generated type for paginating through multiple FulfillmentOrderMerchantRequests.
*/
public class FulfillmentOrderMerchantRequestConnection extends AbstractResponse<FulfillmentOrderMerchantRequestConnection> {
    public FulfillmentOrderMerchantRequestConnection() {
    }

    public FulfillmentOrderMerchantRequestConnection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "edges": {
                    List<FulfillmentOrderMerchantRequestEdge> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderMerchantRequestEdge(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "nodes": {
                    List<FulfillmentOrderMerchantRequest> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentOrderMerchantRequest(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "pageInfo": {
                    responseData.put(key, new PageInfo(jsonAsObject(field.getValue(), key)));

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
        return "FulfillmentOrderMerchantRequestConnection";
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */

    public List<FulfillmentOrderMerchantRequestEdge> getEdges() {
        return (List<FulfillmentOrderMerchantRequestEdge>) get("edges");
    }

    public FulfillmentOrderMerchantRequestConnection setEdges(List<FulfillmentOrderMerchantRequestEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    /**
    * A list of nodes that are contained in FulfillmentOrderMerchantRequestEdge. You can fetch data about
    * an individual node, or you can follow the edges to fetch data about a collection of related nodes.
    * At each node, you specify the fields that you want to retrieve.
    */

    public List<FulfillmentOrderMerchantRequest> getNodes() {
        return (List<FulfillmentOrderMerchantRequest>) get("nodes");
    }

    public FulfillmentOrderMerchantRequestConnection setNodes(List<FulfillmentOrderMerchantRequest> arg) {
        optimisticData.put(getKey("nodes"), arg);
        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public FulfillmentOrderMerchantRequestConnection setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "edges": return true;

            case "nodes": return true;

            case "pageInfo": return true;

            default: return false;
        }
    }
}

