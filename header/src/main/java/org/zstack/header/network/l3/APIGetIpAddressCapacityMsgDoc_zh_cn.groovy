package org.zstack.header.network.l3

import org.zstack.header.network.l3.APIGetIpAddressCapacityReply

doc {
    title "GetIpAddressCapacity"

    category "network.l3"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/ip-capacity"


            header (OAuth: 'the-session-uuid')

            clz APIGetIpAddressCapacityMsg.class

            desc ""
            
			params {

				column {
					name "zoneUuids"
					enclosedIn "params"
					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "l3NetworkUuids"
					enclosedIn "params"
					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "ipRangeUuids"
					enclosedIn "params"
					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "all"
					enclosedIn "params"
					desc ""
					location "query"
					type "boolean"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
 					enclosedIn ""
 					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIGetIpAddressCapacityReply.class
        }
    }
}