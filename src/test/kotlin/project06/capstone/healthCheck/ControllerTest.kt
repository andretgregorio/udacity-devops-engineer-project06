package project06.capstone.healthCheck

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class ControllerTest {
    @Inject()
    @field:Client("/")
    lateinit var client: RxHttpClient

    @Test
    fun testHealthCheck() {
        val request: HttpRequest<Any> = HttpRequest.GET("/health")
        val body = client.toBlocking().retrieve(request)

        Assertions.assertNotNull(body)
        Assertions.assertEquals("Ok", body)
    }
}