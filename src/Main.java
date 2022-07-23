import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
Curso curso1= new Curso();
curso1.setTitulo("curso java");
curso1.setDescrição("descrição curso java");
curso1.setCargaHoraria(8);

Curso curso2= new Curso();
curso2.setTitulo("curso js");
curso2.setDescrição("descrição curso js");
curso2.setCargaHoraria(6);


Mentoria mentoria = new Mentoria();
mentoria.setTitulo("mentoria de java");
mentoria.setDescrição("descrição mentoria java");
mentoria.setData(LocalDate.now());



      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JavaDeveloper");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJessica = new Dev();
        devJessica.setNome("Jéssica");
        devJessica.inscreverBootcamp(bootcamp);
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Jéssica:" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Jéssica:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularXp());

        System.out.println("-----");


        Dev devJosé = new Dev();
        devJosé.setNome("José");
        devJosé.inscreverBootcamp(bootcamp);
        devJosé.progredir();
        devJosé.progredir();
        devJosé.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos José:"+ devJosé.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Jéssica:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJosé.calcularXp());






    }
}
