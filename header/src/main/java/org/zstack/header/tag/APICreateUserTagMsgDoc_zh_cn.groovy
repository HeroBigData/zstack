package org.zstack.header.tag

import org.zstack.header.tag.APICreateUserTagEvent

doc {
    title "CreateUserTag"

    category "tag"

    desc "在这里填写API描述"

    rest {
        request {
			url "POST /v1/user-tags"


            header (OAuth: 'the-session-uuid')

            clz APICreateUserTagMsg.class

            desc ""
            
			params {

				column {
					name "resourceType"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "resourceUuid"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "tag"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional false
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
            clz APICreateUserTagEvent.class
        }
    }
}