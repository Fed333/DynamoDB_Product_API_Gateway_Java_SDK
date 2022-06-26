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
 * Price JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PriceJsonUnmarshaller implements Unmarshaller<Price, JsonUnmarshallerContext> {

    public Price unmarshall(JsonUnmarshallerContext context) throws Exception {
        Price price = new Price();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("N", targetDepth)) {
                    context.nextToken();
                    price.setN(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return price;
    }

    private static PriceJsonUnmarshaller instance;

    public static PriceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PriceJsonUnmarshaller();
        return instance;
    }
}
