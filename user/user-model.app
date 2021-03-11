module user/user-model

principal is User with credentials email, password

access control rules
	rule page root{true}

section user

entity User {
	name: String
	email: Email
	password: Secret
	store: Bool := false
	admin: Bool := false
	discounts -> Set<Discount> (inverse=Discount.creator)
}

section registration

extend entity User {
	function register() {
		email := email.toLowerCase();
		password := password.digest();
		
		//TODO: Unique email verification 
		this.save(); 
	}
}

section sign in

extend entity User {
	function signIn() {
		validate(authenticate(email, password), "Invalid credentials");
	}
}

section sign out

extend entity User {
	function signOut() {
		securityContext.principal := null;
	}
}