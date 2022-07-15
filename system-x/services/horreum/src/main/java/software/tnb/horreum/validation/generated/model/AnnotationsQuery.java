/*
 * Horreum API
 * Horreum data repository API
 *
 * The version of the OpenAPI document: 0.1-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.tnb.horreum.validation.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * AnnotationsQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class AnnotationsQuery {
    public static final String SERIALIZED_NAME_RANGE = "range";
    public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
    @SerializedName(SERIALIZED_NAME_RANGE)
    private Range range;
    @SerializedName(SERIALIZED_NAME_ANNOTATION)
    private AnnotationQuery annotation;

    public AnnotationsQuery() {
    }

    public AnnotationsQuery range(Range range) {

        this.range = range;
        return this;
    }

    /**
     * Get range
     *
     * @return range
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public AnnotationsQuery annotation(AnnotationQuery annotation) {

        this.annotation = annotation;
        return this;
    }

    /**
     * Get annotation
     *
     * @return annotation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public AnnotationQuery getAnnotation() {
        return annotation;
    }

    public void setAnnotation(AnnotationQuery annotation) {
        this.annotation = annotation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnnotationsQuery annotationsQuery = (AnnotationsQuery) o;
        return Objects.equals(this.range, annotationsQuery.range) &&
            Objects.equals(this.annotation, annotationsQuery.annotation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, annotation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnnotationsQuery {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
