package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("messages")
public class MessageController{
	@Autowired
	MessageMapper messageMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getMessages(){
		return messageMapper.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Message postMessages(@RequestBody Message message) {
		messageMapper.create(message);
		return message;
	}
	
	
	
}