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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/77ptptat58-2022-06-25T19:45:44Z/Name" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Name implements Serializable, Cloneable, StructuredPojo {

    private String s;

    /**
     * @param s
     */

    public void setS(String s) {
        this.s = s;
    }

    /**
     * @return
     */

    public String getS() {
        return this.s;
    }

    /**
     * @param s
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Name s(String s) {
        setS(s);
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
        if (getS() != null)
            sb.append("S: ").append(getS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Name == false)
            return false;
        Name other = (Name) obj;
        if (other.getS() == null ^ this.getS() == null)
            return false;
        if (other.getS() != null && other.getS().equals(this.getS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS() == null) ? 0 : getS().hashCode());
        return hashCode;
    }

    @Override
    public Name clone() {
        try {
            return (Name) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        example.aws.api.dynamodb.product.sdk.model.transform.NameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
