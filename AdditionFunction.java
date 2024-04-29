package de.tum.cit.dos.eist;

import java.util.Map;
import java.util.OptionalInt;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class AdditionFunction implements RequestHandler<APIGatewayProxyRequestEvent, Integer> {

    public Integer handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {
        Map<String, String> inputParamMap = input.getQueryStringParameters();
        int x = Integer.parseInt(inputParamMap.get("x"));
        int y = Integer.parseInt(inputParamMap.get("y"));
        int sum = x + y;
        return sum;
    }
}
