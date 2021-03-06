package org.zstack.header.console

doc {
    title "RequestConsoleAccess"

    category "console"

    desc "请求控制台访问地址"

    rest {
        request {
            url "POST /v1/consoles"


            header(OAuth: 'the-session-uuid')

            clz APIRequestConsoleAccessMsg.class

            desc "请求控制台访问地址"

            params {

                column {
                    name "vmInstanceUuid"
                    enclosedIn "params"
                    desc "云主机UUID"
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
            clz APIRequestConsoleAccessEvent.class
        }
    }
}