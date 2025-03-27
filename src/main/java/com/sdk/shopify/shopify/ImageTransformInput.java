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

import java.io.Serializable;

public class ImageTransformInput implements Serializable {
    private Input<CropRegion> crop = Input.undefined();

    private Input<Integer> maxWidth = Input.undefined();

    private Input<Integer> maxHeight = Input.undefined();

    private Input<Integer> scale = Input.undefined();

    private Input<ImageContentType> preferredContentType = Input.undefined();

    public CropRegion getCrop() {
        return crop.getValue();
    }

    public Input<CropRegion> getCropInput() {
        return crop;
    }

    public ImageTransformInput setCrop(CropRegion crop) {
        this.crop = Input.optional(crop);
        return this;
    }

    public ImageTransformInput setCropInput(Input<CropRegion> crop) {
        if (crop == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.crop = crop;
        return this;
    }

    public Integer getMaxWidth() {
        return maxWidth.getValue();
    }

    public Input<Integer> getMaxWidthInput() {
        return maxWidth;
    }

    public ImageTransformInput setMaxWidth(Integer maxWidth) {
        this.maxWidth = Input.optional(maxWidth);
        return this;
    }

    public ImageTransformInput setMaxWidthInput(Input<Integer> maxWidth) {
        if (maxWidth == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maxWidth = maxWidth;
        return this;
    }

    public Integer getMaxHeight() {
        return maxHeight.getValue();
    }

    public Input<Integer> getMaxHeightInput() {
        return maxHeight;
    }

    public ImageTransformInput setMaxHeight(Integer maxHeight) {
        this.maxHeight = Input.optional(maxHeight);
        return this;
    }

    public ImageTransformInput setMaxHeightInput(Input<Integer> maxHeight) {
        if (maxHeight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maxHeight = maxHeight;
        return this;
    }

    public Integer getScale() {
        return scale.getValue();
    }

    public Input<Integer> getScaleInput() {
        return scale;
    }

    public ImageTransformInput setScale(Integer scale) {
        this.scale = Input.optional(scale);
        return this;
    }

    public ImageTransformInput setScaleInput(Input<Integer> scale) {
        if (scale == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.scale = scale;
        return this;
    }

    public ImageContentType getPreferredContentType() {
        return preferredContentType.getValue();
    }

    public Input<ImageContentType> getPreferredContentTypeInput() {
        return preferredContentType;
    }

    public ImageTransformInput setPreferredContentType(ImageContentType preferredContentType) {
        this.preferredContentType = Input.optional(preferredContentType);
        return this;
    }

    public ImageTransformInput setPreferredContentTypeInput(Input<ImageContentType> preferredContentType) {
        if (preferredContentType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.preferredContentType = preferredContentType;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.crop.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("crop:");
            if (crop.getValue() != null) {
                _queryBuilder.append(crop.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.maxWidth.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("maxWidth:");
            if (maxWidth.getValue() != null) {
                _queryBuilder.append(maxWidth.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.maxHeight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("maxHeight:");
            if (maxHeight.getValue() != null) {
                _queryBuilder.append(maxHeight.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.scale.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("scale:");
            if (scale.getValue() != null) {
                _queryBuilder.append(scale.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.preferredContentType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("preferredContentType:");
            if (preferredContentType.getValue() != null) {
                _queryBuilder.append(preferredContentType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
