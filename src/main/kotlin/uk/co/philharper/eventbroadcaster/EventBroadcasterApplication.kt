package uk.co.philharper.eventbroadcaster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventBroadcasterApplication

fun main(args: Array<String>) {
	runApplication<EventBroadcasterApplication>(*args)
}
