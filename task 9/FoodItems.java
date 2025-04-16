class FoodItem{
	public static String Ingredients(String name){
		if(name=="Burger"){
			System.out.println("Burger Ingr Are:");
			return"Bun,tomato, onion, cheese, pickles, ketchup, mustard";
		}
		else if(name=="Pizza"){
			System.out.println("Pizza Ingr Are:");
			return"tomato sauce, mozzarella cheese, pepperoni or veggies, olive oil, oregano, basil";
		}
		else if(name=="Biryani"){
			System.out.println("Biryani Ingr Are:");
			return"Basmati rice, chicken/veg, onions, tomatoes, yogurt, saffron, garam masala, bay leaves, cloves, cardamom";
		}
		else if(name=="Potato Chips"){
			System.out.println("Potato Chips Ingr Are:");
			return"Potatoes, salt, oil, optional seasonings ,paprika, garlic powder, black pepper";
		}
		else if(name=="Samosa"){
			System.out.println("Samosa Ingr Are:");
			return"Maida (flour), potatoes, peas, cumin, garam masala, salt, oil, coriander, green chilies";
		}
		return "Ingredients Not Found";
	}
}
class FoodItems{
	public static void main(String[] args){
		String name="Burger";
		String food=FoodItem.Ingredients(name);
		System.out.println(food);
		
		name="Biryani";
		food=FoodItem.Ingredients(name);
		System.out.println(food);
		
		name="Samosa";
		food=FoodItem.Ingredients(name);
		System.out.println(food);
		
	}
}