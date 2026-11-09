class Animal {
    void falar() { System.out.println("O animal faz um som"); }
}
class Cachorro extends Animal {
    @Override void falar() { System.out.println("Au au"); }
}
class Gato extends Animal {
    @Override void falar() { System.out.println("Miau"); }
}
public class Exercicio40 {
    public static void main(String[] args) {
        Animal[] animais = {new Animal(), new Cachorro(), new Gato()};
        for (Animal a : animais) a.falar(); // despacho dinâmico: a versão chamada depende do objeto real
    }
}
