package org.zstack.header.identity;

import org.springframework.http.HttpMethod;
import org.zstack.header.query.APIQueryMessage;
import org.zstack.header.query.AutoQuery;
import org.zstack.header.rest.RestRequest;

/**
 * Created by frank on 2/25/2016.
 */
@AutoQuery(replyClass = APIQueryAccountResourceRefReply.class, inventoryClass = AccountResourceRefInventory.class)
@Action(category = AccountConstant.ACTION_CATEGORY, names = {"read"})
@RestRequest(
        path = "/accounts/resources/refs",
        method = HttpMethod.GET,
        responseClass = APIQueryAccountResourceRefReply.class
)
public class APIQueryAccountResourceRefMsg extends APIQueryMessage {
 
    public static APIQueryAccountResourceRefMsg __example__() {
        APIQueryAccountResourceRefMsg msg = new APIQueryAccountResourceRefMsg();


        return msg;
    }

}
