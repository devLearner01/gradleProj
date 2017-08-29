package patternRefactoring;

import java.util.Date;

/**
 * This is the solution to the chainConstructors exercise
 *
 */
public class Loan {

	private Object strategy;
	private float notional;
	private float outstanding;
	private int rating;
	private Date expiry;
	private Date maturity;
	
	
	public Loan( 	String strategy, 
					float notional, 
					float outstanding, 
					int rating, 
					Date expiry,
					Date maturity ) {
	
		
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
		
		if( strategy.equals( "termROC" )) {
			this.strategy = new TermROC();
		}
		else if( strategy.equals( "revolvingTermROC" )) { 
			this.strategy = new RevolvingTermROC();
			this.maturity = maturity;
		}
		else {
			this.strategy = new CapitalStrategy();
			this.maturity = maturity;
		}
	}
	
	


	public Object getStrategy() {
		return strategy;
	}


	public void setStrategy( String strategy ) {
		this.strategy = strategy;
	}


	public float getNotional() {
		return notional;
	}


	public void setNotional( float notional ) {
		this.notional = notional;
	}


	public float getOutstanding() {
		return outstanding;
	}


	public void setOutstanding( float outstanding ) {
		this.outstanding = outstanding;
	}


	public int getRating() {
		return rating;
	}


	public void setRating( int rating ) {
		this.rating = rating;
	}


	public Date getExpiry() {
		return expiry;
	}


	public void setExpiry( Date expiry ) {
		this.expiry = expiry;
	}


	public Date getMaturity() {
		return maturity;
	}


	public void setMaturity( Date maturity ) {
		this.maturity = maturity;
	}
	
	
	
}
