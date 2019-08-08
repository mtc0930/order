package entity;

public class Ordercurse {
    private int id;
    private String cname;
    private double cprice;
    private int dianzan;
    
	public Ordercurse() {
	}
	public Ordercurse(int id, String cname, double cprice, int dianzan) {
		this.id = id;
		this.cname = cname;
		this.cprice = cprice;
		this.dianzan = dianzan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCprice() {
		return cprice;
	}
	public void setCprice(double cprice) {
		this.cprice = cprice;
	}
	public int getDianzan() {
		return dianzan;
	}
	public void setDianzan(int dianzan) {
		this.dianzan = dianzan;
	}
	@Override
	public String toString() {
		return "Ordercurse [id=" + id + ", cname=" + cname + ", cprice=" + cprice + ", dianzan=" + dianzan + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + dianzan;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordercurse other = (Ordercurse) obj;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (Double.doubleToLongBits(cprice) != Double.doubleToLongBits(other.cprice))
			return false;
		if (dianzan != other.dianzan)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
