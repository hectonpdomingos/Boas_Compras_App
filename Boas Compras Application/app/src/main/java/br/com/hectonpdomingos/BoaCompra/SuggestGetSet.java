package br.com.hectonpdomingos.BoaCompra;

public class SuggestGetSet {

	String id,name,empresa,price;
	public SuggestGetSet(String id, String name, String empresa, String price){
		this.setId(id);
		this.setName(name);
		this.setEmpresa(empresa);
		this.setPrice(price);
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { this.name = name;}

	public String getEmpresa() {return empresa;	}

	public void setEmpresa(String empresa) {this.empresa = empresa;	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {this.price = price;	}


}
