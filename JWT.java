import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

class JWT {
	public String generateToken(String id,String name)
	{
		String key="SecretZula";
		return Jwts.builder()
				.setId(id)
				.setSubject(name)
				.setIssuer("ZulaCabs")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(1)))
				.signWith(SignatureAlgorithm.HS256,
						
				Base64.getEncoder().encode(key.getBytes()))
				.compact();		
	}
	
	public Claims getClaims(String token)
	{
		String key="SecretZula";
		return Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
				.parseClaimsJws(token)
				.getBody();
	}
	
	public String getSubject(String token)
	{
		return getClaims(token).getSubject();
	}
	
	public boolean isVaildToken(String token)
	{
		return getClaims(token).getExpiration().after(new Date(System.currentTimeMillis()));
	}
	

	
}
