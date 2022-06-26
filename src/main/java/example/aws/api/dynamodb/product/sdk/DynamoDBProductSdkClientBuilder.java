/**
 * Created by Roman Kovalchuk
 */
package example.aws.api.dynamodb.product.sdk;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link example.aws.api.dynamodb.product.sdk.DynamoDBProductSdk}.
 * 
 * @see example.aws.api.dynamodb.product.sdk.DynamoDBProductSdk#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class DynamoDBProductSdkClientBuilder extends SdkSyncClientBuilder<DynamoDBProductSdkClientBuilder, DynamoDBProductSdk> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("77ptptat58.execute-api.eu-central-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "eu-central-1";

    /**
     * Package private constructor - builder should be created via {@link DynamoDBProductSdk#builder()}
     */
    DynamoDBProductSdkClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of DynamoDBProductSdk using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of DynamoDBProductSdk.
     */
    @Override
    protected DynamoDBProductSdk build(AwsSyncClientParams params) {
        return new DynamoDBProductSdkClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
