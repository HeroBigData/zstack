package org.zstack.header.volume

import org.zstack.header.volume.APICreateVolumeSnapshotSchedulerEvent

doc {
    title "CreateVolumeSnapshotScheduler"

    category "snapshot.volume"

    desc "在这里填写API描述"

    rest {
        request {
			url "POST /v1/volumes/schedulers/create-volume-snapshots"


            header (OAuth: 'the-session-uuid')

            clz APICreateVolumeSnapshotSchedulerMsg.class

            desc ""
            
			params {

				column {
					name "volumeUuid"
					enclosedIn "params"
					desc "云盘UUID"
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "snapShotName"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "volumeSnapshotDescription"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "schedulerName"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "schedulerDescription"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "type"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional false
					since "0.6"
					values ("simple","cron")
				}
				column {
					name "interval"
					enclosedIn "params"
					desc ""
					location "body"
					type "Integer"
					optional true
					since "0.6"
					
				}
				column {
					name "repeatCount"
					enclosedIn "params"
					desc ""
					location "body"
					type "Integer"
					optional true
					since "0.6"
					
				}
				column {
					name "startTime"
					enclosedIn "params"
					desc ""
					location "body"
					type "Long"
					optional true
					since "0.6"
					
				}
				column {
					name "cron"
					enclosedIn "params"
					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "resourceUuid"
					enclosedIn "params"
					desc ""
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
            clz APICreateVolumeSnapshotSchedulerEvent.class
        }
    }
}