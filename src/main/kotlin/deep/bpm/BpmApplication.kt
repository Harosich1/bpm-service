package deep.bpm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BpmApplication

fun main(args: Array<String>) {
	runApplication<BpmApplication>(*args)
}
