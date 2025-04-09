// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ProductSetInput implements Serializable {
    private Input<String> descriptionHtml = Input.undefined();

    private Input<String> handle = Input.undefined();

    private Input<SEOInput> seo = Input.undefined();

    private Input<String> productType = Input.undefined();

    private Input<ID> category = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<String> templateSuffix = Input.undefined();

    private Input<String> giftCardTemplateSuffix = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> vendor = Input.undefined();

    private Input<Boolean> giftCard = Input.undefined();

    private Input<Boolean> redirectNewHandle = Input.undefined();

    private Input<List<ID>> collections = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<List<ProductVariantSetInput>> variants = Input.undefined();

    private Input<List<FileSetInput>> files = Input.undefined();

    private Input<ProductStatus> status = Input.undefined();

    private Input<Boolean> requiresSellingPlan = Input.undefined();

    private Input<List<OptionSetInput>> productOptions = Input.undefined();

    private Input<ProductClaimOwnershipInput> claimOwnership = Input.undefined();

    private Input<CombinedListingsRole> combinedListingRole = Input.undefined();

    public String getDescriptionHtml() {
        return descriptionHtml.getValue();
    }

    public Input<String> getDescriptionHtmlInput() {
        return descriptionHtml;
    }

    public ProductSetInput setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = Input.optional(descriptionHtml);
        return this;
    }

    public ProductSetInput setDescriptionHtmlInput(Input<String> descriptionHtml) {
        if (descriptionHtml == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.descriptionHtml = descriptionHtml;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public ProductSetInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public ProductSetInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public SEOInput getSeo() {
        return seo.getValue();
    }

    public Input<SEOInput> getSeoInput() {
        return seo;
    }

    public ProductSetInput setSeo(SEOInput seo) {
        this.seo = Input.optional(seo);
        return this;
    }

    public ProductSetInput setSeoInput(Input<SEOInput> seo) {
        if (seo == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.seo = seo;
        return this;
    }

    public String getProductType() {
        return productType.getValue();
    }

    public Input<String> getProductTypeInput() {
        return productType;
    }

    public ProductSetInput setProductType(String productType) {
        this.productType = Input.optional(productType);
        return this;
    }

    public ProductSetInput setProductTypeInput(Input<String> productType) {
        if (productType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productType = productType;
        return this;
    }

    public ID getCategory() {
        return category.getValue();
    }

    public Input<ID> getCategoryInput() {
        return category;
    }

    public ProductSetInput setCategory(ID category) {
        this.category = Input.optional(category);
        return this;
    }

    public ProductSetInput setCategoryInput(Input<ID> category) {
        if (category == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.category = category;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public ProductSetInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public ProductSetInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public String getTemplateSuffix() {
        return templateSuffix.getValue();
    }

    public Input<String> getTemplateSuffixInput() {
        return templateSuffix;
    }

    public ProductSetInput setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = Input.optional(templateSuffix);
        return this;
    }

    public ProductSetInput setTemplateSuffixInput(Input<String> templateSuffix) {
        if (templateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.templateSuffix = templateSuffix;
        return this;
    }

    public String getGiftCardTemplateSuffix() {
        return giftCardTemplateSuffix.getValue();
    }

    public Input<String> getGiftCardTemplateSuffixInput() {
        return giftCardTemplateSuffix;
    }

    public ProductSetInput setGiftCardTemplateSuffix(String giftCardTemplateSuffix) {
        this.giftCardTemplateSuffix = Input.optional(giftCardTemplateSuffix);
        return this;
    }

    public ProductSetInput setGiftCardTemplateSuffixInput(Input<String> giftCardTemplateSuffix) {
        if (giftCardTemplateSuffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftCardTemplateSuffix = giftCardTemplateSuffix;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public ProductSetInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public ProductSetInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public String getVendor() {
        return vendor.getValue();
    }

    public Input<String> getVendorInput() {
        return vendor;
    }

    public ProductSetInput setVendor(String vendor) {
        this.vendor = Input.optional(vendor);
        return this;
    }

    public ProductSetInput setVendorInput(Input<String> vendor) {
        if (vendor == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.vendor = vendor;
        return this;
    }

    public Boolean getGiftCard() {
        return giftCard.getValue();
    }

    public Input<Boolean> getGiftCardInput() {
        return giftCard;
    }

    public ProductSetInput setGiftCard(Boolean giftCard) {
        this.giftCard = Input.optional(giftCard);
        return this;
    }

    public ProductSetInput setGiftCardInput(Input<Boolean> giftCard) {
        if (giftCard == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftCard = giftCard;
        return this;
    }

    public Boolean getRedirectNewHandle() {
        return redirectNewHandle.getValue();
    }

    public Input<Boolean> getRedirectNewHandleInput() {
        return redirectNewHandle;
    }

    public ProductSetInput setRedirectNewHandle(Boolean redirectNewHandle) {
        this.redirectNewHandle = Input.optional(redirectNewHandle);
        return this;
    }

    public ProductSetInput setRedirectNewHandleInput(Input<Boolean> redirectNewHandle) {
        if (redirectNewHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.redirectNewHandle = redirectNewHandle;
        return this;
    }

    public List<ID> getCollections() {
        return collections.getValue();
    }

    public Input<List<ID>> getCollectionsInput() {
        return collections;
    }

    public ProductSetInput setCollections(List<ID> collections) {
        this.collections = Input.optional(collections);
        return this;
    }

    public ProductSetInput setCollectionsInput(Input<List<ID>> collections) {
        if (collections == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.collections = collections;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public ProductSetInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public ProductSetInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public List<ProductVariantSetInput> getVariants() {
        return variants.getValue();
    }

    public Input<List<ProductVariantSetInput>> getVariantsInput() {
        return variants;
    }

    public ProductSetInput setVariants(List<ProductVariantSetInput> variants) {
        this.variants = Input.optional(variants);
        return this;
    }

    public ProductSetInput setVariantsInput(Input<List<ProductVariantSetInput>> variants) {
        if (variants == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variants = variants;
        return this;
    }

    public List<FileSetInput> getFiles() {
        return files.getValue();
    }

    public Input<List<FileSetInput>> getFilesInput() {
        return files;
    }

    public ProductSetInput setFiles(List<FileSetInput> files) {
        this.files = Input.optional(files);
        return this;
    }

    public ProductSetInput setFilesInput(Input<List<FileSetInput>> files) {
        if (files == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.files = files;
        return this;
    }

    public ProductStatus getStatus() {
        return status.getValue();
    }

    public Input<ProductStatus> getStatusInput() {
        return status;
    }

    public ProductSetInput setStatus(ProductStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public ProductSetInput setStatusInput(Input<ProductStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public Boolean getRequiresSellingPlan() {
        return requiresSellingPlan.getValue();
    }

    public Input<Boolean> getRequiresSellingPlanInput() {
        return requiresSellingPlan;
    }

    public ProductSetInput setRequiresSellingPlan(Boolean requiresSellingPlan) {
        this.requiresSellingPlan = Input.optional(requiresSellingPlan);
        return this;
    }

    public ProductSetInput setRequiresSellingPlanInput(Input<Boolean> requiresSellingPlan) {
        if (requiresSellingPlan == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiresSellingPlan = requiresSellingPlan;
        return this;
    }

    public List<OptionSetInput> getProductOptions() {
        return productOptions.getValue();
    }

    public Input<List<OptionSetInput>> getProductOptionsInput() {
        return productOptions;
    }

    public ProductSetInput setProductOptions(List<OptionSetInput> productOptions) {
        this.productOptions = Input.optional(productOptions);
        return this;
    }

    public ProductSetInput setProductOptionsInput(Input<List<OptionSetInput>> productOptions) {
        if (productOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.productOptions = productOptions;
        return this;
    }

    public ProductClaimOwnershipInput getClaimOwnership() {
        return claimOwnership.getValue();
    }

    public Input<ProductClaimOwnershipInput> getClaimOwnershipInput() {
        return claimOwnership;
    }

    public ProductSetInput setClaimOwnership(ProductClaimOwnershipInput claimOwnership) {
        this.claimOwnership = Input.optional(claimOwnership);
        return this;
    }

    public ProductSetInput setClaimOwnershipInput(Input<ProductClaimOwnershipInput> claimOwnership) {
        if (claimOwnership == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.claimOwnership = claimOwnership;
        return this;
    }

    public CombinedListingsRole getCombinedListingRole() {
        return combinedListingRole.getValue();
    }

    public Input<CombinedListingsRole> getCombinedListingRoleInput() {
        return combinedListingRole;
    }

    public ProductSetInput setCombinedListingRole(CombinedListingsRole combinedListingRole) {
        this.combinedListingRole = Input.optional(combinedListingRole);
        return this;
    }

    public ProductSetInput setCombinedListingRoleInput(Input<CombinedListingsRole> combinedListingRole) {
        if (combinedListingRole == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.combinedListingRole = combinedListingRole;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.descriptionHtml.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("descriptionHtml:");
            if (descriptionHtml.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, descriptionHtml.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.handle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("handle:");
            if (handle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, handle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.seo.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("seo:");
            if (seo.getValue() != null) {
                seo.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.productType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productType:");
            if (productType.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, productType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.category.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category:");
            if (category.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, category.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tags.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tags:");
            if (tags.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : tags.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.templateSuffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("templateSuffix:");
            if (templateSuffix.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, templateSuffix.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftCardTemplateSuffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("giftCardTemplateSuffix:");
            if (giftCardTemplateSuffix.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, giftCardTemplateSuffix.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.vendor.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("vendor:");
            if (vendor.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, vendor.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftCard.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("giftCard:");
            if (giftCard.getValue() != null) {
                _queryBuilder.append(giftCard.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.redirectNewHandle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("redirectNewHandle:");
            if (redirectNewHandle.getValue() != null) {
                _queryBuilder.append(redirectNewHandle.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.collections.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("collections:");
            if (collections.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : collections.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.variants.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variants:");
            if (variants.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductVariantSetInput item1 : variants.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.files.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("files:");
            if (files.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FileSetInput item1 : files.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.requiresSellingPlan.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("requiresSellingPlan:");
            if (requiresSellingPlan.getValue() != null) {
                _queryBuilder.append(requiresSellingPlan.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.productOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("productOptions:");
            if (productOptions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OptionSetInput item1 : productOptions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.claimOwnership.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("claimOwnership:");
            if (claimOwnership.getValue() != null) {
                claimOwnership.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.combinedListingRole.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("combinedListingRole:");
            if (combinedListingRole.getValue() != null) {
                _queryBuilder.append(combinedListingRole.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
