package deep.bpm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableDiscoveryClient
class BpmApplication

fun main(args: Array<String>) {
	runApplication<BpmApplication>(*args)
}
