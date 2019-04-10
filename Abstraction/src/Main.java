
public class Main {

	public static void main(String[] args) {
		Study study =new Study("ndeme");
		Study stud =study;
		Study studyTwo =new Study("ndeme");
		System.out.println(study.equals(stud));
		System.out.println(study.equals(studyTwo));
	}

}
