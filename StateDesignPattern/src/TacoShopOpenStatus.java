
public class TacoShopOpenStatus  implements State{

	
	RewardMachine machine;
	

	
	
	public TacoShopOpenStatus(RewardMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void InsertOrder() {
		
		System.out.println(" TacoShopOpenStatus State - We can take your order");
		
		
	}

	@Override
	public void Order_Progress() {
	
		System.out.println(" TacoShopOpenStatus State - Your Taco is not Order");
		
	}

	@Override
	public void Order_Deleivered() {
		
		System.out.println(" TacoShopOpenStatus State - Your  Taco is not ordered");
		
	}


	@Override
	public void TacoShopOpen() {
		System.out.println(" TacoShopOpen State - Your Taco shop is Opened. Please place you order");
		machine.setState(machine.getShop_open());
		
	}

	@Override
	public void TacoShopclosed() {
		System.out.println(" TacoShopOpen State - Your Taco shop is from 9AM-10PM");
		
	}
}