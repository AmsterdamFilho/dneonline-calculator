# quarkus-cxf-test

This repository is intended to test the client part of this quarkus extension:

https://github.com/shumonsharif/quarkus-cxf

It exposes a rest api that redirects requests to some public soap web service. Each branch tries a different web service.

It is necessary to execute the plugin cfx-codegen:wsdl2java before running the application.
