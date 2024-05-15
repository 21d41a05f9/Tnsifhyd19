import com.hficinema.*;
//import com.hficinema.Sharuk;
import com.tficinema.*;
//import com.tficinema.PawanKalyan;
//import com.tficinema.Prabhas;

public class IndianMovies {

	public static void main(String[] args) 
	{
	PawanKalyan pk=new PawanKalyan();
	Ntr ntr=new Ntr();
	Prabhas pra=new Prabhas();
	Sharuk shr=new Sharuk();
	Hrithik hk=new Hrithik();
	System.out.println("PawanKalyan's movie:" +pk.movie());
	System.out.println("PawanKalyan's movie directed by:" +pk.director());
	System.out.println("PawanKalyan's movie songs:" +pk.song());
	System.out.println("Ntr's movie:" +ntr.movie());
	System.out.println("Ntr's movie directed by:" +ntr.director());
	System.out.println("Ntr's movie songs:" +ntr.song());
	System.out.println("Prabhas's movie:" +pra.movie());
	System.out.println("Prabhas's movie directed by:" +pra.director());
	System.out.println("Prabhas's movie songs:" +pra.song());
	System.out.println("Sharuks's movie:" +shr.movie());
	System.out.println("Sharuks's movie directed by:" +shr.director());
	System.out.println("Sharuks's movie song:" +shr.song());
	System.out.println("Hrithik's movie:" +hk.movie());
	System.out.println("Hrithik's movie directed by:" +hk.director());
	System.out.println("Hrithik's movie songs:" +hk.song());		
}
}
