import io.jsonwebtoken.Claims;

public class Main {

	public static void main(String[] args) {
		
		JWT jwt=new JWT();
		String token= "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxIiwic3ViIjoieHgiLCJpc3MiOiJadWxhQ2FicyIsImlhdCI6MTYzMzk0MTQ3NSwiZXhwIjoxNjMzOTQxNTM1fQ.abxOWannPAg6NQs3P_bgcaldRjVi8ZA7GDW74SI1tlc";
		
		
		
		System.out.println(jwt.isVaildToken(token));
		

	}

}
