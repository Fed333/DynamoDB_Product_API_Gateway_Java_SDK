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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/77ptptat58-2022-06-25T19:45:44Z/ProductModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductModel implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private String pictureUrl;

    private Double price;

    private Integer productId;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductModel name(String name) {
        setName(name);
        return this;
    }

    /**
     * @param pictureUrl
     */

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    /**
     * @return
     */

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    /**
     * @param pictureUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductModel pictureUrl(String pictureUrl) {
        setPictureUrl(pictureUrl);
        return this;
    }

    /**
     * @param price
     */

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return
     */

    public Double getPrice() {
        return this.price;
    }

    /**
     * @param price
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductModel price(Double price) {
        setPrice(price);
        return this;
    }

    /**
     * @param productId
     */

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return
     */

    public Integer getProductId() {
        return this.productId;
    }

    /**
     * @param productId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductModel productId(Integer productId) {
        setProductId(productId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPictureUrl() != null)
            sb.append("PictureUrl: ").append(getPictureUrl()).append(",");
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductModel == false)
            return false;
        ProductModel other = (ProductModel) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPictureUrl() == null ^ this.getPictureUrl() == null)
            return false;
        if (other.getPictureUrl() != null && other.getPictureUrl().equals(this.getPictureUrl()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPictureUrl() == null) ? 0 : getPictureUrl().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        return hashCode;
    }

    @Override
    public ProductModel clone() {
        try {
            return (ProductModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        example.aws.api.dynamodb.product.sdk.model.transform.ProductModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
