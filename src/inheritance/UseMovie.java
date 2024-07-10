package inheritance;

public class UseMovie {
	public  static void main(String args[]) {
		ActionMovie A= new ActionMovie();
		System.out.println(A.findMovie(7));
		

}
}



class ActionMovie extends Movie{
	public String findMovie(int ratings) {
		return " goodmovie";
	}
}
class Movie{
	public String findMovie(int rating) {
		return " "+"worstmovie";
		
	}
}