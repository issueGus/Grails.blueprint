package com.issue

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/api/test/$action?/$id?" (controller: 'test')

        "/api/test/index" (controller: 'test', action: 'index', method: 'GET')

        "/book/$action?/$id?" (controller: 'book')

        "/test/$action?/$id?" (controller: 'test')
    }
}
