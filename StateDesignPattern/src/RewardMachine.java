import java.util.ArrayList;
import java.util.List;

public class RewardMachine extends TacoBuilder {
	
	State order_progress;
	State insert_order;
	State ordere_closed;
	State shop_open;
	State shop_closed;
	
	String name;
	List<State> state_lists = new ArrayList<State>();
	
	
	State state ;
	
	public RewardMachine()
	{
		 order_progress = new Order_Progress(this);
		 insert_order = new InsertOrderStatus(this);
		 ordere_closed = new Order_Delievered(this);
		 shop_open= new TacoShopOpenStatus(this);
		 shop_closed= new TacoShopClosedStatus(this);
		 state= shop_open;
		 this.state_lists.add(shop_open);
		 
	}
	
	void addToppings(List<State> state_lists) {
		this.state_lists = state_lists;
	}
	
	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (State state_lists : state_lists) {
			System.out.println("   " + state_lists.toString());
		}
	}
  
	
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		for (State topping : state_lists) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
	
	public TacoBuilder takeorder() {
		
		System.out.println("We are calling the overrding the methods from Builder Class");
	
		state.InsertOrder();
		
		return this;
		
	
	}
	public TacoBuilder makeoder() {
		System.out.println("We are calling the overrding the methods from Builder Class");
		
		state.Order_Progress();
		return this;
	}
	
	public TacoBuilder deliver()
	{
		System.out.println("We are calling the overrding the methods from Builder Class");
		state.Order_Deleivered();
		return this;
	}
	
	public TacoBuilder openshop()
	{
		System.out.println("We are calling the overrding the methods from Builder Class");
		state.TacoShopOpen();
		return this;
	}
	public TacoBuilder closeShop() {
		System.out.println("We are calling the overrding the methods from Builder Class");
		state.TacoShopOpen();
		return this;
	}
	
	public State getOrder_progress() {
		return order_progress;
	}

	public void setOrder_progress(State order_progress) {
		this.order_progress = order_progress;
	}

	public State getInsert_order() {
		return insert_order;
	}

	public void setInsert_order(State insert_order) {
		this.insert_order = insert_order;
	}

	public State getOrdere_closed() {
		return ordere_closed;
	}

	public void setOrdere_closed(State ordere_closed) {
		this.ordere_closed = ordere_closed;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	


public State getShop_open() {
		return shop_open;
	}

	public void setShop_open(State shop_open) {
		this.shop_open = shop_open;
	}

	public State getShop_closed() {
		return shop_closed;
	}

	public void setShop_closed(State shop_closed) {
		this.shop_closed = shop_closed;
	}

public TacoBuilder operate(int item)
{

	
	System.out.println("We are calling the methods from Builder Class");
	if(item==1) {
		this.state_lists.add(shop_open);
		setState(shop_open);
		openshop();
		takeorder();
		makeoder();
		deliver();	
		closeShop();
		System.out.println(state_lists.toString());
		

	}
	if(item==2) {
		this.state_lists.add(insert_order);
		setState(insert_order);
		openshop();
		takeorder();
		makeoder();
		deliver();	
		closeShop();
		System.out.println(state_lists.toString());
		

	}
	if(item==3) {
		this.state_lists.add(order_progress);
		setState(order_progress);
		openshop();
		takeorder();
		makeoder();
		deliver();	
		closeShop();
		System.out.println(state_lists.toString());
		

	}else if(item==4)
	{
		this.state_lists.add(ordere_closed);
		setState(ordere_closed);
		openshop();
		takeorder();
		makeoder();
		deliver();	
		closeShop();
		System.out.println(state_lists.toString());
	
		
	}else if(item==5)
	{
		this.state_lists.add(shop_closed);
		setState(shop_closed);
		takeorder();
		makeoder();
		deliver();	
		closeShop();
		System.out.println(state_lists.toString());
		
	}
	else if(item==6)
	{
		System.out.println(state_lists.toString());
	}
	
	return this;
}



}
