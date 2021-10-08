
public class Order_Progress implements State{
	
	RewardMachine machine;
	
	public Order_Progress(RewardMachine machine) {
		this.machine = machine;
		
	}


	@Override
	public void InsertOrder() {
		
		System.out.println(" Order_Progress State - Taco is in progress cannot order");
		
	}

	@Override
	public void Order_Progress() {
		System.out.println(" Order_Progress State - Your Taco order is prepared");
		machine.setState(machine.getOrder_progress());
	}

	@Override
	public void Order_Deleivered() {
		
		System.out.println(" Order_Progress State - Your Pizza preparing it will be delivered");
		
	}
	
	
	@Override
	public void TacoShopOpen() {
		System.out.println(" Order_Progress - Taco Shop is opened");
		
	}

	@Override
	public void TacoShopclosed() {
		System.out.println(" Order_Progress - Your Taco shop will close at 10PM");
		
	}

}