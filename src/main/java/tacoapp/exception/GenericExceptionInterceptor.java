//package tacoapp.exception;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//import ru.axbit.resplan.inf.exception.ExceptionResponse;
//import ru.axbit.resplan.inf.exception.GenericException;
//
//
//@ControllerAdvice
//public class GenericExceptionInterceptor extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler(GenericException.class)
//    public ResponseEntity<ExceptionResponse> handleAllExceptions(GenericException ex) {
//        return new ExceptionResponse.Builder().withException(ex);
//    }
//
//}
