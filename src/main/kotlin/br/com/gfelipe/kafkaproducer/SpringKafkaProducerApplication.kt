package br.com.gfelipe.kafkaproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKafkaProducerApplication

fun main(args: Array<String>) {
	runApplication<SpringKafkaProducerApplication>(*args)
}
