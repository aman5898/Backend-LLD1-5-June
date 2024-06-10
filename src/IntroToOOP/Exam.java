package IntroToOOP;

public class Exam {
        int exam_id;
        int exam_score;

        public Exam(int exam_id, int exam_score) {
            this.exam_id = exam_id;
            this.exam_score = exam_score;
        }

        public Exam(Exam other){
            this.exam_id = other.exam_id;
            this.exam_score = other.exam_score;
        }
}
