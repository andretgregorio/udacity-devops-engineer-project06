package project06.capstone

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("project06.capstone")
		.start()
}
