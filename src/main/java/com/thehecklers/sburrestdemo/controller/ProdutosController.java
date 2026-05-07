package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.model.Produto;
import com.thehecklers.sburrestdemo.repository.ProdutoRepository;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutosController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @FXML
    private TableView<Produto> tabelaProdutos;

    @FXML
    private TableColumn<Produto, Long> colunaId;

    @FXML
    private TableColumn<Produto, String> colunaNome;

    @FXML
    private TableColumn<Produto, Double> colunaPreco;

    @FXML
    private TableColumn<Produto, Integer> colunaEstoque;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoPreco;

    @FXML
    private TextField campoEstoque;

    @FXML
    public void initialize() {
        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        colunaEstoque.setCellValueFactory(new PropertyValueFactory<>("estoque"));

        carregarTabela();

        tabelaProdutos.getSelectionModel().selectedItemProperty().addListener((obs, antigo, produto) -> {
            if (produto != null) {
                campoNome.setText(produto.getNome());
                campoPreco.setText(produto.getPreco().toString());
                campoEstoque.setText(produto.getEstoque().toString());
            }
        });
    }

    private void carregarTabela() {
        tabelaProdutos.setItems(FXCollections.observableArrayList(produtoRepository.findAll()));
    }

    @FXML
    public void adicionarProduto() {
        Produto produto = new Produto(
                campoNome.getText(),
                Double.parseDouble(campoPreco.getText()),
                Integer.parseInt(campoEstoque.getText())
        );

        produtoRepository.save(produto);
        carregarTabela();
        limparCampos();
    }

    @FXML
    public void atualizarProduto() {
        Produto produto = tabelaProdutos.getSelectionModel().getSelectedItem();

        if (produto != null) {
            produto.setNome(campoNome.getText());
            produto.setPreco(Double.parseDouble(campoPreco.getText()));
            produto.setEstoque(Integer.parseInt(campoEstoque.getText()));

            produtoRepository.save(produto);
            carregarTabela();
        }
    }

    @FXML
    public void excluirProduto() {
        Produto produto = tabelaProdutos.getSelectionModel().getSelectedItem();

        if (produto != null) {
            produtoRepository.delete(produto);
            carregarTabela();
            limparCampos();
        }
    }

    private void limparCampos() {
        campoNome.clear();
        campoPreco.clear();
        campoEstoque.clear();
    }
}