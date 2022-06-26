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
 * Body JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BodyJsonUnmarshaller implements Unmarshaller<Body, JsonUnmarshallerContext> {

    public Body unmarshall(JsonUnmarshallerContext context) throws Exception {
        Body body = new Body();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    body.setName(NameJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("picture_url", targetDepth)) {
                    context.nextToken();
                    body.setPictureUrl(PictureUrlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("price", targetDepth)) {
                    context.nextToken();
                    body.setPrice(PriceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("product_id", targetDepth)) {
                    context.nextToken();
                    body.setProductId(ProductIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return body;
    }

    private static BodyJsonUnmarshaller instance;

    public static BodyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BodyJsonUnmarshaller();
        return instance;
    }
}
