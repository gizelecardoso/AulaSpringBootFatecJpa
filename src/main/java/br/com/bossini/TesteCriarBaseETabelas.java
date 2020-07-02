package br.com.bossini;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {
		//bossiniPU - na config do persistence, obtendo uma fabrica de entity manager - um gerenciador de entidades   - BASE SERÁ CRIADA
		Persistence.createEntityManagerFactory("bossiniPU");

	}

}
