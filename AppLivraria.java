package segundoPeriodo.editoraAssociacaoArray;

public class AppLivraria {

    public static void main(String[] args) {

        Editora editora = new Editora("Saber Infotech");

        Autor autor1 = new Autor(1, "Aldo Santos", "aldosantos@gmail.com");
        Autor autor2 = new Autor(2,"Also Souza","aldosouza@gmail.com");
        Autor autor3 = new Autor(3,"Aldo Silva", "aldosilva@gmail.com");

        Autor[] autores = new Autor[3];
        autores[0] = autor1;
        autores[1] = autor2;
        autores[2] = autor3;

        Livro livro = new Livro(1, "Java com Aldo", "ASBJ125",editora, autores);

        System.out.println(livro);
    }
}
