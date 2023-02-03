import com.digitalhouse.model.Leao;
import com.digitalhouse.model.Tigre;

public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Simba", 18, true);

        leao.correr();

        try {
            leao.ehMaiorQue10();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Tigre tigre = new Tigre("Pantro", -1, true);

        tigre.correr();

        try {
            tigre.ehMaiorQue10();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}