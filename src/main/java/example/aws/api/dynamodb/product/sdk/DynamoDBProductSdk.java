/**
 * Created by Roman Kovalchuk
 */
package example.aws.api.dynamodb.product.sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import example.aws.api.dynamodb.product.sdk.model.*;

/**
 * Interface for accessing DynamoDBProductSdk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface DynamoDBProductSdk {

    /**
     * @param postApiRootRequest
     * @return Result of the PostApiRoot operation returned by the service.
     * @sample DynamoDBProductSdk.PostApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/77ptptat58-2022-06-25T19:45:44Z/PostApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    PostApiRootResult postApiRoot(PostApiRootRequest postApiRootRequest);

    /**
     * @param putApiRootRequest
     * @return Result of the PutApiRoot operation returned by the service.
     * @sample DynamoDBProductSdk.PutApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/77ptptat58-2022-06-25T19:45:44Z/PutApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    PutApiRootResult putApiRoot(PutApiRootRequest putApiRootRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static DynamoDBProductSdkClientBuilder builder() {
        return new DynamoDBProductSdkClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
