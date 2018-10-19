package com.andrerocha.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa fisica"),
	PESSOAJURIDICA(2, "Pessoa juridica");
	
	private Integer codigo;
	private String descricao;
	
	private TipoCliente(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("ID inválido " + codigo);
	}
}
