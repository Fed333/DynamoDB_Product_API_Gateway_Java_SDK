/**
 * Created by Roman Kovalchuk
 */
package example.aws.api.dynamodb.product.sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import example.aws.api.dynamodb.product.sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutApiRootResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutApiRootResultJsonUnmarshaller implements Unmarshaller<PutApiRootResult, JsonUnmarshallerContext> {

    public PutApiRootResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutApiRootResult putApiRootResult = new PutApiRootResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putApiRootResult;
        }

        while (true) {
            if (token == null)
                break;

            putApiRootResult.setProductModelResponse(ProductModelResponseJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return putApiRootResult;
    }

    private static PutApiRootResultJsonUnmarshaller instance;

    public static PutApiRootResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutApiRootResultJsonUnmarshaller();
        return instance;
    }
}
