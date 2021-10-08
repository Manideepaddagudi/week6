
public class InsertOrderStatus  implements State{

	
	RewardMachine machine;
	

	public InsertOrderStatus(RewardMachine machine) {
		this.machine = machine;
		
	}
	
	@Override
	public void InsertOrder() {
		
		System.out.println(" InsertOrder State - Your Taco order is Inserted");
		machine.setState(machine.getInsert_order());
		
		
		
	}

	@Override
	public void Order_Progress() {
	
		System.out.println(" InsertOrder State - Your Taco is not Order");
		
	}

	@Override
	public void Order_Deleivered() {
		
		System.out.println(" InsertOrder State - Your  Taco is not ordered");
		
	}

	@Override
	public void TacoShopOpen() {
		System.out.println(" InsertOrder State - Your Taco shop is Open from 9AM-10PM");
		
	}

	@Override
	public void TacoShopclosed() {
		System.out.println(" InsertOrder State - Your Taco shop is from 9AM-10PM");
		
	}
}