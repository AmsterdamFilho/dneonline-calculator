package br.com.luvva;

import com.dataaccess.webservicesserver.NumberConversionSoapType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;

@Path("/")
@Tag(name = "default")
public class NumberConversionResource {

    @Inject NumberConversionSoapType service;

    @POST
    @Path("{number}")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@PathParam("number") @NotNull BigInteger number) {
        return service.numberToWords(number);
    }
}
