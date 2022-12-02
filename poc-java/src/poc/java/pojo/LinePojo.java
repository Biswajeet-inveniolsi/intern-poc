package poc.java.pojo;

public class LinePojo {

//LINE;001;REF00124;NewYork;25.00 (recordType;lineNumber;refDocNum;city;amount)
	
	private String recordType;
	private Integer lineNumber;
	private String refDocNum;
	private String city;
	private Double amount;
	
	public LinePojo(String recordType, Integer lineNumber, String refDocNum, String city, Double amount) {
		super();
		this.recordType = recordType;
		this.lineNumber = lineNumber;
		this.refDocNum = refDocNum;
		this.city = city;
		this.amount = amount;
	}
	
	public LinePojo() {
		
	}
	
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public Integer getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getRefDocNum() {
		return refDocNum;
	}
	public void setRefDocNum(String refDocNum) {
		this.refDocNum = refDocNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "LinePojo [recordType=" + recordType + ", lineNumber=" + lineNumber + ", refDocNum=" + refDocNum
				+ ", city=" + city + ", amount=" + amount + "]";
	}
	
	
	
}
