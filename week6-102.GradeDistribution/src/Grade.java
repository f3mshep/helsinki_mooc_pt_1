import java.security.PublicKey;

public class Grade {

    private int score;

    public Grade(int score){
      if (score < 30){
          this.score = 0;
      } else if (score < 35) {
          this.score = 1;
      } else if (score < 40){
          this.score = 2;
      } else if (score < 45) {
          this.score = 3;
      } else if (score < 50) {
          this.score = 4;
      } else {
          this.score = 5;
      }
    }

    public int getScore() {
        return score;
    }

    public boolean isAccepted(){
        return score > 0;
    }

}
