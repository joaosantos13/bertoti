package com.thehecklers.sburrestdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/vegetais")
class RestApiDemoController {
    private final List<Produto> produtos = new ArrayList<>();

	public RestApiDemoController() {
    produtos.addAll(List.of(
            new Produto("Tomate"),
            new Produto("Alface"),
            new Produto("Pepino"),
            new Produto("Salada de Frutas")
    ));
}

	@GetMapping
	Iterable<Produto> getProduto() {
		return produtos;
	}

	@GetMapping("/{id}")
	Optional<Produto> getProdutoById(@PathVariable String id) {
		for (Produto c: produtos) {
			if (c.getId().equals(id)) {
				return Optional.of(c);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Produto postProduto(@RequestBody Produto produto) {
		produtos.add(produto);
		return produto;
	}

	@PutMapping("/{id}")
	ResponseEntity<Produto> putProduto(@PathVariable String id,
									 @RequestBody Produto produto) {
		int produtoIndex = -1;

		for (Produto c: produtos) {
			if (c.getId().equals(id)) {
				produtoIndex = produtos.indexOf(c);
				produtos.set(produtoIndex, produto);
			}
		}

		return (produtoIndex == -1) ?
				new ResponseEntity<>(postProduto(produto), HttpStatus.CREATED) :
				new ResponseEntity<>(produto, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteProduto(@PathVariable String id) {
		produtos.removeIf(c -> c.getId().equals(id));
	}
}

class Produto {
	private final String id;
	private String name;

	@JsonCreator
	public Produto(@JsonProperty("id") String id, @JsonProperty("name") String name){
		this.id = id;
		this.name = name;
	}

	public Produto(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}