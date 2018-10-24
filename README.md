# Groovy Code for a SmartThings --> <bridge> RethinkDB DeviceHandler and SmartApp

This handles the sending and subscribing (without the full subscription functionality implemented) of messages between SmartThings and RethinkDB.
This is based on the MQTT package but is will be varying quickly as I continue to make improvements for the needs of this context.

The python 3 pyramid application for the bridge can be found here: [SmartThings Bridge](https://github.com/sawdog/smartthings-bridge)

The Docker container running the bridge can be found here:[Docker Container: SmartThings Bridge](https://hub.docker.com/r/sawdog/smartthings-bridge/)
