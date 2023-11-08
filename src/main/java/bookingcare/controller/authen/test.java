package bookingcare.controller.authen;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bookingcare.dto.request.SignUpForm;
import bookingcare.dto.request.requestform;
import bookingcare.dto.response.ResponMessage;


@RequestMapping("/api/user")
@RestController
public class test {
	
	@PostMapping("/test")
    public ResponseEntity<?> register(@RequestBody requestform requestform){
    	
    	System.out.println("signin");
    	String a = requestform.getUsername();       
        return new ResponseEntity<>(new ResponMessage("yess1"), HttpStatus.OK);
    }
	
	@GetMapping("/testget")
    public ResponseEntity<?> register(){
    	
    	System.out.println("signin");
    	      
        return new ResponseEntity<>(new ResponMessage("yess2"), HttpStatus.OK);
    }
	
}
