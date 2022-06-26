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
 * PictureUrlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PictureUrlMarshaller {

    private static final MarshallingInfo<String> S_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S").build();

    private static final PictureUrlMarshaller instance = new PictureUrlMarshaller();

    public static PictureUrlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PictureUrl pictureUrl, ProtocolMarshaller protocolMarshaller) {

        if (pictureUrl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pictureUrl.getS(), S_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
