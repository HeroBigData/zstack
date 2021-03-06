package org.zstack.header.image

doc {
    title "CreateDataVolumeTemplateFromVolume"

    category "image"

    desc "在这里填写API描述"

    rest {
        request {
            url "POST /v1/images/data-volume-templates/from/volumes/{volumeUuid}"


            header(OAuth: 'the-session-uuid')

            clz APICreateDataVolumeTemplateFromVolumeMsg.class

            desc ""

            params {

                column {
                    name "name"
                    enclosedIn "params"
                    desc "资源名称"
                    location "body"
                    type "String"
                    optional false
                    since "0.6"

                }
                column {
                    name "description"
                    enclosedIn "params"
                    desc "资源的详细描述"
                    location "body"
                    type "String"
                    optional true
                    since "0.6"

                }
                column {
                    name "volumeUuid"
                    enclosedIn "params"
                    desc "云盘UUID"
                    location "url"
                    type "String"
                    optional false
                    since "0.6"

                }
                column {
                    name "backupStorageUuids"
                    enclosedIn "params"
                    desc ""
                    location "body"
                    type "List"
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
            clz APICreateDataVolumeTemplateFromVolumeEvent.class
        }
    }
}