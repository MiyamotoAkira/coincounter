# coincounter

This is a simple coin counter. You can keep a track of your piggybank. No need to open it.

The main objective is to have a simple web application using Clojure deployed.

The technologies used are:

* Clojure for the web application.
    Compojure, Ring and Hiccup as the libraries that will handle the web calls
* Vagrant. It is going to be just set on my home network, so no need of anything else.
* Chef for provisiong the machine(s) created.
* Fabric for orchestration of deployments

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

The software has been developed using Java 1.8u91

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## License

This project is licensed under the MIT license. Please, check LICENSE.md
