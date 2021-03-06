package org.zstack.header.storage.backup

import org.zstack.header.storage.backup.APIGetBackupStorageTypesReply

doc {
    title "GetBackupStorageTypes"

    category "storage.backup"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/backup-storage/types"


            header (OAuth: 'the-session-uuid')

            clz APIGetBackupStorageTypesMsg.class

            desc ""
            
			params {

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
            clz APIGetBackupStorageTypesReply.class
        }
    }
}