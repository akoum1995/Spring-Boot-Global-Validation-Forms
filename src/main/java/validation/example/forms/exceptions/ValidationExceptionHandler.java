package validation.example.forms.exceptions;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import validation.example.forms.utils.ErrorResponse;

@ControllerAdvice
@ResponseBody
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler
{
	 @Override
	  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	      HttpHeaders headers, HttpStatus status, WebRequest request) {
		 Map<String, String> errors = new HashMap<>();
		    ex.getBindingResult().getFieldErrors().forEach(error -> 
		        errors.put(error.getField(), error.getDefaultMessage()));
	    ErrorResponse errorResponse = new ErrorResponse("Validation Failed", errors);
	    return new ResponseEntity<Object>(errorResponse, HttpStatus.NOT_ACCEPTABLE);
	  }
}