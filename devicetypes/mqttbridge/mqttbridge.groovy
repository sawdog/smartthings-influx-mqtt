/**
 *  SmartThings MQTT Bridge Device Handler
 *
 *  Copyright 2018 Andrew Sawyers
 *
 */
metadata {
	definition (name: "SmartThings MQTT Bridge Device Handler", namespace: "Sawdog", author: "Andrew Sawyers") {
		capability "Bridge"
		capability "Notification"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"

}

// handle commands
def deviceNotification() {
	log.debug "Executing 'deviceNotification'"
	// TODO: handle 'deviceNotification' command
}
