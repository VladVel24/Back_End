package de.ait.users.controller;

import de.ait.users.entity.User;
import de.ait.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService service;

   @Autowired
    public UserController(UserService service) {
        this.service = service;
    }
// GET /users
// GET /users?n=jack запись одинакова на этот метод

    @GetMapping("/users" )
    public List<User> getAllUsers(@RequestParam(name="n",required = false, defaultValue = "") String name,
                                  @RequestParam(name="e",required = false, defaultValue = "") String email ) {

        return service.getUsers(name,email);
    }

    @PostMapping("/users")
    public User createNewUser(@RequestBody User user) {
       return service.createNewUser(user);
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
       return service.findById(id);
    }
}

//@GetMapping("/users/{userid}/accounts/{accountId}")
//public User getUserById(
//                        @PathVariable(name="accountId") Long accId
//                        @PathVariable(name ="userId") Long userId)

