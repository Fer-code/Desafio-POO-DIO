import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição");
        curso.setCargahoraria(8);
        //System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição do curso de c#");
        curso2.setCargahoraria(7);
        //System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria titulo");
        mentoria.setDescricao("Descrição");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDesc("Desc Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("------------------");


        Dev devFernanda = new Dev();
        devFernanda.setNome("Fernanda");
        devFernanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Fernanda: "+devFernanda.getConteudosInscritos());
        devFernanda.progredir();
        //devFernanda.progredir();
        System.out.println("----");

        System.out.println("Conteudos inscritos Fernanda: "+devFernanda.getConteudosInscritos());
        System.out.println("Conteudos concluidos Fernanda: "+devFernanda.getConteudosConcluidos());
        System.out.println("XP: " + devFernanda.calcularXp());

        System.out.println("------------------");


        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Gabriel: "+devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("----");
        System.out.println("Conteudos inscritos Gabriel: "+devGabriel.getConteudosInscritos());
        System.out.println("Conteudos concluidos Gabriel: "+devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularXp());



    }
}
