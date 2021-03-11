module discount/discount-model

section discount

entity Discount {
	code: String
	claimed: Bool := false
	dueDate: Date
	creator -> User
	store -> Store
	function isDue(): Bool {
		return dueDate.before(today().addDays(1));
	}
}