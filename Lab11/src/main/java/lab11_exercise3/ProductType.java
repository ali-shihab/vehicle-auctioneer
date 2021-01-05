package lab11_exercise3;

public enum ProductType {
	  ITALIAN("Italian"), CHINESE("Chinese"), INDIAN("Indian"), TRADITIONAL("Traditional");
	
  String type = null;
  
  private ProductType(String type) {
	this.type = type;
  }
  
  public String getType() {
	  return this.type;
  }
}

