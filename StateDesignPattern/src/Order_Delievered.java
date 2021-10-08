
public class Order_Delievered implements State{
	
	
	
	
	RewardMachine machine;
	
	public Order_Delievered(RewardMachine machine) {
		this.machine = machine;
		
	}
	
	@Override
	public void InsertOrder() {
		
		System.out.println(" Order_Delievered State - Taco machine Deleivered your order");
		
	}

	@Override
	public void Order_Progress() {
	
		System.out.println(" Order_Delievered State - Taco machine is Prepared your order");
		
	}

	@Override
	public void Order_Deleivered() {
		
		System.out.println(" Order_Delievered State - Your Taco order is delivered");
		machine.setState(machine.getOrdere_closed());
	}
	
	@Override
	public void TacoShopOpen() {
		System.out.println(" Order_Delievered - Taco Shop is opened");
		
	}

	@Override
	public void TacoShopclosed() {
		System.out.println(" Order_Delievered - Your Taco shop will close at 10PM");
		
	}

}
