package br.com.luvva;

import https.www_w3schools_com.xml.TempConvertSoap;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.validation.constraints.NotEmpty;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Tag(name = "default")
public class TemperatureResource {

    @Inject TempConvertSoap service;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("conversion/celsius/{celsius}")
    public String get(@PathParam("celsius") @NotEmpty String celsius) {
        return service.celsiusToFahrenheit(celsius);
    }
}
