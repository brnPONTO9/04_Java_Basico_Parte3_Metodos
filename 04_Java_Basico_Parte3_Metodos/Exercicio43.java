public class Exercicio43 {
    static int buscaRecursiva(int[] v, int alvo, int ini, int fim) {
        if (ini > fim) return -1;
        int meio = ini + (fim - ini) / 2;
        if (v[meio] == alvo) return meio;
        return alvo < v[meio] ? buscaRecursiva(v, alvo, ini, meio - 1) : buscaRecursiva(v, alvo, meio + 1, fim);
    }
    static int buscaIterativa(int[] v, int alvo) {
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            int meio = ini + (fim - ini) / 2;
            if (v[meio] == alvo) return meio;
            if (alvo < v[meio]) fim = meio - 1; else ini = meio + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] v = {1, 3, 5, 7, 9, 11, 13};
        for (int alvo : new int[]{7, 1, 13, 4})
            System.out.println(alvo + ": rec=" + buscaRecursiva(v, alvo, 0, v.length - 1) + " it=" + buscaIterativa(v, alvo));
        // Mesma complexidade O(log n); a iterativa evita o custo de pilha das chamadas.
    }
}
