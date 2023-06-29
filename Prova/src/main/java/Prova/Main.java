package Prova;

import java.time.LocalDate;
import java.time.Month;

public class Main{
    public static void main(String[] args){
Motoboy motoboy = new Motoboy("39021844320", "Santana", "230857432105", "1435454", "rua de cima", Setor.OPERACOES, Genero.MASCULINO, 2.000, EstadoCivil.CASADO, LocalDate.of(2001, Month.MARCH, 12));

Gerente gerente = new Gerente("235", "James", "1352562264", "234635", "Rua de cercado", Setor.JURIDICO, Genero.MASCULINO, 5.000, EstadoCivil.SEPARADO, LocalDate.of(1995, Month.JULY, 1));
        
Engenheiro engenheiro = new Engenheiro("2452255", "Silvas", "321524543", "34625772", "rua do parafuso", Setor.ENGENHARIA, Genero.MASCULINO, 7.000, EstadoCivil.VIUVO, LocalDate.of(1997, Month.AUGUST, 19));
        
Diretor diretor = new Diretor(3.223, "Paulo", "35825246", "2463748884", "rua para baixo", Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 15.000, EstadoCivil.CASADO, LocalDate.of(2000, Month.APRIL, 23));

Diretor.Adimitir(motoboy);

        System.out.println(gerente.toString());
        System.out.println(engenheiro);
        System.out.println(diretor);
        
    }
}