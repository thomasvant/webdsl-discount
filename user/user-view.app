module user/user-view

imports user/user-model

access control rules
	rule page register() {!loggedIn()}
	rule page signin() {!loggedIn()}
	rule page profile(user: User) {loggedIn()}

section templates 

template personal {
	// Init
	var user := securityContext.principal
	
	// Content 
	main {
		pageHeader("Welcome ~user.name")
		form {
			submit signOut(){"Sign out"}
		}
	}
	
	action signOut() {
		user.signOut();
		return root();
	}
}

template user(user: User) {
	
}

section registration

page register() {
	// Init 
	var user := User{}
	var password: Secret
	
	// Head 
	title{"Register"}

	// Content 
	main{
		pageHeader("Register")
		form {
			formEntry("Name", "Your name will be visible to other users."){input(user.name)}
			formEntry("Email"){input(user.email)}
			formEntry("Password"){input(user.password)}
			formEntry("Verify password"){input(password)}
			submit register(){"Register"}
		}
	}
	
	// Functions 
	action register() {
		validate(user.password == password, "Passwords do not match.");
		user.register();
		message("You have been registered, you can now sign in");
		return signin();
	}
}

section sign in 

page signin() {
	// Init 
	var user := User{}
	
	// Head 
	title{"Sign in"}

	// Content 
	main{
		pageHeader("Sign in")
		form {
			formEntry("Email"){input(user.email)}
			formEntry("Password"){input(user.password)}
			submit signIn(){"Sign in"}
		}
		navigate register(){"Register"}
	}
	
	// Functions 
	action signIn() {
		user.signIn();
		return root();
	}
}

section profile

page profile(user: User) {
	// Head
	title{"Profile of ~user.name"}

	// Content
	if (securityContext.principal == user) {
		personal
	} else {
		user(user)
	}
}