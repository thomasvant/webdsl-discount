module layout/layout-view

section components

template formEntry(text: String) {
	div[class="entry__container"] {
		span[class="entry__text"]{output(text)}
		elements
	}
}

template formEntry(text: String, explanation: String) {
	formEntry(text) {
		elements
		span[class="entry__hint"]{output(explanation)}
	}
}

template pageHeader(text: String) {
	h1 {
		output(text)
	}
}

section layouts

template nav {
	div[class="nav__logo__wrapper"] {
		navigate root()[class="nav__logo"]{"Discount"}
	}
	list[class="nav__action__list"] {
		if (!loggedIn()) {
			listitem {navigate signin(){"Sign in"}}
			listitem {navigate register()[class="pill"]{"Register"}}
		} else {
			listitem {navigate profile(securityContext.principal)[class="pill"]{"Profile"}}
		}
	}
}

template content {
	div[class="container"] {
		elements
	}
}

template main {
	nav
	content {
		elements
	}
}
