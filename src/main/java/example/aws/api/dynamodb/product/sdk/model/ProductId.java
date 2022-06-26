/**
 * Created by Roman Kovalchuk
 */
package example.aws.api.dynamodb.product.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/77ptptat58-2022-06-25T19:45:44Z/ProductId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductId implements Serializable, Cloneable, StructuredPojo {

    private String n;

    /**
     * @param n
     */

    public void setN(String n) {
        this.n = n;
    }

    /**
     * @return
     */

    public String getN() {
        return this.n;
    }

    /**
     * @param n
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductId n(String n) {
        setN(n);
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
        if (getN() != null)
            sb.append("N: ").append(getN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductId == false)
            return false;
        ProductId other = (ProductId) obj;
        if (other.getN() == null ^ this.getN() == null)
            return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getN() == null) ? 0 : getN().hashCode());
        return hashCode;
    }

    @Override
    public ProductId clone() {
        try {
            return (ProductId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        example.aws.api.dynamodb.product.sdk.model.transform.ProductIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
