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
* A list of products with publishing and pricing information associated with company locations.
*/
public class CompanyLocationCatalog extends AbstractResponse<CompanyLocationCatalog> implements Catalog, Node {
    public CompanyLocationCatalog() {
    }

    public CompanyLocationCatalog(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "companyLocations": {
                    responseData.put(key, new CompanyLocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "companyLocationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "operations": {
                    List<ResourceOperation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownResourceOperation.create(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "priceList": {
                    PriceList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publication": {
                    Publication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Publication(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, CatalogStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public CompanyLocationCatalog(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CompanyLocationCatalog";
    }

    /**
    * The company locations associated with the catalog.
    */

    public CompanyLocationConnection getCompanyLocations() {
        return (CompanyLocationConnection) get("companyLocations");
    }

    public CompanyLocationCatalog setCompanyLocations(CompanyLocationConnection arg) {
        optimisticData.put(getKey("companyLocations"), arg);
        return this;
    }

    /**
    * The number of company locations associated with the catalog.
    */

    public Count getCompanyLocationsCount() {
        return (Count) get("companyLocationsCount");
    }

    public CompanyLocationCatalog setCompanyLocationsCount(Count arg) {
        optimisticData.put(getKey("companyLocationsCount"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Most recent catalog operations.
    */

    public List<ResourceOperation> getOperations() {
        return (List<ResourceOperation>) get("operations");
    }

    public CompanyLocationCatalog setOperations(List<ResourceOperation> arg) {
        optimisticData.put(getKey("operations"), arg);
        return this;
    }

    /**
    * The price list associated with the catalog.
    */

    public PriceList getPriceList() {
        return (PriceList) get("priceList");
    }

    public CompanyLocationCatalog setPriceList(PriceList arg) {
        optimisticData.put(getKey("priceList"), arg);
        return this;
    }

    /**
    * A group of products and collections that's published to a catalog.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public CompanyLocationCatalog setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The status of the catalog.
    */

    public CatalogStatus getStatus() {
        return (CatalogStatus) get("status");
    }

    public CompanyLocationCatalog setStatus(CatalogStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The name of the catalog.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CompanyLocationCatalog setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "companyLocations": return true;

            case "companyLocationsCount": return true;

            case "id": return false;

            case "operations": return false;

            case "priceList": return true;

            case "publication": return true;

            case "status": return false;

            case "title": return false;

            default: return false;
        }
    }
}

