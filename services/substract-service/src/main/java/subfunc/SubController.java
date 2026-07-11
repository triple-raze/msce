package subfunc;

import java.math.BigDecimal;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import subfuncapi.api.SubtractApi;
import subfuncapi.models.Subtract200Response;
import subfuncapi.models.Operation;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * SubController
 */
  @RestController
public class SubController implements SubtractApi {
  
    @Override
  public ResponseEntity<Subtract200Response> subtract(BigDecimal a, BigDecimal b) {
    return subf(new Operation(a, b));
  }

    //@PostMapping("/sub")
  private ResponseEntity<Subtract200Response> subf(@RequestBody @Valid Operation op) { 
    Subtract200Response res = new Subtract200Response();
    res.result(Subtract.sub(op.getA(), op.getB()));
    ResponseEntity<Subtract200Response> resp = new ResponseEntity<Subtract200Response>(res, HttpStatusCode.valueOf(200));
    return resp;
  }
}
