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
* An auto-generated type for paginating through multiple QuantityPriceBreaks.
*/
public class QuantityPriceBreakConnection extends AbstractResponse<QuantityPriceBreakConnection> {
    public QuantityPriceBreakConnection() {
    }

    public QuantityPriceBreakConnection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "edges": {
                    List<QuantityPriceBreakEdge> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new QuantityPriceBreakEdge(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "nodes": {
                    List<QuantityPriceBreak> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new QuantityPriceBreak(jsonAsObject(element1, key)));
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
        return "QuantityPriceBreakConnection";
    }

    /**
    * The connection between the node and its parent. Each edge contains a minimum of the edge's cursor
    * and the node.
    */

    public List<QuantityPriceBreakEdge> getEdges() {
        return (List<QuantityPriceBreakEdge>) get("edges");
    }

    public QuantityPriceBreakConnection setEdges(List<QuantityPriceBreakEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    /**
    * A list of nodes that are contained in QuantityPriceBreakEdge. You can fetch data about an individual
    * node, or you can follow the edges to fetch data about a collection of related nodes. At each node,
    * you specify the fields that you want to retrieve.
    */

    public List<QuantityPriceBreak> getNodes() {
        return (List<QuantityPriceBreak>) get("nodes");
    }

    public QuantityPriceBreakConnection setNodes(List<QuantityPriceBreak> arg) {
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

    public QuantityPriceBreakConnection setPageInfo(PageInfo arg) {
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

