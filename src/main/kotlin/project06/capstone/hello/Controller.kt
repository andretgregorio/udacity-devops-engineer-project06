package project06.capstone.hello

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class Controller {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun getHello(): String {
        return "Hello from Udacity!!!"
    }
}