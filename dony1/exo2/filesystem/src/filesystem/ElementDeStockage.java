package filesystem;

public abstract class ElementDeStockage {
	protected String name;
	protected int basicSize;
	protected Directory Daddy;
	
	public ElementDeStockage(String name,Directory daddy){
		this.name=name;
		this.basicSize=getBasicSize();
		this.Daddy=daddy;
		this.Daddy.YouAreMyDaddy(this);
	}
	
	abstract public int size();
	abstract public String absoluteAddress();
	abstract public void ls();
	abstract public int nbElem();
	
	abstract protected int getBasicSize();
}
