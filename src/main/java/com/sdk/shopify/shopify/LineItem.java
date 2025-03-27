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
* Represents individual products and quantities purchased in the associated order.
*/
public class LineItem extends AbstractResponse<LineItem> implements Node {
    public LineItem() {
    }

    public LineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "contract": {
                    SubscriptionContract optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContract(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "customAttributes": {
                    List<Attribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Attribute(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountAllocations": {
                    List<DiscountAllocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DiscountAllocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountedTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedUnitPriceAfterAllDiscountsSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "duties": {
                    List<Duty> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Duty(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isGiftCard": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "lineItemGroup": {
                    LineItemGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LineItemGroup(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "merchantEditable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "nonFulfillableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "originalTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "product": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "refundableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "requiresShipping": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "restockable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "sellingPlan": {
                    LineItemSellingPlan optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LineItemSellingPlan(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "staffMember": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "taxable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "totalDiscountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unfulfilledDiscountedTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unfulfilledOriginalTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unfulfilledQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "variant": {
                    ProductVariant optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariant(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "variantTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "vendor": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

    public LineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "LineItem";
    }

    /**
    * The subscription contract associated with this line item.
    */

    public SubscriptionContract getContract() {
        return (SubscriptionContract) get("contract");
    }

    public LineItem setContract(SubscriptionContract arg) {
        optimisticData.put(getKey("contract"), arg);
        return this;
    }

    /**
    * The number of units ordered, excluding refunded and removed units.
    */

    public Integer getCurrentQuantity() {
        return (Integer) get("currentQuantity");
    }

    public LineItem setCurrentQuantity(Integer arg) {
        optimisticData.put(getKey("currentQuantity"), arg);
        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public LineItem setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The discounts that have been allocated to the line item by discount applications, including
    * discounts allocated to refunded and removed quantities.
    */

    public List<DiscountAllocation> getDiscountAllocations() {
        return (List<DiscountAllocation>) get("discountAllocations");
    }

    public LineItem setDiscountAllocations(List<DiscountAllocation> arg) {
        optimisticData.put(getKey("discountAllocations"), arg);
        return this;
    }

    /**
    * The total discounted price of the line item in shop and presentment currencies, including refunded
    * and removed quantities. This value doesn't include order-level discounts. Code-based discounts
    * aren't included by default.
    */

    public MoneyBag getDiscountedTotalSet() {
        return (MoneyBag) get("discountedTotalSet");
    }

    public LineItem setDiscountedTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedTotalSet"), arg);
        return this;
    }

    /**
    * The approximate unit price of the line item in shop and presentment currencies. This value includes
    * discounts applied to refunded and removed quantities.
    */

    public MoneyBag getDiscountedUnitPriceAfterAllDiscountsSet() {
        return (MoneyBag) get("discountedUnitPriceAfterAllDiscountsSet");
    }

    public LineItem setDiscountedUnitPriceAfterAllDiscountsSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedUnitPriceAfterAllDiscountsSet"), arg);
        return this;
    }

    /**
    * The approximate unit price of the line item in shop and presentment currencies. This value includes
    * line-level discounts and discounts applied to refunded and removed quantities. It doesn't include
    * order-level or code-based discounts.
    */

    public MoneyBag getDiscountedUnitPriceSet() {
        return (MoneyBag) get("discountedUnitPriceSet");
    }

    public LineItem setDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * The duties associated with the line item.
    */

    public List<Duty> getDuties() {
        return (List<Duty>) get("duties");
    }

    public LineItem setDuties(List<Duty> arg) {
        optimisticData.put(getKey("duties"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The image associated to the line item's variant.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public LineItem setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */

    public Boolean getIsGiftCard() {
        return (Boolean) get("isGiftCard");
    }

    public LineItem setIsGiftCard(Boolean arg) {
        optimisticData.put(getKey("isGiftCard"), arg);
        return this;
    }

    /**
    * The line item group associated to the line item.
    */

    public LineItemGroup getLineItemGroup() {
        return (LineItemGroup) get("lineItemGroup");
    }

    public LineItem setLineItemGroup(LineItemGroup arg) {
        optimisticData.put(getKey("lineItemGroup"), arg);
        return this;
    }

    /**
    * Whether the line item can be edited or not.
    */

    public Boolean getMerchantEditable() {
        return (Boolean) get("merchantEditable");
    }

    public LineItem setMerchantEditable(Boolean arg) {
        optimisticData.put(getKey("merchantEditable"), arg);
        return this;
    }

    /**
    * The title of the product, optionally appended with the title of the variant (if applicable).
    */

    public String getName() {
        return (String) get("name");
    }

    public LineItem setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The total number of units that can't be fulfilled. For example, if items have been refunded, or the
    * item is not something that can be fulfilled, like a tip. Please see the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object for
    * more fulfillment details.
    */

    public Integer getNonFulfillableQuantity() {
        return (Integer) get("nonFulfillableQuantity");
    }

    public LineItem setNonFulfillableQuantity(Integer arg) {
        optimisticData.put(getKey("nonFulfillableQuantity"), arg);
        return this;
    }

    /**
    * In shop and presentment currencies, the total price of the line item when the order was created.
    * This value doesn't include discounts.
    */

    public MoneyBag getOriginalTotalSet() {
        return (MoneyBag) get("originalTotalSet");
    }

    public LineItem setOriginalTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalSet"), arg);
        return this;
    }

    /**
    * In shop and presentment currencies, the unit price of the line item when the order was created. This
    * value doesn't include discounts.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public LineItem setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * The Product object associated with this line item's variant.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public LineItem setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The number of units ordered, including refunded and removed units.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public LineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The number of units ordered, excluding refunded units.
    */

    public Integer getRefundableQuantity() {
        return (Integer) get("refundableQuantity");
    }

    public LineItem setRefundableQuantity(Integer arg) {
        optimisticData.put(getKey("refundableQuantity"), arg);
        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public LineItem setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * Whether the line item can be restocked.
    */

    public Boolean getRestockable() {
        return (Boolean) get("restockable");
    }

    public LineItem setRestockable(Boolean arg) {
        optimisticData.put(getKey("restockable"), arg);
        return this;
    }

    /**
    * The selling plan details associated with the line item.
    */

    public LineItemSellingPlan getSellingPlan() {
        return (LineItemSellingPlan) get("sellingPlan");
    }

    public LineItem setSellingPlan(LineItemSellingPlan arg) {
        optimisticData.put(getKey("sellingPlan"), arg);
        return this;
    }

    /**
    * The variant SKU number.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public LineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * Staff attributed to the line item.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public LineItem setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    /**
    * The taxes charged for the line item, including taxes charged for refunded and removed quantities.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public LineItem setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Whether the variant is taxable.
    */

    public Boolean getTaxable() {
        return (Boolean) get("taxable");
    }

    public LineItem setTaxable(Boolean arg) {
        optimisticData.put(getKey("taxable"), arg);
        return this;
    }

    /**
    * The title of the product at time of order creation.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public LineItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total discount allocated to the line item in shop and presentment currencies, including the
    * total allocated to refunded and removed quantities. This value doesn't include order-level
    * discounts.
    */

    public MoneyBag getTotalDiscountSet() {
        return (MoneyBag) get("totalDiscountSet");
    }

    public LineItem setTotalDiscountSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountSet"), arg);
        return this;
    }

    /**
    * In shop and presentment currencies, the total discounted price of the unfulfilled quantity for the
    * line item.
    */

    public MoneyBag getUnfulfilledDiscountedTotalSet() {
        return (MoneyBag) get("unfulfilledDiscountedTotalSet");
    }

    public LineItem setUnfulfilledDiscountedTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("unfulfilledDiscountedTotalSet"), arg);
        return this;
    }

    /**
    * In shop and presentment currencies, the total price of the unfulfilled quantity for the line item.
    * This value doesn't include discounts.
    */

    public MoneyBag getUnfulfilledOriginalTotalSet() {
        return (MoneyBag) get("unfulfilledOriginalTotalSet");
    }

    public LineItem setUnfulfilledOriginalTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("unfulfilledOriginalTotalSet"), arg);
        return this;
    }

    /**
    * The number of units not yet fulfilled.
    */

    public Integer getUnfulfilledQuantity() {
        return (Integer) get("unfulfilledQuantity");
    }

    public LineItem setUnfulfilledQuantity(Integer arg) {
        optimisticData.put(getKey("unfulfilledQuantity"), arg);
        return this;
    }

    /**
    * The Variant object associated with this line item.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public LineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    /**
    * The title of the variant at time of order creation.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public LineItem setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    /**
    * The name of the vendor who made the variant.
    */

    public String getVendor() {
        return (String) get("vendor");
    }

    public LineItem setVendor(String arg) {
        optimisticData.put(getKey("vendor"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "contract": return true;

            case "currentQuantity": return false;

            case "customAttributes": return true;

            case "discountAllocations": return true;

            case "discountedTotalSet": return true;

            case "discountedUnitPriceAfterAllDiscountsSet": return true;

            case "discountedUnitPriceSet": return true;

            case "duties": return true;

            case "id": return false;

            case "image": return true;

            case "isGiftCard": return false;

            case "lineItemGroup": return true;

            case "merchantEditable": return false;

            case "name": return false;

            case "nonFulfillableQuantity": return false;

            case "originalTotalSet": return true;

            case "originalUnitPriceSet": return true;

            case "product": return true;

            case "quantity": return false;

            case "refundableQuantity": return false;

            case "requiresShipping": return false;

            case "restockable": return false;

            case "sellingPlan": return true;

            case "sku": return false;

            case "staffMember": return true;

            case "taxLines": return true;

            case "taxable": return false;

            case "title": return false;

            case "totalDiscountSet": return true;

            case "unfulfilledDiscountedTotalSet": return true;

            case "unfulfilledOriginalTotalSet": return true;

            case "unfulfilledQuantity": return false;

            case "variant": return true;

            case "variantTitle": return false;

            case "vendor": return false;

            default: return false;
        }
    }
}

