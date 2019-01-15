package endpoint;



import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.el.parser.AstListData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import error.CustomErrorType;
import model.Users;

@RestController
@RequestMapping("users")
public class UsersEndpoint {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listAll(){
		return new ResponseEntity<>(Users.listUsers, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.GET, path="/{id}")
	public ResponseEntity<?> getUsersById(@PathVariable("id") Integer id){
	
		//Fazer a busca na base de Dados, se nao encontrar
			//return new ResponseEntity<> (new CustomErrorType(errorMessage : "Usuário não encontrado"), HttpStatus.NOT_FOUND);
		return null;
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Users user){
		//Salvar dados na Base
		
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	

}
