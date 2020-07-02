package br.com.bossini.model.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	
	@OneToMany(mappedBy = "feedback", cascade = CascadeType.ALL) //ACONTECEU COM FEEDBACK ACONTECE COM CONSUMO.
	private List<Consumo> consumo;

	public List<Consumo> getConsumo() {
		return consumo;
	}
	public void setConsumo(List<Consumo> consumo) {
		this.consumo = consumo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
