package com.nttdata;

public class LambsaExpression {
	
	public static void main(String[] args) {
		
		
		int width=10;
		
		
		//lambda Expression.
		
		Basic b=()->
		{
			System.out.println("Drawing width area is :"+width);
		};
		
		b.draw();
		
		//Tell class interface.
		
		Tell t=new Tell() {
			
			@Override
			public String say() {
				// TODO Auto-generated method stub
				return "returning the tell method.......";
			}
		};
		System.out.println(t.say());
	}

}
