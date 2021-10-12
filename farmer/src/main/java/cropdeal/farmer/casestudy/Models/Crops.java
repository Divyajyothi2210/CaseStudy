package cropdeal.farmer.casestudy.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CropDetails")
public class Crops {
    private int cropId;
    private String name;
    private int quantity;
    private double cost;
    private String type;
    private int farmerid;
    public Crops() {
    	
    }
public Crops(int cropId, String name, int quantity, double cost, String type, int farmerid) {
	super();
	this.cropId = cropId;
	this.name = name;
	this.quantity = quantity;
	this.cost = cost;
	this.type = type;
	this.farmerid = farmerid;
    }
public int getCropId() {
	return cropId;
}
public void setCropId(int cropId) {
	this.cropId = cropId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getFarmerid() {
	return farmerid;
}
public void setFarmerid(int farmerid) {
	this.farmerid = farmerid;
}

}


