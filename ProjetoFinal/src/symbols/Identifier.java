package symbols;

public class Identifier {
	private String text;
	private DataType type;
	private Integer  value;
	private boolean utl;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}
	
	public boolean getUtl() {
		return utl;
	}

	public void setUtl(boolean utl) {
		this.utl = utl;
	}
	
	// construtor
	public Identifier(String text, DataType type) {
		super();
		this.text = text;
		this.type = type;
	}

	public Identifier() {
		super();
	}

	@Override
	public String toString() {
		return "Identifier [text=" + text + ", type=" + type + ", value=" + value + "]";
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	

}
