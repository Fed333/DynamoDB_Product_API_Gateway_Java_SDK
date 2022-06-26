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
 * PutApiRootRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutApiRootRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> PRODUCTMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final PutApiRootRequestMarshaller instance = new PutApiRootRequestMarshaller();

    public static PutApiRootRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutApiRootRequest putApiRootRequest, ProtocolMarshaller protocolMarshaller) {

        if (putApiRootRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putApiRootRequest.getProductModel(), PRODUCTMODEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
