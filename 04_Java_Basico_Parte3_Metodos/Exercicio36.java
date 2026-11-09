public class Exercicio36 {
    public void metodoPublic() { System.out.println("public: acessível de qualquer classe"); }
    protected void metodoProtected() { System.out.println("protected: mesmo pacote e subclasses"); }
    void metodoPackagePrivate() { System.out.println("package-private: apenas classes do mesmo pacote"); }
    private void metodoPrivate() { System.out.println("private: apenas dentro desta classe"); }
    public static void main(String[] args) {
        Exercicio36 e = new Exercicio36();
        e.metodoPublic();
        e.metodoProtected();
        e.metodoPackagePrivate();
        e.metodoPrivate(); // aqui dentro da própria classe todos são acessíveis
    }
}
