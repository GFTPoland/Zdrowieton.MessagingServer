# Back-end for Zdrowieton hackathon
 
Information about the hackathon itself can be found [here](http://zdrowieton.pl/).

This simple server is based on Spring Websocket project and enables websocket communication.
 
## How to use it?

Connecting:

`/zdrowieton-websocket`

Subscribing:

`/topic/_name_`

Sending messages:

`/send/_name_`

## Building and running

`gradle bootRun`

## Deployment

First, create Docker image:

`gradle buildDocker`

Send image to the host machine:

`docker save gftpoland/zdrowieton-backend | ssh _machine_ docker load`