/**
 * Created by Roman Kovalchuk
 */
package example.aws.api.dynamodb.product.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/77ptptat58-2022-06-25T19:45:44Z/PutApiRoot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutApiRootRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private ProductModel productModel;

    /**
     * @param productModel
     */

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    /**
     * @return
     */

    public ProductModel getProductModel() {
        return this.productModel;
    }

    /**
     * @param productModel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApiRootRequest productModel(ProductModel productModel) {
        setProductModel(productModel);
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
        if (getProductModel() != null)
            sb.append("ProductModel: ").append(getProductModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutApiRootRequest == false)
            return false;
        PutApiRootRequest other = (PutApiRootRequest) obj;
        if (other.getProductModel() == null ^ this.getProductModel() == null)
            return false;
        if (other.getProductModel() != null && other.getProductModel().equals(this.getProductModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductModel() == null) ? 0 : getProductModel().hashCode());
        return hashCode;
    }

    @Override
    public PutApiRootRequest clone() {
        return (PutApiRootRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PutApiRootRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
