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
 * BodyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BodyMarshaller {

    private static final MarshallingInfo<StructuredPojo> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> PICTUREURL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("picture_url").build();
    private static final MarshallingInfo<StructuredPojo> PRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("price").build();
    private static final MarshallingInfo<StructuredPojo> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("product_id").build();

    private static final BodyMarshaller instance = new BodyMarshaller();

    public static BodyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Body body, ProtocolMarshaller protocolMarshaller) {

        if (body == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(body.getName(), NAME_BINDING);
            protocolMarshaller.marshall(body.getPictureUrl(), PICTUREURL_BINDING);
            protocolMarshaller.marshall(body.getPrice(), PRICE_BINDING);
            protocolMarshaller.marshall(body.getProductId(), PRODUCTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
