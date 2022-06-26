/**
 * Created by Roman Kovalchuk
 */
package example.aws.api.dynamodb.product.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/77ptptat58-2022-06-25T19:45:44Z/PostApiRoot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostApiRootResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private ProductModelResponse productModelResponse;

    /**
     * @param productModelResponse
     */

    public void setProductModelResponse(ProductModelResponse productModelResponse) {
        this.productModelResponse = productModelResponse;
    }

    /**
     * @return
     */

    public ProductModelResponse getProductModelResponse() {
        return this.productModelResponse;
    }

    /**
     * @param productModelResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostApiRootResult productModelResponse(ProductModelResponse productModelResponse) {
        setProductModelResponse(productModelResponse);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProductModelResponse() != null)
            sb.append("ProductModelResponse: ").append(getProductModelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostApiRootResult == false)
            return false;
        PostApiRootResult other = (PostApiRootResult) obj;
        if (other.getProductModelResponse() == null ^ this.getProductModelResponse() == null)
            return false;
        if (other.getProductModelResponse() != null && other.getProductModelResponse().equals(this.getProductModelResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductModelResponse() == null) ? 0 : getProductModelResponse().hashCode());
        return hashCode;
    }

    @Override
    public PostApiRootResult clone() {
        try {
            return (PostApiRootResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
