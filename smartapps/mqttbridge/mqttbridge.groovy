/**
 *  SmartThings MQTT Bridge SmartApp
 *
 *  Copyright 2018 Andrew Sawyers
 *
 */
definition(
    name: "SmartThings MQTT Bridge SmartApp",
    namespace: "sawdog",
    author: "Andrew Sawyers",
    description: "HTTP Bridge for JSON to MQTT Messaging between Smartthings and RabbitMQ MQTT",
    category: "My Apps",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png",
    iconX3Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png")


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers
