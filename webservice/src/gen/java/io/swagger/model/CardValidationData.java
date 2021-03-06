/*
 * OpenAPI Specification for Bank Application
 * Specification Document for Cart Validation and Mortgage Calculation Application
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains card validation data
 */
@Schema(description = "Contains card validation data")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-05-11T12:53:02.872Z[GMT]")
public class CardValidationData {

    @JsonProperty("validation-result")
    private Boolean validationResult = null;

    @JsonProperty("validation-messages")
    private List<String> validationMessages = null;

    @JsonProperty("payment-system-name")
    private String paymentSystemName = null;

    public CardValidationData validationResult(Boolean validationResult) {
        this.validationResult = validationResult;
        return this;
    }

    /**
     * Card validation result
     *
     * @return validationResult
     **/
    @JsonProperty("validation-result")
    @Schema(description = "Card validation result")
    public Boolean isValidationResult() {
        return validationResult;
    }

    public void setValidationResult(Boolean validationResult) {
        this.validationResult = validationResult;
    }

    public CardValidationData validationMessages(List<String> validationMessages) {
        this.validationMessages = validationMessages;
        return this;
    }

    public CardValidationData addValidationMessagesItem(String validationMessagesItem) {
        if (this.validationMessages == null) {
            this.validationMessages = new ArrayList<String>();
        }
        this.validationMessages.add(validationMessagesItem);
        return this;
    }

    /**
     * Array of validation messages
     *
     * @return validationMessages
     **/
    @JsonProperty("validation-messages")
    @Schema(description = "Array of validation messages")
    public List<String> getValidationMessages() {
        return validationMessages;
    }

    public void setValidationMessages(List<String> validationMessages) {
        this.validationMessages = validationMessages;
    }

    public CardValidationData paymentSystemName(String paymentSystemName) {
        this.paymentSystemName = paymentSystemName;
        return this;
    }

    /**
     * Payment system name
     *
     * @return paymentSystemName
     **/
    @JsonProperty("payment-system-name")
    @Schema(description = "Payment system name")
    public String getPaymentSystemName() {
        return paymentSystemName;
    }

    public void setPaymentSystemName(String paymentSystemName) {
        this.paymentSystemName = paymentSystemName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardValidationData cardValidationData = (CardValidationData) o;
        return Objects.equals(this.validationResult, cardValidationData.validationResult) &&
                Objects.equals(this.validationMessages, cardValidationData.validationMessages) &&
                Objects.equals(this.paymentSystemName, cardValidationData.paymentSystemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validationResult, validationMessages, paymentSystemName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardValidationData {\n");

        sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
        sb.append("    validationMessages: ").append(toIndentedString(validationMessages)).append("\n");
        sb.append("    paymentSystemName: ").append(toIndentedString(paymentSystemName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
