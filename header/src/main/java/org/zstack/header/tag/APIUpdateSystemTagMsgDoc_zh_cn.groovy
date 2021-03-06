package org.zstack.header.tag

import org.zstack.header.tag.APIUpdateSystemTagEvent

doc {
    title "UpdateSystemTag"

    category "tag"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/system-tags/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIUpdateSystemTagMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "updateSystemTag"
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "tag"
					enclosedIn "updateSystemTag"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
 					enclosedIn ""
 					desc ""
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
            clz APIUpdateSystemTagEvent.class
        }
    }
}