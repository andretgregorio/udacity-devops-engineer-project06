package project06.capstone.healthCheck

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/health")
class Controller {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun getHealthCheck(): String {
        return "Ok"
    }
}