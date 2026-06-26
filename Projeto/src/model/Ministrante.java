package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ministrante extends JFrame {

// construtor
	    private String nome;
	    private String telefone;
	    private String email;
	    private String dataNascimento;
	    private String ocupacao;

	    public Ministrante(String nome, String telefone, String email,String dataNascimento, String ocupacao) {
	    	
	        this.nome = nome;
	        this.telefone = telefone;
	        this.email = email;
	        this.dataNascimento = dataNascimento;
	        this.ocupacao = ocupacao;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public String getOcupacao() {
	        return ocupacao;
	    }

	    public void setOcupacao(String ocupacao) {
	        this.ocupacao = ocupacao;
	    }
	}