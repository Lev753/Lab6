import java.util.Random;
//test text
//mnogo bukaff
public class Lab6 {

    public static void main(String[] args) {
        int[] m = new int[12];
        int posCnt = 0;
        Random rnd = new Random();
        for(int i=0;i<m.length;i++) {
            m[i] = rnd.nextInt(10) + 1;
            if(posCnt == m.length/2) {
                m[i] = -m[i];
            }
            else if((m.length - i) > (m.length/2 - posCnt)) {
              int sgn = rnd.nextInt(2);
              m[i] = m[i] * (int)Math.pow(-1, sgn);
              posCnt += -sgn + 1;
            }
            System.out.print(m[i] + "  ");
        }
    }
}
