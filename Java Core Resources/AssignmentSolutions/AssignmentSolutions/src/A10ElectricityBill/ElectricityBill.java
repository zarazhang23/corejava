package A10ElectricityBill;

public class ElectricityBill {
	private int meterNo;
	private String name;
	private String address;

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Electricity bill has meters " + meterNo + " name " + name + " and address " + address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			System.out.println("no input");
			return false;
		}
		if(this == obj) {
			System.out.println("same!");
			return true;
		}
		if(this.getClass()!=obj.getClass()) {
			System.out.println("diff class");
			return false;
		}
		ElectricityBill bill = (ElectricityBill) obj;		
		if(this.meterNo != bill.meterNo) {
			System.out.println(this.meterNo);
			System.out.println("unequal meter");
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public int hashCode() {
		return this.meterNo;
	}

}
