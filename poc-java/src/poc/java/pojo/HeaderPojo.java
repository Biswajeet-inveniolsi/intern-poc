package poc.java.pojo;

public class HeaderPojo {

//	Header fields: recordType, totalLines, totalAmt, minAmt, currentDate HAUDIT;6;170.00;10;2022-11-28
	private String recordType;
	private Integer totalLines;
	private Double totalAmt;
	private Double minAmt;
	private String currentDate;
	
	
	
	
	public HeaderPojo(String recordType, Integer totalLines, Double totalAmt, Double minAmt, String currentDate) {
		super();
		this.recordType = recordType;
		this.totalLines = totalLines;
		this.totalAmt = totalAmt;
		this.minAmt = minAmt;
		this.currentDate = currentDate;
	}
	
	public HeaderPojo() {

	}
	
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public Integer getTotalLines() {
		return totalLines;
	}
	public void setTotalLines(Integer totalLines) {
		this.totalLines = totalLines;
	}
	public Double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Double getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(Double minAmt) {
		this.minAmt = minAmt;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	@Override
	public String toString() {
		return "Header [recordType=" + recordType + ", totalLines=" + totalLines + ", totalAmt=" + totalAmt
				+ ", minAmt=" + minAmt + ", currentDate=" + currentDate + "]";
	}
	
	
}
