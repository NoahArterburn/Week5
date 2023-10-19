/**
 * @author Noah - Arterburn
 * CIS175 - Fall 2023
 * Oct 13, 2023
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "cats")
@Table(name = "cats")
public class cat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;

	private String Name;
	private String breedName;
	private double avgSize;

	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getbreedName() {
		return breedName;
	}

	public void setbreedName(String breedName) {
		this.breedName = breedName;
	}

	public double getavgSize() {
		return avgSize;
	}

	public void setavgSize(double avgSize) {
		this.avgSize = avgSize;
	}

}
