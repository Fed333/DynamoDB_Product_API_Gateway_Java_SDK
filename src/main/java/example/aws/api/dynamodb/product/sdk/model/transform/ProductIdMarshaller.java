/**
 * Created by Roman Kovalchuk
 */
package example.aws.api.dynamodb.product.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import example.aws.api.dynamodb.product.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProductIdMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProductIdMarshaller {

    private static final MarshallingInfo<String> N_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("N").build();

    private static final ProductIdMarshaller instance = new ProductIdMarshaller();

    public static ProductIdMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProductId productId, ProtocolMarshaller protocolMarshaller) {

        if (productId == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(productId.getN(), N_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
