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

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Contains loan amortization data for specific month
 */
@Schema(description = "Contains loan amortization data for specific month")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-05-11T12:53:02.872Z[GMT]")
public class LoanAmortizationData {

    @JsonProperty("month")
    private Integer month = null;

    @JsonProperty("interest")
    private Double interest = null;

    @JsonProperty("principal")
    private Double principal = null;

    @JsonProperty("balance")
    private Double balance = null;

    public LoanAmortizationData month(Integer month) {
        this.month = month;
        return this;
    }

    /**
     * Number of month
     *
     * @return month
     **/
    @JsonProperty("month")
    @Schema(required = true, description = "Number of month")
    @NotNull
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public LoanAmortizationData interest(Double interest) {
        this.interest = interest;
        return this;
    }

    /**
     * Interest payment value for specific month
     *
     * @return interest
     **/
    @JsonProperty("interest")
    @Schema(required = true, description = "Interest payment value for specific month")
    @NotNull
    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public LoanAmortizationData principal(Double principal) {
        this.principal = principal;
        return this;
    }

    /**
     * Principal payment value for specific month
     *
     * @return principal
     **/
    @JsonProperty("principal")
    @Schema(required = true, description = "Principal payment value for specific month")
    @NotNull
    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public LoanAmortizationData balance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Remaining unpaid loan amount
     *
     * @return balance
     **/
    @JsonProperty("balance")
    @Schema(required = true, description = "Remaining unpaid loan amount")
    @NotNull
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoanAmortizationData loanAmortizationData = (LoanAmortizationData) o;
        return Objects.equals(this.month, loanAmortizationData.month) &&
                Objects.equals(this.interest, loanAmortizationData.interest) &&
                Objects.equals(this.principal, loanAmortizationData.principal) &&
                Objects.equals(this.balance, loanAmortizationData.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, interest, principal, balance);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoanAmortizationData {\n");

        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
