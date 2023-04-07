@service;
package com.ApI;

public class userservice 
{
	 @Autowired
	    private UserRepository userRepository;
	 
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
	 
	    public User getUserById(Long id) {
	        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	    }
	 
	    public User createUser(User user) {
	        return userRepository.save(user);
	    }
}

public User updateUser(Long id, User user) {
    User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

    existingUser.setName(user.getName());
    existingUser.setEmail(user.getEmail());
    existingUser.setPhone(user.getPhone());

    return userRepository.save(existingUser);
}

public void deleteUser(Long id) {
    userRepository.deleteById(id);
}
}
	 
	   