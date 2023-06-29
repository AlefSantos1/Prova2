package Prova;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }


    @Override
    public double getSalarioFinal() {
        System.out.println("Admitindo funcionario: ");
        return = get.Admitir;
        
          System.out.println("Demitindo funcionario: ");
         return = get.Demitir;

        
    }    
