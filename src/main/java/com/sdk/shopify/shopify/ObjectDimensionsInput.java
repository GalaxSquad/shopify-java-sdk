// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;




import java.io.Serializable;

public class ObjectDimensionsInput implements Serializable {
    private double length;

    private double width;

    private double height;

    private LengthUnit unit;

    public ObjectDimensionsInput(double length, double width, double height, LengthUnit unit) {
        this.length = length;

        this.width = width;

        this.height = height;

        this.unit = unit;
    }

    public double getLength() {
        return length;
    }

    public ObjectDimensionsInput setLength(double length) {
        this.length = length;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public ObjectDimensionsInput setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public ObjectDimensionsInput setHeight(double height) {
        this.height = height;
        return this;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public ObjectDimensionsInput setUnit(LengthUnit unit) {
        this.unit = unit;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("length:");
        _queryBuilder.append(length);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("width:");
        _queryBuilder.append(width);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("height:");
        _queryBuilder.append(height);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("unit:");
        _queryBuilder.append(unit.toString());

        _queryBuilder.append('}');
    }
}
