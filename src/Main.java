import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(7);
        System.out.println(curso1);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        /*Por causa do polimorfismo podemos criar um objeto curso a partir do
          da classe Conteudo, mesmo ela sendo abstrata
          Conteudo conteudo = new Curso();
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        System.out.println("--------");

        Dev devCamila= new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Camila: "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: "+devCamila.getConteudosConcluidos());
        System.out.println("XP:"+devCamila.calcularTotalXp());
        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos João: "+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: "+devJoao.getConteudosConcluidos());
        System.out.println("XP:"+devJoao.calcularTotalXp());
    }
}