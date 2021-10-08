import java.util.ArrayList;
import java.util.List;

public abstract class TacoBuilder {
	
	String name;
	List<State> state_lists = new ArrayList<State>();
	
	public abstract TacoBuilder takeorder();
	public abstract TacoBuilder makeoder();
	public abstract TacoBuilder openshop();
	public abstract TacoBuilder closeShop();
	public abstract TacoBuilder deliver();
	public abstract TacoBuilder operate(int item);
	
	public RewardMachine build() {
		RewardMachine pizza = new RewardMachine();
		pizza.setName(this.name);
		pizza.addToppings(state_lists);
		return pizza;
	}


}
