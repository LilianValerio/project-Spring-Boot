package endpoint;



import java.util.List;

import org.apache.el.parser.AstListData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Users;

@RestController
@RequestMapping("users")
public class UsersEndpoint {

	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Users> listAll(){


		return null ;
	}

}
