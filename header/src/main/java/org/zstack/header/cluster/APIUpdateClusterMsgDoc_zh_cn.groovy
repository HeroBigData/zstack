package org.zstack.header.cluster

import org.zstack.header.cluster.APIUpdateClusterEvent

doc {
    title "UpdateCluster"

    category "cluster"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/clusters/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIUpdateClusterMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "updateCluster"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "name"
					enclosedIn "updateCluster"
					desc "资源名称"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "description"
					enclosedIn "updateCluster"
					desc "资源的详细描述"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc "系统标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIUpdateClusterEvent.class
        }
    }
}