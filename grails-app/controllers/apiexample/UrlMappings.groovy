package apiexample

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/books"(resources:'book')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
