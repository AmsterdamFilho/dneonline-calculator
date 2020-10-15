package br.com.luvva;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.tempuri.CalculatorSoap;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@Tag(name = "default")
public class CalculatorResource {

    @Inject CalculatorSoap calculator;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("addition/{number1}/{number2}")
    public int get(@PathParam("number1") int number1, @PathParam("number2") int number2) {
        return calculator.add(number1, number2);
    }
}
