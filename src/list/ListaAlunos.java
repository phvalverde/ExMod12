package list;

import domain.Aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAlunos {
        private static<T> List[] split(List<T> list) {

            List<T> male = new ArrayList();
            List<T> female = new ArrayList();

            int size = list.size();

            for (int i = 0; i < size; i++) {
                if (i < (size + 1)/2) {
                    male.add(list.get(i));
                }
                else {
                    female.add(list.get(i));
                }
            }
            return new List[] {male, female};
        }
    public static void main(String[] args) {
        ListaAluno();
    }

    private static List[] ListaAluno() {

        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a1 = new Aluno("Ana", "F");
        Aluno a2 = new Aluno("Paulo", "M");
        Aluno a3 = new Aluno("Bia", "F");
        Aluno a4 = new Aluno("Luan", "M");
        Aluno a5 = new Aluno("Alice", "F");
        Aluno a6 = new Aluno("Henrique", "M");
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);

        Collections.sort(lista);

        System.out.println("");
        System.out.println("*** Todos *** " + lista);

        List[] lists = split(lista);

        System.out.println("*** Masculino *** " + lists[1]);
        System.out.println("*** Feminino *** " + lists[0]);

        return lists;

    }

}

