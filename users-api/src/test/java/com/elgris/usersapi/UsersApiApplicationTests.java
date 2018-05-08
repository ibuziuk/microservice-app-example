package com.elgris.usersapi;

import io.jsonwebtoken.Claims;

import javax.servlet.http.HttpServletRequest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.elgris.usersapi.api.UsersController;
import com.elgris.usersapi.models.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersApiApplicationTests {
    
    @Autowired
    UsersController controller;

	@SuppressWarnings("deprecation")
    @Test
	public void getUser() {
	    String username = "admin";
	    String firstName = "Foo";
	    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
	    Claims claims = Mockito.mock(Claims.class);
	    
	    Mockito.when(request.getAttribute("claims")).thenReturn(claims);
	    Mockito.when(claims.get("username")).thenReturn(username);
	    
	    User user = controller.getUser(request, username);
	    Assert.assertEquals(firstName, user.getFirstname());
	}

}
