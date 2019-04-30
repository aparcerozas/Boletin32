/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

/**
 *
 * @author aparcerozas
 */
public class Alumno {
    
    public class Enderezo {
        
        private String rua;
        private int numero;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }
        
    }
    
    private String nome;
    private int nota;
    private Enderezo enderezo;

    public Alumno() {
    }

    public Alumno(String nome, int nota, String rua, int numero) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = new Enderezo(rua, numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", " + enderezo.toString() + '}';
    }
    
    public String amosar(){
        return this.toString();
    }
    
    public void cambiarNota(int nota){
        this.nota=nota;
    }
    
    
}
