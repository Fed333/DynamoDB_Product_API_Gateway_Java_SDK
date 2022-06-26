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
 * PriceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PriceMarshaller {

    private static final MarshallingInfo<String> N_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("N").build();

    private static final PriceMarshaller instance = new PriceMarshaller();

    public static PriceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Price price, ProtocolMarshaller protocolMarshaller) {

        if (price == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(price.getN(), N_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
