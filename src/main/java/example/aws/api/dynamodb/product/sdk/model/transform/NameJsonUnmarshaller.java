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
 * Name JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NameJsonUnmarshaller implements Unmarshaller<Name, JsonUnmarshallerContext> {

    public Name unmarshall(JsonUnmarshallerContext context) throws Exception {
        Name name = new Name();

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
                if (context.testExpression("S", targetDepth)) {
                    context.nextToken();
                    name.setS(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return name;
    }

    private static NameJsonUnmarshaller instance;

    public static NameJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NameJsonUnmarshaller();
        return instance;
    }
}
