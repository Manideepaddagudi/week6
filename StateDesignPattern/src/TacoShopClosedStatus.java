
public class TacoShopClosedStatus  implements State{

	
	RewardMachine machine;
	

	public TacoShopClosedStatus(RewardMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void InsertOrder() {
		
		System.out.println(" TacoShopClosed State - Shop is closed");

		
	}

	@Override
	public void Order_Progress() {
	
		System.out.println(" TacoShopClosed State - Shop is closed");
		
	}

	@Override
	public void Order_Deleivered() {
		System.out.println(" TacoShopClosed State - Shop is closed");
	}
	
	

	@Override
	public void TacoShopOpen() {
		System.out.println(" TacoShopClosed - Sorry we are closed");
		
	}

	@Override
	public void TacoShopclosed() {
		System.out.println(" TacoShopClosed - Your Taco shop is closed, It opens at from 9AM-10PM");
		machine.setState(machine.getShop_closed());
		
	}
}