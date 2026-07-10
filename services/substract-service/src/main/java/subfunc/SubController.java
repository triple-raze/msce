package subfunc;

import java.math.BigDecimal;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import subfunc.api.SubApi;
import subfunc.models.*;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * SubController
 */
  @RestController
public class SubController implements SubApi {
  
    @Override
  public ResponseEntity<Sub200Response> sub(BigDecimal a, BigDecimal b) {
    return subf(new Operation(a, b));
  }

    //@PostMapping("/sub")
  private ResponseEntity<Sub200Response> subf(@RequestBody @Valid Operation op) { 
    Sub200Response res = new Sub200Response();
    res.result(Substract.sub(op.getA(), op.getB()));
    ResponseEntity<Sub200Response> resp = new ResponseEntity<Sub200Response>(res, HttpStatusCode.valueOf(200));
    return resp;
  }
}
