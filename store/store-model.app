module store/store-model

entity Store {
	name: String
	discounts -> Set<Discount> (inverse=Discount.store)
}
